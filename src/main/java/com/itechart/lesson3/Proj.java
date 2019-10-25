package lesson3;

public class Proj {
    public static void main(String[] argv) {

        User name = new User("Petya");
        name.addToBalance(100, "USD");
        name.addToBalance(200, "BY");

        System.out.println("Firstly, " + name.getName() + " has " + name.getBalance("BY") + " BY in bank.");
        System.out.println("Firstly, " + name.getName() + " has " + name.getBalance("USD") + " USD in bank.");
        System.out.println("Firstly, " + name.getName() + " has " + name.getBalance("EURO") + " EURO in bank.");

        int gotBy = name.removeFromBalance(500, "BY");
        int gotUsd = name.removeFromBalance(500, "USD");
        int gotEuro = name.removeFromBalance(500, "EURO");

        System.out.println("Finally, " + name.getName() + " has " + name.getBalance("BY") + " BY in bank.");
        System.out.println("Finally, " + name.getName() + " has " + name.getBalance("USD") + " USD in bank.");
        System.out.println("Finally, " + name.getName() + " has " + name.getBalance("EURO") + " EURO in bank.");
    }
}