package FoodDelivery.Order;

import FoodDelivery.Payment.Payment;
import FoodDelivery.Restaurant.Restaurant;
import FoodDelivery.User.User;

public class Order {
    private static int counter = 0;
    private Integer orderId;
    private User user;
    private Restaurant restaurant;
    private OrderType orderType;
    private Payment payment;

    public Order(User user, Restaurant restaurant, OrderType orderType, Payment payment) {
        counter ++;
        this.orderId = counter;
        this.user = user;
        this.restaurant = restaurant;
        this.orderType = orderType;
        this.payment = payment;
    }

    public boolean pay() {
        System.out.println("Paying for total: " + this.user.getCart().getTotal());
        payment.pay();
        return true;
    }
}
