package FoodDelivery.Payment;

public class CashOnDelivery implements Payment {
    @Override
    public void pay() {
        System.out.println("Cash On Delivery");
    }
}
