package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static DB_connect app;
    static countries_info ct;
    static capitalcity_info cap_ct = new capitalcity_info();


    @BeforeAll
    static void init()
    {
        ct = new countries_info();
        app = new DB_connect();
        app.connect("localhost:33060", 30000);

    }

    //Country in world by population test
    @Test
    void testGetCountry_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getCountry_inWorld(con1);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCapital(), 1891);

    }

    //Country in continent by population test
    @Test
    void testGetCountry_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getCountry_inContinent(con1,"Asia");
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCapital(), 1891);

    }

    //Country in region by population test
    @Test
    void testGetCountry_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getCountry_inRegion(con1,"Southeast Asia");
        assertEquals(country.get(0).getCountry_code(), "IDN");
        assertEquals(country.get(0).getCountry_name(), "Indonesia");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Southeast Asia");
        assertEquals(country.get(0).getPopulation(), 212107000);
        assertEquals(country.get(0).getCapital(), 939);

    }


    //Top N Country in world by population test
    @Test
    void testGetTopNCountry_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getTopNCountry_inWorld(con1, 10);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCapital(), 1891);

    }

    //Top N Country in continent by population test
    @Test
    void testGetTopNCountry_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getTopNCountry_inContinent(con1,  "Asia", 10);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCapital(), 1891);

    }

    //Top N Country in region by population test
    @Test
    void testGetTopNCountry_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getTopNCountry_inRegion(con1,  "Southeast Asia", 10);
        assertEquals(country.get(0).getCountry_code(), "IDN");
        assertEquals(country.get(0).getCountry_name(), "Indonesia");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Southeast Asia");
        assertEquals(country.get(0).getPopulation(), 212107000);
        assertEquals(country.get(0).getCapital(), 939);

    }



    //Capital city in world by population test
    @Test
    void testGetCapitalcity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getCapitalcity_inWorld(con1);
        assertEquals(cap_city.get(0).getCity_name(), "Seoul");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea");
        assertEquals(cap_city.get(0).getCity_population(), 9981619);

    }


    //Capital city in continent by population test
    @Test
    void testGetCapitalcity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getCapitalcity_inContinent(con1, "Asia");
        assertEquals(cap_city.get(0).getCity_name(), "Seoul");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea");
        assertEquals(cap_city.get(0).getCity_population(), 9981619);

    }


    //Capital city in region by population test
    @Test
    void testGetCapitalcity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getCapitalcity_inRegion(con1, "Southeast Asia");
        assertEquals(cap_city.get(0).getCity_name(), "Jakarta");
        assertEquals(cap_city.get(0).getCountry_name() , "Indonesia");
        assertEquals(cap_city.get(0).getCity_population(), 9604900);

    }


}
