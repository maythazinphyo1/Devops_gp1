package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Group1
 * Created date: Dec.23.2022
 * This class represents integration test
 */
public class AppIntegrationTest
{
    static DB_connect app;
    static countries_info country_ct = new countries_info();
    static capitalcity_info cap_ct = new capitalcity_info();
    static city_info ct = new city_info();
    static population_info popinfo = new population_info();


    @BeforeAll
    static void init()
    {

        app = new DB_connect();
        app.connect("localhost:33060", 30000);

    }

    //Country in world by population test
    @Test
    void testGetCountry_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getCountry_inWorld(con1);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCity_name(), "Peking");

    }

    //Country in continent by population test
    @Test
    void testGetCountry_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getCountry_inContinent(con1,"Asia");
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCity_name(), "Peking");

    }

    //Country in region by population test
    @Test
    void testGetCountry_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getCountry_inRegion(con1,"Southeast Asia");
        assertEquals(country.get(0).getCountry_code(), "IDN");
        assertEquals(country.get(0).getCountry_name(), "Indonesia");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Southeast Asia");
        assertEquals(country.get(0).getPopulation(), 212107000);
        assertEquals(country.get(0).getCity_name(), "Jakarta");

    }


    //Top N Country in world by population test
    @Test
    void testGetTopNCountry_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getTopNCountry_inWorld(con1, 10);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCity_name(), "Peking");

    }

    //Top N Country in continent by population test
    @Test
    void testGetTopNCountry_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getTopNCountry_inContinent(con1,  "Asia", 10);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCity_name(), "Peking");

    }

    //Top N Country in region by population test
    @Test
    void testGetTopNCountry_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getTopNCountry_inRegion(con1,  "Southeast Asia", 10);
        assertEquals(country.get(0).getCountry_code(), "IDN");
        assertEquals(country.get(0).getCountry_name(), "Indonesia");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Southeast Asia");
        assertEquals(country.get(0).getPopulation(), 212107000);
        assertEquals(country.get(0).getCity_name(), "Jakarta");

    }




    //city in world by population test
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

    //city in continent by population test
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

    //city in region by population test
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

    //city in country by population test
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

    //city in district by population test
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

    //top N city in world by population test
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

    //top N city in continent by population test
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

    //top N city in region by population test
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

    //top N city in country by population test
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

    //top N city in district by population test
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

    //Top N Capital city in the world by population test
    @Test
    void testGetTopNCapitalcity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getTopNCapitalcity_inWorld(con1, 10);
        assertEquals(cap_city.get(0).getCity_name(), "Seoul");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea");
        assertEquals(cap_city.get(0).getCity_population(), 9981619);

    }

    //Top N Capital city in a continent by population test
    @Test
    void testGetTopNCapitalcity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getTopNCapitalcity_inContinent(con1,"Asia", 10);
        assertEquals(cap_city.get(0).getCity_name(), "Seoul");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea");
        assertEquals(cap_city.get(0).getCity_population(), 9981619);

    }

    //Top N Capital city in a region by population test
    @Test
    void testGetTopNCapitalcity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getTopNCapitalcity_inRegion(con1,"Southeast Asia", 10);
        assertEquals(cap_city.get(0).getCity_name(), "Jakarta");
        assertEquals(cap_city.get(0).getCountry_name() , "Indonesia");
        assertEquals(cap_city.get(0).getCity_population(), 9604900);

    }

    //World Population report test
    @Test
    void testgetWorld_Population()
    {
        Connection con1 = app.getCon();
        Population world_pop = popinfo.getWorld_Population(con1);
        assertEquals(world_pop.getPopulation(),6078749450L);
    }

    //Continent Population report test
    @Test
    void testgetContinent_Population()
    {
        Connection con1 = app.getCon();
        Population continent_pop = popinfo.getContinent_Population(con1,"Asia");
        assertEquals(continent_pop.getPopulation(),3705025700L);
    }

    //Region Population report test
    @Test
    void testgetRegion_Population()
    {
        Connection con1 = app.getCon();
        Population region_pop = popinfo.getRegion_Population(con1,"Southeast Asia");
        assertEquals(region_pop.getPopulation(),518541000L);
    }


    //Country Population report test
    @Test
    void testgetCountry_Population()
    {
        Connection con1 = app.getCon();
        Population country_pop = popinfo.getCountry_Population(con1,"China");
        assertEquals(country_pop.getPopulation(),1277558000L);
    }


    //District Population report test
    @Test
    void testgetDistrict_Population()
    {
        Connection con1 = app.getCon();
        Population district_pop = popinfo.getDistrict_Population(con1,"England");
        assertEquals(district_pop.getPopulation(),19978543L);

    }


    //City Population report test
    @Test
    void testgetCity_Population()
    {
        Connection con1 = app.getCon();
        Population city_pop = popinfo.getCity_Population(con1,"Tokyo");
        assertEquals(city_pop.getPopulation(),7980230);

    }

}




