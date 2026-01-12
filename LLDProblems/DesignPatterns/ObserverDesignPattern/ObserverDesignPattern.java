package DesignPatterns.ObserverDesignPattern;

class ObserverDesignPattern {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern running...");
        Observable iphoneObservable = new IphoneObservable();
        Observer observer1 = new IphoneObserver(iphoneObservable, "Vedant Rathore");
        Observer observer2 = new IphoneObserver(iphoneObservable, "Avishi Singh");
        Observer observer3 = new IphoneObserver(iphoneObservable, "James Bond");
        Observer observer4 = new IphoneObserver(iphoneObservable, "Amit Sharma");

        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        iphoneObservable.addObserver(observer3);
        iphoneObservable.addObserver(observer4);


        iphoneObservable.setStock(10);
        iphoneObservable.setStock(-4);
    }
}
