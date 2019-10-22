package com.itechart.lesson3;

class User {
    private String name;
    private Account account;

    User(String name) {
        this.name = name;
        account = new Account();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNme() {
        return name;
    }

    public int getBalance(String currency) {
        if (account == null) {
            return 0;
        }
        return account.getBalance(currency);
    }

    public void addToBalance(int amount, String currency) {
        if (account == null) {
            return;
        }
        account.addToBalance(amount, currency);
    }

    public int removeFromBalance(int amount, String currency) {
        if (account == null) {
            return 0;
        }
        return account.removeFromBalance(amount, currency);
    }
}
