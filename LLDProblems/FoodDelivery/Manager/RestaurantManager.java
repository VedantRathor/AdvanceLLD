package FoodDelivery.Manager;

import FoodDelivery.Menu.Menu;
import FoodDelivery.Restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RestaurantManager {
    private static RestaurantManager restaurantManager;
    private List<Restaurant> restaurantList;


    private RestaurantManager() {

    }

    public static RestaurantManager getInstance() {
        if (restaurantManager == null) {
            restaurantManager = new RestaurantManager();
        }

        return restaurantManager;
    }
    public void addRestaurant(Restaurant restaurant) {
        if (restaurantList == null) { this.restaurantList = new ArrayList<>(); }
        this.restaurantList.add(restaurant);
    }

    public List<Menu> getMenuItems(Restaurant restaurant) {
        return restaurant.getMenuList();
    }

    public List<Restaurant> getRestaurantList(String locationName) {
        return restaurantList.stream().filter((res) -> Objects.equals(res.getLocation().getCity(), locationName)).toList();
    }
}
