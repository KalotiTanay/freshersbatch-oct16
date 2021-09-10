package org.example;

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class bankAccount {

    public static double withdraw(double amount){
        //Pre-initializing the account balance to 15,000.
        double balance=15000;

        if(amount>15000)
            throw new InsufficientFundsException("Insufficient Balance");
        else balance=balance-amount;
        return balance;
    }

    public static void main(String[] args) {
        System.out.println(withdraw(10000));
    }
}

