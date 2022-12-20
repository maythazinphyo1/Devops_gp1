package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class countries_info {

    // create instance for DB_connect
    DB_connect db = new DB_connect();

    Connection con1;

    /**
     * method to get country data
     */
    public Country getCountry()
    {
        try
        {
            // connection to the database
            db.connect();
            con1= db.getCon();
            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital FROM country ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            System.out.println("\n"+"All the countries in the world organised by largest population to smallest"+"\n");
            System.out.println("Code" + "\t\t" + "Name"+ "\t\t\t\t\t"+ "Population"+ "\n");
            while (rset.next())
            {
                // get country data
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCapital(rset.getInt("Capital"));

                // display country information
                String code = ct.getCountry_code();
                String name = ct.getCountry_name();
                String continent = ct.getContinent();
                String region = ct.getRegion();
                float population = ct.getPopulation();
                int capital = ct.getCapital();

                System.out.println(code + "\t\t\t" + name +"\t\t\t\t\t\t" + population);

                //db.disconnect(); // disconnect to the database

                //System.out.println(ct);
               //return ct;

            }

                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * method to display country information
     */
//    public void displayCountry(Country ct)
//    {
//        if (ct != null)
//        {
//            String code = ct.getCountry_code();
//            String name = ct.getCountry_name();
//            String continent = ct.getContinent();
//            String region = ct.getRegion();
//            float population = ct.getPopulation();
//            int capital = ct.getCapital();
//           // System.out.println("Code" + "\t\t" + "Name"+ "\t\t\t"+ "Population"+ "\n");
//            System.out.println(code + "\t\t" + name +"\t\t\t\t\t\t" + population);
//        }
//    }
}