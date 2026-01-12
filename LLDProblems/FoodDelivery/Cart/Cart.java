package FoodDelivery.Cart;

import FoodDelivery.Menu.Menu;
import FoodDelivery.Restaurant.Restaurant;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Restaurant restaurant;
    private final List<Menu> selectedItems;

    public Cart() {
        restaurant = null;
        selectedItems = new ArrayList<>();
    }

    public void addToCart(Menu item) {
        this.selectedItems.add(item);
    }
    public double getTotal() {
        double total = 0;
        for (Menu selectedItem : selectedItems) {
            total += selectedItem.getPrice();
        }

        return (total);
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public boolean isEmpty() {
        return selectedItems.isEmpty();
    }

}
