package com.synchronization;

class JavaBankOperationThreadOne extends Thread {
    BankOperation bp;

    JavaBankOperationThreadOne(BankOperation bp) {
        this.bp = bp;
    }

    public void run() {
        this.bp.withdraw(100);
    }
}