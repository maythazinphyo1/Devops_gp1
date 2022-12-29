package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;



/**
 * Author: Group1
 * Created date: Dec.22.2022
 * This class represents unit test for country
 */
class CountryTest
{
    static countries_info app;


    @BeforeAll
    static void init()
    {
        app = new countries_info();

    }

    /**
     * Test display country method is not null
     */
    @Test
    void displayCountryNull()
    {
        app.displayCountry(null);
    }

    /**
     * Test display country object is not null
     */
    @Test
    void displayCountryEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.displayCountry(countryList);
    }

    /**
     * unit test for array list with null member in it
     */
    @Test
    void displayCountryContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.displayCountry(countryList);
    }

    /**
     * unit test for display country information
     */
    @Test
    void displayCountry()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        Country ct = new Country();
        ct.setCountry_code("JPN");
        ct.setCountry_name("Japan");
        ct.setPopulation(126714000);
        ct.setRegion("Eastern Asia");
        ct.setCity_name("Tokyo");
        ct.setContinent("Asia");

        countryList.add(ct);
        app.displayCountry(countryList);
    } ///End of countries info unit testing

}