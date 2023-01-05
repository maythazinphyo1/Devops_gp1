package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Author: Group1
 * Created date: Dec.22.2022
 * This class represents unit test for city
 */
class CityTest {

    static city_info city;

    @BeforeAll
    static void init()
    {

        city = new city_info();
    }

    /**
     * This method is to test displayCity method is not null
     */
    @Test
    void displayCityNull()
    {
        city.displayCity(null);
    }


    /**
     * This method is to test displayCity object is not null
     */
    @Test
    void displayCityEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        city.displayCity(cityList);
    }

    /**
     * unit testing for array list with null member in it
     */
    @Test
    void displayCityContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        city.displayCity(cityList);
    }

    /**
     * This is the unit testing for displayCity method
     */
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
