package FoodDelivery;

import FoodDelivery.Location.Location;
import FoodDelivery.Manager.RestaurantManager;
import FoodDelivery.Menu.Menu;
import FoodDelivery.Order.Order;
import FoodDelivery.Order.OrderType;
import FoodDelivery.Payment.Payment;
import FoodDelivery.Restaurant.Restaurant;
import FoodDelivery.User.User;

import java.util.List;

public class FoodDelivery {
    private RestaurantManager restaurantManager;

    public FoodDelivery() {
        initialize();
    }

    private void initialize() {
        restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(
                new Restaurant(new Location("Pune", "India", "ABC99"), List.of(
                        new Menu("101", "Pizza", 123.00),
                        new Menu("102", "Coffee", 150.33),
                        new Menu("103", "Chole Bhature", 180.22),
                        new Menu("104", "Dosa", 199.00),
                        new Menu("105", "Idli", 80.00)
                ),
                        "MINDLL"
                )
        );

        restaurantManager.addRestaurant(
                new Restaurant(new Location("Pune", "India", "ABC99"), List.of(
                        new Menu("101", "Pizza", 123.00),
                        new Menu("102", "Coffee", 150.33),
                        new Menu("104", "Dosa", 199.00),
                        new Menu("105", "Idli", 80.00)
                ),
                        "PICKEQ"
                )
        );

        restaurantManager.addRestaurant(
                new Restaurant(new Location("Pune", "India", "ABC99"), List.of(
                        new Menu("101", "Pizza", 123.00),
                        new Menu("103", "Chole Bhature", 180.22),
                        new Menu("104", "Dosa", 199.00),
                        new Menu("105", "Idli", 80.00)
                ),
                        "RAJWRT"
                )
        );
    }

    public List<Restaurant> getByLocation(String name) {
        List<Restaurant> list = restaurantManager.getRestaurantList(name);

        System.out.println("SHOWING RESTAURANTS");
        for (Restaurant restaurant: list) {
            System.out.println(restaurant.getRestaurantId() + ": " + restaurant.getName());
        }

        return list;
    }

    public void selectRestaurant(User user, Restaurant restaurant) {
        System.out.println("Selected: " + restaurant.getRestaurantId() + ": " + restaurant.getName());
        user.getCart().setRestaurant(restaurant);
    }

    public List<Menu> showAllMenuItems(Restaurant restaurant) {
        return restaurantManager.getMenuItems(restaurant);
    }

    public Order checkout(User user, Restaurant restaurant, Payment payment, OrderType orderType) {
        return new Order(user, restaurant, orderType, payment);
    }

    public boolean payForOrder(Order order) {
        return order.pay();
    }

    public void addItem(User user, Menu item) {
        System.out.println("Choose " + item.getName() + "having price " + item.getPrice());
        user.getCart().addToCart(item);
    }
}
