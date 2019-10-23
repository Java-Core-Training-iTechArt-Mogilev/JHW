package lesson3;

class Account {
    private int id;
    private Bill[] bills;

    Account() {
        id = (int)(Math.random() * Integer.MAX_VALUE);
        bills = new Bill[] {
                new Bill("BY"),
                new Bill("USD"),
                new Bill("EURO") };
    }

    public int getId() {
        return id; }

    int getBalance(String currency) {
        for (Bill bill : bills) {
            if (bill.getCurrency() == currency) {
                return bill.getBalance();
            }
        }
        int i = 0;
        return i;
    }

    void addToBalance(int amount, String currency) {
        for (Bill bill : bills) {
            if (bill.getCurrency() == currency) {
                bill.addToBalance(amount);
                break;
            }
        }
    }

    int removeFromBalance(int amount, String currency) {
        for (Bill bill : bills)
            if (bill.getCurrency() == currency) {
                return bill.removeFromBalance(amount);
            }
        return 0;
    }
}
