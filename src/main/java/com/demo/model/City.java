package com.demo.model;

import java.util.Arrays;
import java.util.List;

public class City {
    private Integer cityId;
    private String cityName;

    public City(Integer cityid, String cityName) {
        this.cityId = cityid;
        this.cityName = cityName;
    }

    private static List<City> itOwner = Arrays.asList(
            new City(1, "Bangalore"),
            new City(2, "Hyderabad"),
            new City(3, "Pune")
    );

    public static City getById(Integer id) {
        return itOwner.stream().filter(city -> city.getCityId().equals(id)).findFirst().orElse(null);
    }

    public Integer getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }
}