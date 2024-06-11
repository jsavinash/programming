package com.synchronization;

class JavaBankOperationThreadTwo extends Thread {
    BankOperation bp;

    JavaBankOperationThreadTwo(BankOperation bp) {
        this.bp = bp;
    }

    public void run() {
        this.bp.deposit(1000);
    }
}