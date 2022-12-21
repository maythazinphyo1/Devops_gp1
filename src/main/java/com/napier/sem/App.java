package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        /**
         * Display country information sorted by population
         */
        // Create instance for countries_info class
        countries_info ct = new countries_info();
        // Get and display country information organized by largest to smallest population in the world
        Country cte = ct.getCountry();

        // all the countries in a continent organized by largest to smallest population
        ct.Country_inContinent("Asia");
        //ct.displayCountry(cte);


    }


}