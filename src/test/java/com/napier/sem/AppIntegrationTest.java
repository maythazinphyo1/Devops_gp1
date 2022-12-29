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
class AppIntegrationTest
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
        assertEquals(country.get(0).getCountry_code(), "CHN", "Country code does not match expected value");
        assertEquals(country.get(0).getCountry_name(), "China", "Country name does not match expected value");
        assertEquals(country.get(0).getContinent(), "Asia", "Continent does not match expected value");
        assertEquals(country.get(0).getRegion(), "Eastern Asia", "Region does not match expected value");
        assertEquals(country.get(0).getPopulation(), 1277558000, "Population does not match expected value");
        assertEquals(country.get(0).getCity_name(), "Peking", "City name does not match expected value");


    }

    //Country in continent by population test
    @Test
    void testGetCountry_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getCountry_inContinent(con1,"Asia");
        assertEquals(country.get(0).getCountry_code(), "CHN", "Country code does not match expected value");
        assertEquals(country.get(0).getCountry_name(), "China", "Country name does not match expected value");
        assertEquals(country.get(0).getContinent(), "Asia", "Continent does not match expected value");
        assertEquals(country.get(0).getRegion(), "Eastern Asia", "Region does not match expected value");
        assertEquals(country.get(0).getPopulation(), 1277558000, "Population does not match expected value");
        assertEquals(country.get(0).getCity_name(), "Peking", "City name does not match expected value");


    }

    //Country in region by population test
    @Test
    void testGetCountry_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getCountry_inRegion(con1,"Southeast Asia");assertEquals(country.get(0).getCountry_code(), "IDN", "Country code does not match expected value");
        assertEquals(country.get(0).getCountry_name(), "Indonesia", "Country name does not match expected value");
        assertEquals(country.get(0).getContinent(), "Asia", "Continent does not match expected value");
        assertEquals(country.get(0).getRegion(), "Southeast Asia", "Region does not match expected value");
        assertEquals(country.get(0).getPopulation(), 212107000, "Population does not match expected value");
        assertEquals(country.get(0).getCity_name(), "Jakarta", "City name does not match expected value");


    }


    //Top N Country in world by population test
    @Test
    void testGetTopNCountry_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getTopNCountry_inWorld(con1, 10);
        assertEquals(country.get(0).getCountry_code(), "CHN", "Country code does not match expected value");
        assertEquals(country.get(0).getCountry_name(), "China", "Country name does not match expected value");
        assertEquals(country.get(0).getContinent(), "Asia", "Continent does not match expected value");
        assertEquals(country.get(0).getRegion(), "Eastern Asia", "Region does not match expected value");
        assertEquals(country.get(0).getPopulation(), 1277558000, "Population does not match expected value");
        assertEquals(country.get(0).getCity_name(), "Peking", "City name does not match expected value");


    }

    //Top N Country in continent by population test
    @Test
    void testGetTopNCountry_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getTopNCountry_inContinent(con1,  "Asia", 10);
        assertEquals(country.get(0).getCountry_code(), "CHN", "Country code does not match expected value");
        assertEquals(country.get(0).getCountry_name(), "China", "Country name does not match expected value");
        assertEquals(country.get(0).getContinent(), "Asia", "Continent does not match expected value");
        assertEquals(country.get(0).getRegion(), "Eastern Asia", "Region does not match expected value");
        assertEquals(country.get(0).getPopulation(), 1277558000, "Population does not match expected value");
        assertEquals(country.get(0).getCity_name(), "Peking", "City name does not match expected value");


    }

    //Top N Country in region by population test
    @Test
    void testGetTopNCountry_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = country_ct.getTopNCountry_inRegion(con1,  "Southeast Asia", 10);
        assertEquals(country.get(0).getCountry_code(), "IDN", "Country code does not match expected value");
        assertEquals(country.get(0).getCountry_name(), "Indonesia", "Country name does not match expected value");
        assertEquals(country.get(0).getContinent(), "Asia", "Continent does not match expected value");
        assertEquals(country.get(0).getRegion(), "Southeast Asia", "Region does not match expected value");
        assertEquals(country.get(0).getPopulation(), 212107000, "Population does not match expected value");
        assertEquals(country.get(0).getCity_name(), "Jakarta", "City name does not match expected value");


    }




    //city in world by population test
    @Test
    void testGetCity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inWorld(con1);
        assertEquals(city.get(0).getCity_name(), "Mumbai (Bombay)", "City name does not match expected value");
        assertEquals(city.get(0).getCountry_name(), "India", "Country name does not match expected value");
        assertEquals(city.get(0).getCity_district(), "Maharashtra", "City district does not match expected value");
        assertEquals(city.get(0).getCity_population(), 10500000, "City population does not match expected value");


    }

    //city in continent by population test
    @Test
    void testGetCity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inContinent(con1, "Asia");
        assertEquals(city.get(1).getCity_name(), "Seoul", "City name does not match expected value");
        assertEquals(city.get(1).getCountry_name(), "South Korea", "Country name does not match expected value");
        assertEquals(city.get(1).getCity_district(), "Seoul", "City district does not match expected value");
        assertEquals(city.get(1).getCity_population(), 9981619, "City population does not match expected value");


    }

    //city in region by population test
    @Test
    void testGetCity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inRegion(con1, "Caribbean");
        assertEquals(city.get(0).getCity_name(), "La Habana", "City name does not match expected value");
        assertEquals(city.get(0).getCountry_name(), "Cuba", "Country name does not match expected value");
        assertEquals(city.get(0).getCity_district(), "La Habana", "City district does not match expected value");
        assertEquals(city.get(0).getCity_population(), 2256000, "City population does not match expected value");

    }

    //city in country by population test
    @Test
    void testGetCity_inCountry()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inCountry(con1, "Japan");
        assertEquals(city.get(0).getCity_name(), "Tokyo", "City name does not match expected value");
        assertEquals(city.get(0).getCountry_name(), "Japan", "Country name does not match expected value");
        assertEquals(city.get(0).getCity_district(), "Tokyo-to", "City district does not match expected value");
        assertEquals(city.get(0).getCity_population(), 7980230, "City population does not match expected value");


    }

    //city in district by population test
    @Test
    void testGetCity_inDistrict()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getCity_inDistrict(con1, "England");
        assertEquals(city.get(0).getCity_name(), "London", "City name does not match expected value");
        assertEquals(city.get(0).getCountry_name(), "United Kingdom", "Country name does not match expected value");
        assertEquals(city.get(0).getCity_district(), "England", "City district does not match expected value");
        assertEquals(city.get(0).getCity_population(), 7285000, "City population does not match expected value");


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
        assertEquals(city.get(0).getCity_name(), "Tokyo", "City Name does not match expected value");
        assertEquals(city.get(0).getCountry_name(), "Japan","Country name does not match expected value");
        assertEquals(city.get(0).getCity_district(), "Tokyo-to","District does not match expected value");
        assertEquals(city.get(0).getCity_population(), 7980230,"Population does not match expected value");

    }

    //top N city in district by population test
    @Test
    void testGetTopNCity_inDistrict()
    {
        Connection con1 = app.getCon();
        ArrayList<City> city = ct.getTopNCity_inDistrict(con1, "England", 10);
        assertEquals(city.get(0).getCity_name(), "London", "City Name does not match expected value");
        assertEquals(city.get(0).getCountry_name(), "United Kingdom", "Country name does not match expected value");
        assertEquals(city.get(0).getCity_district(), "England", "District does not match expected value");
        assertEquals(city.get(0).getCity_population(), 7285000, "Population does not match expected value");

    }



    //Capital city in world by population test
    @Test
    void testGetCapitalcity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getCapitalcity_inWorld(con1);
        assertEquals(cap_city.get(0).getCity_name(), "Seoul","City Name does not match expected value");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea","Country Name does not match expected value");
        assertEquals(cap_city.get(0).getCity_population(), 9981619,"Population does not match expected value");

    }


    //Capital city in continent by population test
    @Test
    void testGetCapitalcity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getCapitalcity_inContinent(con1, "Asia");
        assertEquals(cap_city.get(0).getCity_name(), "Seoul","City Name does not match expected value");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea","Country Name does not match expected value");
        assertEquals(cap_city.get(0).getCity_population(), 9981619,"Population does not match expected value");

    }


    //Capital city in region by population test
    @Test
    void testGetCapitalcity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getCapitalcity_inRegion(con1, "Southeast Asia");
        assertEquals(cap_city.get(0).getCity_name(), "Jakarta","City Name does not match expected value");
        assertEquals(cap_city.get(0).getCountry_name() , "Indonesia","Country Name does not match expected value");
        assertEquals(cap_city.get(0).getCity_population(), 9604900,"Population does not match expected value");

    }

    //Top N Capital city in the world by population test
    @Test
    void testGetTopNCapitalcity_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getTopNCapitalcity_inWorld(con1, 10);
        assertEquals(cap_city.get(0).getCity_name(), "Seoul","City Name does not match expected value");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea","Country Name does not match expected value");
        assertEquals(cap_city.get(0).getCity_population(), 9981619,"Population does not match expected value");

    }

    //Top N Capital city in a continent by population test
    @Test
    void testGetTopNCapitalcity_inContinent()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getTopNCapitalcity_inContinent(con1,"Asia", 10);
        assertEquals(cap_city.get(0).getCity_name(), "Seoul","City Name does not match expected value");
        assertEquals(cap_city.get(0).getCountry_name() , "South Korea","Country Name does not match expected value");
        assertEquals(cap_city.get(0).getCity_population(), 9981619,"Population does not match expected value");

    }

    //Top N Capital city in a region by population test
    @Test
    void testGetTopNCapitalcity_inRegion()
    {
        Connection con1 = app.getCon();
        ArrayList<City> cap_city = cap_ct.getTopNCapitalcity_inRegion(con1,"Southeast Asia", 10);
        assertEquals(cap_city.get(0).getCity_name(), "Jakarta","City Name does not match expected value");
        assertEquals(cap_city.get(0).getCountry_name() , "Indonesia","Country Name does not match expected value");
        assertEquals(cap_city.get(0).getCity_population(), 9604900,"Population does not match expected value");

    }



    //The population of people living in cities and people not living in cities in each continent
    @Test
    void testGetCities_population_continent()
    {
        Connection con1 = app.getCon();
        ArrayList<Population> city_population = popinfo.getCities_population_continent(con1);
        assertEquals(city_population.get(0).getContinent(), "Asia","Continent does not match expected value");
        assertEquals(city_population.get(0).getPopulation() , 3705025700L,"Population does not match expected value");
        assertEquals(city_population.get(0).getCity_population(), 697604103L,"Population does not match expected value");
        assertEquals(city_population.get(0).getCities_population_percentage(), 18.828588F,"Population Percent does not match expected value");
        assertEquals(city_population.get(0).getPopulation_not_city(), 3007421597L,"Population does not match expected value");
        assertEquals(city_population.get(0).getNot_cities_population_percentage(), 81.17141F,"Population Percent does not match expected value");

    }


    //The population of people living in cities and people not living in cities in each region
    @Test
    void testGetCities_population_region()
    {
        Connection con1 = app.getCon();
        ArrayList<Population> city_population = popinfo.getCities_population_region(con1);
        assertEquals(city_population.get(0).getRegion(), "Eastern Asia","Continent does not match expected value");
        assertEquals(city_population.get(0).getPopulation() , 1507328000L,"Population does not match expected value");
        assertEquals(city_population.get(0).getCity_population(), 317476534L,"Population does not match expected value");
        assertEquals(city_population.get(0).getCities_population_percentage(), 21.062206F,"Population Percent does not match expected value");
        assertEquals(city_population.get(0).getPopulation_not_city(), 1189851466L,"Population does not match expected value");
        assertEquals(city_population.get(0).getNot_cities_population_percentage(), 78.93779F, "Population Percent does not match expected value");

    }



    //The population of people living in cities and people not living in cities in each country
    @Test
    void testGetCities_population_country()
    {
        Connection con1 = app.getCon();
        ArrayList<Population> city_population = popinfo.getCities_population_country(con1);
        assertEquals(city_population.get(0).getCountry_name(), "China","Continent does not match expected value");
        assertEquals(city_population.get(0).getPopulation() , 1277558000L, "Population does not match expected value");
        assertEquals(city_population.get(0).getCity_population(), 175953614L,"Population does not match expected value");
        assertEquals(city_population.get(0).getCities_population_percentage(), 13.772652F,"Population Percent does not match expected value");
        assertEquals(city_population.get(0).getPopulation_not_city(), 1101604386L,"Population does not match expected value");
        assertEquals(city_population.get(0).getNot_cities_population_percentage(), 86.22735F,"Population Percent does not match expected value");

    }



    //World Population report test
    @Test
    void testgetWorld_Population()
    {
        Connection con1 = app.getCon();
        Population world_pop = popinfo.getWorld_Population(con1);
        assertEquals(world_pop.getPopulation(),6078749450L, "World Population does not match expected value");
    }

    //Continent Population report test
    @Test
    void testgetContinent_Population()
    {
        Connection con1 = app.getCon();
        Population continent_pop = popinfo.getContinent_Population(con1,"Asia");
        assertEquals(continent_pop.getPopulation(),3705025700L, "Continent Population does not match expected value");
    }

    //Region Population report test
    @Test
    void testgetRegion_Population()
    {
        Connection con1 = app.getCon();
        Population region_pop = popinfo.getRegion_Population(con1,"Southeast Asia");
        assertEquals(region_pop.getPopulation(), 518541000L, "Region Population does not match expected value");

    }


    //Country Population report test
    @Test
    void testgetCountry_Population()
    {
        Connection con1 = app.getCon();
        Population country_pop = popinfo.getCountry_Population(con1,"China");
        assertEquals(country_pop.getPopulation(), 1277558000L, "Country Population does not match expected value");

    }


    //District Population report test
    @Test
    void testgetDistrict_Population()
    {
        Connection con1 = app.getCon();
        Population district_pop = popinfo.getDistrict_Population(con1,"England");
        assertEquals(district_pop.getPopulation(), 19978543L, "District Population does not match expected value");

    }


    //City Population report test
    @Test
    void testgetCity_Population()
    {
        Connection con1 = app.getCon();
        Population city_pop = popinfo.getCity_Population(con1,"Tokyo");
        assertEquals(city_pop.getPopulation(), 7980230, "City Population does not match expected value");

    }


    //The population of people who speak Chinese, English, Hindi, Spanish, Arabic.
    @Test
    void testGet_language_population()
    {
        Connection con1 = app.getCon();
        Population ctp = new Population();
        ctp.setPopulation(6078749450L);
        ArrayList<CountryLanguage> language_population = popinfo.get_language_population(con1, ctp);
        assertEquals(language_population.get(0).getLanguage(), "English", "Language does not match expected value");
        assertEquals(language_population.get(0).getPopulation(), 347077867L, "Population does not match expected value");
        assertEquals(language_population.get(0).getLanguage_population_percent(), 5.709692F, "Language population percent does not match expected value");


    }



}




