package lesson3;

class User {
    private String name;
    private Account account;

    User(String name) {
        this.name = name;
        account = new Account();
    }

    String getName() {
        return name;
    }

    int getBalance(String currency) {
        if (account == null) {
            return 0;
        }
        return account.getBalance(currency);
    }

    void addToBalance(int amount, String currency) {
        if (account == null) {
            return;
        }
        account.addToBalance(amount, currency);
    }

    int removeFromBalance(int amount, String currency) {
        if (account == null) {
            return 0;
        }
        return account.removeFromBalance(amount, currency);
    }
}
