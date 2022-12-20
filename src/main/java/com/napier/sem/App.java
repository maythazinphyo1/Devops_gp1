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
        // Get and display country information
        Country cte = ct.getCountry();
        //ct.displayCountry(cte);

    }


}