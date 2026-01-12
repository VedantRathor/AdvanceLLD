package FoodDelivery.Location;

public class Location {
    private static Integer counter = 0;
    private final Integer locationId;
    private final String city;
    private final String country;
    private final String address;

    public Location(String city, String country, String address) {
        Location.counter++;
        this.locationId = Location.counter;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public static Integer getCounter() {
        return counter;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }
}
