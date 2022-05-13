package immutable;


public final class Address {

    final private String city;
    final private String country;
    final private Street street;

    public Address(String city, String country, Street street) {
        this.city = city;
        this.country = country;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Street getStreet() {
        return street;
    }
}
