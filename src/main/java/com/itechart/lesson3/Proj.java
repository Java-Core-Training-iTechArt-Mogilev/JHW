package com.itechart.lesson3;

public class Proj
{
    public static void main(String[] argv) {

        User petya = new User("Petya");
        petya.addToBalance(100, "USD");
        petya.addToBalance(200, "BY");

        petya.addToBalance(100, "BY");
        petya.addToBalance(100, "USD");

        System.out.println(petya.getNme() + " has " + petya.getBalance("BY") + " BY in bank.");
        System.out.println(petya.getNme() + " has " + petya.getBalance("USD") + " USD in bank.");
        System.out.println(petya.getNme() + " has " + petya.getBalance("EURO") + " EURO in bank.");

        int gotBy = petya.removeFromBalance(500, "BY");
        int gotUsd = petya.removeFromBalance(500, "USD");
        int gotEuro = petya.removeFromBalance(500, "EURO");

        System.out.println(petya.getNme() + " got " + gotBy + " BY from bank.");
        System.out.println(petya.getNme() + " got " + gotUsd + " USD from bank.");
        System.out.println(petya.getNme() + " got " + gotEuro + " EURO from bank.");

        System.out.println(petya.getNme() + " has " + petya.getBalance("BY") + " BY in bank.");
        System.out.println(petya.getNme() + " has " + petya.getBalance("USD") + " USD in bank.");
        System.out.println(petya.getNme() + " has " + petya.getBalance("EURO") + " EURO in bank.");
    }
}