package DesignPatterns.DecoratorDesignPattern;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita with";
    }

    @Override
    public Integer getCost() {
        return 100;
    }
}
