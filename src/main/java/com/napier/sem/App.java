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
      //  city_info city = new city_info();

        //get and display
       // city.displayCity(city.getCity());



        //capital cities
        capitalcity_info capitalcity = new capitalcity_info();

        //get and display
        capitalcity.displayCapitalcity(capitalcity.getCapitalcity_inWorld());

        //capital cities in a continent
        capitalcity.displayCapitalcity(capitalcity.getCapitalcity_inContinent("Asia"));
        capitalcity.displayCapitalcity(capitalcity.getCapitalcity_inRegion("Southeast Asia"));

    }


}