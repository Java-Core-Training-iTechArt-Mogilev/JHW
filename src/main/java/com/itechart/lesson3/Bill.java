package lesson3;

class Bill {
    private int balance;
    private String currency;

    Bill (String currency) {
        balance = 0;
        this.currency = currency;
    }

    int getBalance() {
        return balance;
    }

    String getCurrency() {
        return currency;
    }

    void addToBalance(int value) {
        balance += value;
        if (balance < 0) {
            balance = 0;
        }
    }

    int removeFromBalance(int value) {
        int oldBalance = balance;
        balance -= value;
        if (balance < 0) {
            balance = 0;
        }
        return (oldBalance - balance);
    }
}