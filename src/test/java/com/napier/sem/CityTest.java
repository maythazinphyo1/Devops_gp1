package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CityTest {


    static city_info city;

    @BeforeAll
    static void init()
    {

        city = new city_info();
    }
    //Test display city method is not null
    @Test
    void displayCityNull()
    {
        city.displayCity(null);
    }

    //Test display country object is not null
    @Test
    void displayCityEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        city.displayCity(cityList);
    }

    @Test
    void displayCityContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        city.displayCity(cityList);
    }

    @Test
    void displayCity()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City ct = new City();
        ct.setCity_name("Tokyo");
        ct.setCountry_name("Japan");
        ct.setCity_district("Tokyo-to");
        ct.setCity_population(7980230);

        cityList.add(ct);
        city.displayCity(cityList);
    }

}
