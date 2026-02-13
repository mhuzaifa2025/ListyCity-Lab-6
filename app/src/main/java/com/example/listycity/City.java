package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 * It holds the name of the city and the province it belongs to.
 */

public class City implements Comparable {
    /**
     * This is a string variable which stores city name
     */
    private String city;
    /**
     * This is a string variable which stores province name
     */
    private String province;

    /**
     * Constructor for the City class.
     *
     * @param city     The name of the city
     * @param province The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     *
     * @return The city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     *
     * @return The province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city with another city for sorting.
     *
     * @param o The other city object to compare against
     * @return A negative integer, zero, or a positive integer.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
    /**
     * This compares two City objects for equality. Two cities are considered equal
     * if they have the same city name and belong to the same province.
     * This method is required for the correctly functioning of collection methods
     * such as contains() and remove() in the CityList class.
     * @param o The object to be compared with this City instance.
     * @return True if the object is a City with the same name and province; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }
    /**
     * Generates a hash code for the City object based on its name and province.
     * This ensures that two cities that are equal

     * @return An integer hash code value for this city.
     */

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}
