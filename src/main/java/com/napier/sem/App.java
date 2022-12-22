package com.napier.sem;



public class App
{
    public static void main(String[] args)
    {
//------------------------------- START FOR COUNTRY INFO ------------------------------------------------------

        /*** Display country information sorted by population*/
        // Create instance for countries_info class
        countries_info ct = new countries_info();
        // Get and display country information organized by largest to the smallest population in the world
        //ct.displayCountry(ct.getCountry_inWorld());
        // all the countries in a continent organized by largest to the smallest population
        //ct.displayCountry(ct.getCountry_inContinent("Asia"));
        // all the countries in a region organized by largest to the smallest population
        //ct.displayCountry(ct.getCountry_inRegion("Southeast Asia"));
        // The top N populated countries in the world where N is provided by the user.
        //ct.displayCountry(ct.getTopNCountry_inWorld(10));
        // The top N populated countries in a continent where N is provided by the user.
        //ct.displayCountry(ct.getTopNCountry_inContinent("Asia",10));
        // The top N populated countries in a region where N is provided by the user.
        ct.displayCountry(ct.getTopNCountry_inRegion("Southeast Asia",10));


//----------------------------------- END OF COUNTRY INFO ------------------------------------------------------

// ----------------------------------- CITY AND TOP POPULATED START --------------------------------------------
        //cities
        city_info city = new city_info();
        // All the cities in the world organised by largest population to smallest.
        city.displayCity(city.getCity_inWorld());
        //All the cities in a continent organised by largest population to smallest.
        city.displayCity(city.getCity_inContinent("Asia"));
        //All the cities in a region organised by largest population to smallest.
        city.displayCity(city.getCity_inRegion("Caribbean"));
        // all the countries in a country organized by largest to the smallest population
        city.displayCity(city.getCity_inCountry("Japan"));
        //All the cities in a district organised by largest population to smallest.
        city.displayCity(city.getCity_inDistrict("England"));

        // The top N populated cities in the world where N is provided by the user.
        city.displayCity(city.getTopNCity_inWorld(10));
        // The top N populated cities in a continent where N is provided by the user.
        city.displayCity(city.getTopNCity_inContinent("Asia",10));
        // The top N populated cities in a region where N is provided by the user.
        city.displayCity(city.getTopNCity_inRegion("Caribbean",10));
        // The top N populated cities in a country where N is provided by the user.
        city.displayCity(city.getTopNCity_inCountry("Japan", 10));
        // The top N populated cities in a district where N is provided by the user.
        city.displayCity(city.getTopNCity_inDistrict("England",10));
    }
// ----------------------------------- CITY AND TOP POPULATED END --------------------------------------------

}