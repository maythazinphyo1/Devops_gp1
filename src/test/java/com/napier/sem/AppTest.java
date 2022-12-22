package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static countries_info app;

    @BeforeAll
    static void init()
    {
        app = new countries_info();
    }

    //Test display country method is not null
    @Test
    void displayCountryNull()
    {
        app.displayCountry(null);
    }

    //Test display country object is not null
    @Test
    void displayCountryEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<Country>();
        app.displayCountry(countryList);
    }

    //
    @Test
    void displayCountryContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<Country>();
        countryList.add(null);
        app.displayCountry(countryList);
    }


    @Test
    void displayCountry()
    {
        ArrayList<Country> countryList = new ArrayList<Country>();
        Country ct = new Country();
        ct.setCountry_code("JPN");
        ct.setCountry_name("Japan");
        ct.setPopulation(126714000);
        ct.setRegion("Eastern Asia");
        ct.setCapital(1532);
        ct.setContinent("Asia");

        countryList.add(ct);
        app.displayCountry(countryList);
    }

}