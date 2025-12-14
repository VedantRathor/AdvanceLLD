package DesignPatterns.ObserverDesignPattern;

public interface Observable {
    void setStock(Integer quantity);
    Integer getStock();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
