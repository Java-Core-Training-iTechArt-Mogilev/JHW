package com.itechart.lesson3;

class Bill {
    private int balance;
    private String currency;

    Bill (String currency) {
        balance = 0;
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void addToBalance(int value) {
        balance += value;
        if (balance < 0) {
            balance = 0;
        }
    }

    public int removeFromBalance (int value) {
        int oldBalance = balance;
        balance -= value;
        if (balance < 0) {
            balance = 0;
        }
        return (oldBalance - balance);
    }
}