package com.napier.sem;



public class App
{
    public static void main(String[] args)
    {
        /*
         * Display country information sorted by population
         */
        // Create instance for countries_info class
    //    countries_info ct = new countries_info();
        // Get and display country information organized by largest to the smallest population in the world
     //   ct.displayCountry(ct.getCountry());

        // all the countries in a continent organized by largest to the smallest population
     //   ct.displayCountry(ct.getCountry_inContinent("Asia"));

        //cities
        city_info city = new city_info();

        //get and display

// ------------------------- CITY --------------------------------------------
 //       city.displayCity(city.getCity_inWorld());

//        city.displayCity(city.getCity_inContinent("Asia"));
//
//        city.displayCity(city.getCity_inRegion("Caribbean"));
//
//        // all the countries in a continent organized by largest to the smallest population
//        city.displayCity(city.getCity_inCountry("Japan"));
//
//        city.displayCity(city.getCity_inDistrict("England"));

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


}