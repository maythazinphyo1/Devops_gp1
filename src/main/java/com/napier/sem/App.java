package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        Test ct = new Test(); // create instance for Test class

        // Get Country
        Country cte = ct.getCountry(1);
        // Display results
        ct.displayCountry(cte);

    }


}