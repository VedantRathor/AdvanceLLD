package FoodDelivery.Payment;

public class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("UPI payment");
    }
}
