package DesignPatterns.DecoratorDesignPattern;

public class Mushroom extends Decorator {
    private final Pizza pizza;
    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    @Override
    public Integer getCost() {
        return 10 + pizza.getCost();
    }
}
