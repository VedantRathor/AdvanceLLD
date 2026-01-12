package FoodDelivery.Notification;

import FoodDelivery.User.User;

public class Notification {
    public static void notifyUser(User user) {
        System.out.println("Notifying user: " + user.getName() + " and email: " + user.getEmail());
    }
}
