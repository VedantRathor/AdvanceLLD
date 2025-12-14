package DesignPatterns.DecoratorDesignPattern;

public class Toppings extends Decorator {
    private final Pizza pizza;

    public Toppings(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Toppings";
    }

    @Override
    public Integer getCost() {
        return 20 + pizza.getCost();
    }
}
