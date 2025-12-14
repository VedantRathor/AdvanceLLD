package DesignPatterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern working fine...");
        Pizza pizza = new Toppings(new Mushroom(new Margherita()));
        System.out.println(pizza.getDescription());
    }
}
