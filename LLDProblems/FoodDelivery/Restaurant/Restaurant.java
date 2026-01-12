package FoodDelivery.Restaurant;

import FoodDelivery.Location.Location;
import FoodDelivery.Menu.Menu;

import java.util.List;

public class Restaurant {
    private static Integer counter = 0;
    private Integer restaurantId;
    private String name;
    private Location location;
    private List<Menu> menuList;

    public Restaurant(Location location, List<Menu> menuList, String name) {
        counter ++;
        this.restaurantId = counter;
        this.location = location;
        this.menuList = menuList;
        this.name = name;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public Location getLocation() {
        return location;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public String getName() {
        return name;
    }
}
