package com.napier.sem;


import java.sql.Connection;

public class App
{
    public static void main(String[] args)
    {
     //SQL database connection connected
        DB_connect db = new DB_connect();
        Connection con1;
        db.connect();
        con1= db.getCon();


//------------------------------- START FOR COUNTRY INFO ------------------------------------------------------

        // Create instance for countries_info class
        countries_info ct = new countries_info();
        // Get and display country information organized by largest to the smallest population in the world
        ct.displayCountry(ct.getCountry_inWorld(con1));
/*
        // all the countries in a continent organized by largest to the smallest population
        ct.displayCountry(ct.getCountry_inContinent(con1, "Asia"));
        // all the countries in a region organized by largest to the smallest population
        ct.displayCountry(ct.getCountry_inRegion(con1, "Southeast Asia"));
        // The top N populated countries in the world where N is provided by the user.
        ct.displayCountry(ct.getTopNCountry_inWorld(con1, 10));
        // The top N populated countries in a continent where N is provided by the user.
        ct.displayCountry(ct.getTopNCountry_inContinent(con1, "Asia",10));
        // The top N populated countries in a region where N is provided by the user.
        ct.displayCountry(ct.getTopNCountry_inRegion(con1, "Southeast Asia",10));


//----------------------------------- END OF COUNTRY INFO ------------------------------------------------------

// ----------------------------------- START OF CITY AND TOP POPULATED CITY--------------------------------------------
        //cities
        city_info city = new city_info();
        // All the cities in the world organised by largest population to smallest.
        city.displayCity(city.getCity_inWorld(con1));
        //All the cities in a continent organised by largest population to smallest.
        city.displayCity(city.getCity_inContinent(con1, "Asia"));
        //All the cities in a region organised by largest population to smallest.
        city.displayCity(city.getCity_inRegion(con1, "Caribbean"));
        // all the cities in a country organised by largest to the smallest population
        city.displayCity(city.getCity_inCountry(con1, "Japan"));
        //All the cities in a district organised by largest population to smallest.
        city.displayCity(city.getCity_inDistrict(con1, "England"));

        // The top N populated cities in the world where N is provided by the user.
        city.displayCity(city.getTopNCity_inWorld(con1, 10));
        // The top N populated cities in a continent where N is provided by the user.
        city.displayCity(city.getTopNCity_inContinent(con1, "Asia",10));
        // The top N populated cities in a region where N is provided by the user.
        city.displayCity(city.getTopNCity_inRegion(con1, "Caribbean",10));
        // The top N populated cities in a country where N is provided by the user.
        city.displayCity(city.getTopNCity_inCountry(con1, "Japan", 10));
        // The top N populated cities in a district where N is provided by the user.
        city.displayCity(city.getTopNCity_inDistrict(con1, "England",10));
// ----------------------------------- CITY AND TOP POPULATED END --------------------------------------------
*/

// ----------------------------------- CAPITAL CITY AND TOP POPULATED START --------------------------------------------
        //capital cities
        capitalcity_info capitalcity = new capitalcity_info();
        //All the capital cities in the world organised by largest population to smallest.
        capitalcity.displayCapitalcity(capitalcity.getCapitalcity_inWorld(con1));
        ////All the capital cities in a continent organised by largest population to smallest.
        capitalcity.displayCapitalcity(capitalcity.getCapitalcity_inContinent(con1, "Asia"));
        //All the capital cities in a region organised by largest population to smallest.
        capitalcity.displayCapitalcity(capitalcity.getCapitalcity_inRegion(con1, "Southeast Asia"));


// ----------------------------------- CAPITAL CITY AND TOP POPULATED END --------------------------------------------


        //SQL database disconnect
        //db.disconnect();


    }//end of main method


}//end of App class