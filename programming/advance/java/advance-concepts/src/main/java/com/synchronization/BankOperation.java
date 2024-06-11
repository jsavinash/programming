package com.synchronization;

class BankOperation {
    int amount = 0;

    synchronized void withdraw(int withdrawAmount) {
        System.out.println("going to withdraw...");
        if (withdrawAmount > amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            this.amount -= withdrawAmount;
            System.out.println("withdraw completed...");
        }
    }

    synchronized void deposit(int depositAmount) {
        System.out.println("going to deposit...");
        this.amount += depositAmount;
        System.out.println("deposit completed... ");
        notify();
    }
}