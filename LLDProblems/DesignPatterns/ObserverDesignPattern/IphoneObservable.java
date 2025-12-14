package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    private Integer stockQuantity;
    private List<Observer> observerList;

    public IphoneObservable() {
        this.stockQuantity = 0;
        this.observerList = new ArrayList<>();
    }
    @Override
    public void setStock(Integer quantity) {
        this.stockQuantity += quantity;
        this.notifyUsers();
    }

    @Override
    public Integer getStock() {
        return this.stockQuantity;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    private void notifyUsers() {
        for (Observer observer: observerList) {
            observer.update();
        }
    }
}
