package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityIntegrationTest {
    static DB_connect app;
    static city_info ct;


    @BeforeAll
    static void init()
    {
        ct = new city_info();
        app = new DB_connect();
        app.connect("localhost:33060", 30000);

    }
    @Test
    void testGetCity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inWorld(con1);
        assertEquals(city.get(0).getCity_name(), "Mumbai (Bombay)");
        assertEquals(city.get(0).getCountry_name(), "India");
        assertEquals(city.get(0).getCity_district(), "Maharashtra");
        assertEquals(city.get(0).getCity_population(), 10500000);

    }
    @Test
    void testGetCity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inContinent(con1, "Asia");
        assertEquals(city.get(1).getCity_name(), "Seoul");
        assertEquals(city.get(1).getCountry_name(), "South Korea");
        assertEquals(city.get(1).getCity_district(), "Seoul");
        assertEquals(city.get(1).getCity_population(), 9981619);

    }
    @Test
    void testGetCity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inRegion(con1, "Caribbean");
        assertEquals(city.get(0).getCity_name(), "La Habana");
        assertEquals(city.get(0).getCountry_name(), "Cuba");
        assertEquals(city.get(0).getCity_district(), "La Habana");
        assertEquals(city.get(0).getCity_population(), 2256000);

    }
    @Test
    void testGetCity_inCountry()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inCountry(con1, "Japan");
        assertEquals(city.get(0).getCity_name(), "Tokyo");
        assertEquals(city.get(0).getCountry_name(), "Japan");
        assertEquals(city.get(0).getCity_district(), "Tokyo-to");
        assertEquals(city.get(0).getCity_population(), 7980230);

    }
    @Test
    void testGetCity_inDistrict()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inDistrict(con1, "England");
        assertEquals(city.get(0).getCity_name(), "London");
        assertEquals(city.get(0).getCountry_name(), "United Kingdom");
        assertEquals(city.get(0).getCity_district(), "England");
        assertEquals(city.get(0).getCity_population(), 7285000);

    }
    @Test
    void testGetTopNCity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getTopNCity_inWorld(con1, 10);
        assertEquals(city.get(0).getCity_name(), "Mumbai (Bombay)");
        assertEquals(city.get(0).getCountry_name(), "India");
        assertEquals(city.get(0).getCity_district(), "Maharashtra");
        assertEquals(city.get(0).getCity_population(), 10500000);

    }
    @Test
    void testGetTopNCity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getTopNCity_inContinent(con1, "Asia", 10);
        assertEquals(city.get(1).getCity_name(), "Seoul");
        assertEquals(city.get(1).getCountry_name(), "South Korea");
        assertEquals(city.get(1).getCity_district(), "Seoul");
        assertEquals(city.get(1).getCity_population(), 9981619);

    }
    @Test
    void testGetTopNCity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getTopNCity_inRegion(con1, "Caribbean", 10);
        assertEquals(city.get(0).getCity_name(), "La Habana");
        assertEquals(city.get(0).getCountry_name(), "Cuba");
        assertEquals(city.get(0).getCity_district(), "La Habana");
        assertEquals(city.get(0).getCity_population(), 2256000);

    }
    @Test
    void testGetTopNCity_inCountry()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getTopNCity_inCountry(con1, "Japan", 10);
        assertEquals(city.get(0).getCity_name(), "Tokyo");
        assertEquals(city.get(0).getCountry_name(), "Japan");
        assertEquals(city.get(0).getCity_district(), "Tokyo-to");
        assertEquals(city.get(0).getCity_population(), 7980230);

    }
    @Test
    void testGetTopNCity_inDistrict()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getTopNCity_inDistrict(con1, "England", 10);
        assertEquals(city.get(0).getCity_name(), "London");
        assertEquals(city.get(0).getCountry_name(), "United Kingdom");
        assertEquals(city.get(0).getCity_district(), "England");
        assertEquals(city.get(0).getCity_population(), 7285000);

    }

}
