package com.data_structures_2.array.skip_list;
import java.util.Random;

class SkipList<T extends Comparable<? super T>> {
    private static final double P = 0.5; // Probability for level generation
    private static final int MAX_LEVEL = 16; // Maximum levels allowed

    private final SkipListNode<T> head;
    private int level;
    private final Random random;

    public SkipList() {
        this.head = new SkipListNode<>(null, MAX_LEVEL);
        this.level = 0;
        this.random = new Random();
    }

    private int randomLevel() {
        int lvl = 0;
        while (random.nextDouble() < P && lvl < MAX_LEVEL) {
            lvl++;
        }
        return lvl;
    }

    public void insert(T value) {
        SkipListNode<T>[] update = new SkipListNode[MAX_LEVEL + 1];
        SkipListNode<T> current = head;

        // Locate insertion point
        // Iterating level from top to bottom and navigate to last node.
        for (int i = level; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value.compareTo(value) < 0) {
                current = current.forward[i];
            }
            update[i] = current;
        }

        // Insert new node
        int newLevel = randomLevel();
        if (newLevel > level) {
            for (int i = level + 1; i <= newLevel; i++) {
                update[i] = head;
            }
            level = newLevel;
        }

        SkipListNode<T> newNode = new SkipListNode<>(value, newLevel);
        for (int i = 0; i <= newLevel; i++) {
            newNode.forward[i] = update[i].forward[i];
            update[i].forward[i] = newNode;
        }
    }

    public boolean search(T value) {
        SkipListNode<T> current = head;

        for (int i = level; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value.compareTo(value) < 0) {
                current = current.forward[i];
            }
        }
        current = current.forward[0];

        return current != null && current.value.compareTo(value) == 0;
    }

    public void delete(T value) {
        SkipListNode<T>[] update = new SkipListNode[MAX_LEVEL + 1];
        SkipListNode<T> current = head;

        for (int i = level; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value.compareTo(value) < 0) {
                current = current.forward[i];
            }
            update[i] = current;
        }

        current = current.forward[0];

        if (current != null && current.value.compareTo(value) == 0) {
            for (int i = 0; i <= level; i++) {
                if (update[i].forward[i] != current) break;
                update[i].forward[i] = current.forward[i];
            }
            while (level > 0 && head.forward[level] == null) {
                level--;
            }
        }
    }

    public void print() {
        for (int i = 0; i <= level; i++) {
            SkipListNode<T> node = head.forward[i];
            System.out.print("Level " + i + ": ");
            while (node != null) {
                System.out.print(node.value + " ");
                node = node.forward[i];
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SkipList<Integer> skipList = new SkipList<>();

        skipList.insert(3);
        skipList.insert(6);
        skipList.insert(7);
        skipList.insert(9);
        skipList.insert(12);
        skipList.insert(19);

        System.out.println("Skip List after insertions:");
        skipList.print();

        System.out.println("\nSearch for 7: " + skipList.search(7));
        System.out.println("Search for 15: " + skipList.search(15));

        skipList.delete(6);
        System.out.println("\nSkip List after deletion of 6:");
        skipList.print();
    }
}