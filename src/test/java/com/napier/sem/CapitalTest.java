package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CapitalTest {
    static capitalcity_info capital;


    @BeforeAll
    static void init()
    {
        capital = new capitalcity_info();

    }

    //Test displayCapitalCity method is not null
    @Test
    void displayCapitalCityNull()
    {

        capital.displayCapitalcity(null);
    }

    //Test display capitalCity object is not null
    @Test
    void displayCapitalCityEmpty()
    {
        ArrayList<City> capitalcityList = new ArrayList<>();
        capital.displayCapitalcity(capitalcityList);
    }

    //
    @Test
    void displayCapitalCityContainsNull()
    {
        ArrayList<City> capitalcityList = new ArrayList<>();
        capitalcityList.add(null);
        capital.displayCapitalcity(capitalcityList);
    }


    @Test
    void displayCapitalCity()
    {
        ArrayList<City> capitalcityList = new ArrayList<>();
        City ct = new City();
        ct.setCity_name("Tokyo");
        ct.setCountry_name("Japan");
        ct.setCity_population(126714000);
        capitalcityList.add(ct);
        capital.displayCapitalcity(capitalcityList);

    }
}
