package DesignPatterns.ObserverDesignPattern;

public class IphoneObserver implements Observer {
    private String name;
    private final Observable iphoneObservable;
    public IphoneObserver(Observable iphoneObservable, String name) {
        this.iphoneObservable = iphoneObservable;
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Notified to " + this.name);
        System.out.println("Stock quantity is: " + iphoneObservable.getStock());
    }
}
