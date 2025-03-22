package com.control_statement;

class ControlStatement {
    public static void main(String args[]) {
        //if / else
        int age = 18;
        if (age > 17) {
            System.out.println("Valid voter");
        } else {
            System.out.println("In valid voter");
        }
        //switch case
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Default");
                break;
        }
       //for loop
        for(int i = 0; i < 5; i++){
            System.out.println(i)
        }

        //while loop
        int count = 0;
        while (count < 5) {
            System.out.println("count" + count);
            count++;
        }

        //do while loop
        int count2 = 0;
        do {
            System.out.println("count" + count2);
            count2++;
        } while (count2 < 5);
    }
}