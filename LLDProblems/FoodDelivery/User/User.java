package FoodDelivery.User;

import FoodDelivery.Cart.Cart;

public class User {
    private static Integer counter = 0;
    private Integer id;
    private String name;
    private String email;
    private Cart cart;

    public User(String name, String email) {
        counter ++;
        this.id = counter;
        this.name = name;
        this.email = email;
        cart = new Cart();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Cart getCart() {
        return cart;
    }
}
