package com.synchronization;

class JavaInterThreadCommunication {
    public static void main(String[] args) {
        BankOperation bp = new BankOperation();
        JavaBankOperationThreadOne withdraw = new JavaBankOperationThreadOne(bp);
        JavaBankOperationThreadTwo deposit = new JavaBankOperationThreadTwo(bp);
        withdraw.start();
        deposit.start();
    }
}