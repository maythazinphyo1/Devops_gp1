package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class countries_info {

    //----------------------------------------Start of Country Info in World---------------------------------------------
    /**
     * method to get country data
     */
    public ArrayList<Country> getCountry_inWorld(Connection con1)
    {
        try
        {
            // check connection obj is null
            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name FROM country INNER JOIN city ON country.Capital = city.ID ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<Country> countryList_wld = new ArrayList<>();
            System.out.println("\n"+"All the countries in the world organised by largest population to smallest");

            while (rset.next())
            {
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCity_name(rset.getString("city.Name"));

                countryList_wld.add(ct);

            }
            return countryList_wld;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    //----------------------------------------End of Country Info in World---------------------------------------------------



    //----------------------------------------Start of Country Info in Continent---------------------------------------------
    public ArrayList<Country> getCountry_inContinent(Connection con1, String continent_name)
    {
        try
        {

            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect1 =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name FROM country " +
                            "INNER JOIN city ON country.capital = city.ID WHERE country.Continent = '" + continent_name +"' ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<Country> countryList_con = new ArrayList<>();
            System.out.println("\n"+"All the countries in Continent: " + continent_name + " organised by largest population to smallest");
           while (rset1.next())
            {
                Country ct = new Country();
                ct.setCountry_code(rset1.getString("Code"));
                ct.setCountry_name(rset1.getString("Name"));
                ct.setContinent(rset1.getString("Continent"));
                ct.setRegion(rset1.getString("Region"));
                ct.setPopulation(rset1.getInt("Population"));
                ct.setCity_name(rset1.getString("city.Name"));

                countryList_con.add(ct);

            }

            return countryList_con;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }
    //----------------------------------------End of Country Info in Continent---------------------------------------------




    //----------------------------------------Start of Country Info in Region---------------------------------------------
    public ArrayList<Country> getCountry_inRegion(Connection con1, String region_name)
    {
        try
        {

            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect1 =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name FROM country " +
                            "INNER JOIN city ON country.capital = city.ID WHERE country.Region = '" + region_name +"' ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<Country> countryList_reg = new ArrayList<>();
            System.out.println("\n"+"All the countries in Region: " + region_name + " organised by largest population to smallest");
            while (rset1.next())
            {
                Country ct = new Country();
                ct.setCountry_code(rset1.getString("Code"));
                ct.setCountry_name(rset1.getString("Name"));
                ct.setContinent(rset1.getString("Continent"));
                ct.setRegion(rset1.getString("Region"));
                ct.setPopulation(rset1.getInt("Population"));
                ct.setCity_name(rset1.getString("city.Name"));

                countryList_reg.add(ct);

            }

            return countryList_reg;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }
    //----------------------------------------Start of Country Info in Continent---------------------------------------------

    /**
     * The top N populated cities in the world
     * where N is provided by the user.
     */

    //----------------------------------------Start of Top N Country Info in World---------------------------------------
    public ArrayList<Country> getTopNCountry_inWorld(Connection con1, int n)
    {
        try
        {

            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement

            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name FROM country INNER JOIN city ON country.capital = city.ID ORDER BY Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<Country> countryList_wld = new ArrayList<>();
            System.out.println("\n"+"The top "+n+" populated countries in the world.");

            while (rset.next())
            {
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCity_name(rset.getString("city.Name"));

                countryList_wld.add(ct);

            }
            return countryList_wld;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    //----------------------------------------End of Top N Country Info in World---------------------------------------



    //----------------------------------------Start of Top N Country Info in Continent---------------------------------------

    /**
     * * The top N populated cities in a continent
     *   where N is provided by the user.
     */
    public ArrayList<Country> getTopNCountry_inContinent(Connection con1, String continent_name,int n)
    {
        try
        {
            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name FROM country INNER JOIN city ON country.capital = city.ID WHERE country.Continent = '" + continent_name +"' ORDER BY Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<Country> countryList_wld = new ArrayList<>();
            System.out.println("\n"+"The top "+n+" populated countries in continent: "+continent_name);

            while (rset.next())
            {
                // get country data
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCity_name(rset.getString("city.Name"));

                countryList_wld.add(ct);

            }
            return countryList_wld;

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }
    //----------------------------------------End of Top N Country Info in Continent---------------------------------------



    //----------------------------------------Start of Top N Country Info in Region---------------------------------------

    /**
     * * The top N populated cities in a region
     *   where N is provided by the user.
     */
    public ArrayList<Country> getTopNCountry_inRegion(Connection con1, String region_name,int n)
    {
        try
        {

            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name FROM country " +
                            "INNER JOIN city ON country.capital = city.ID WHERE country.Region = '" + region_name +"' ORDER BY Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<Country> countryList_wld = new ArrayList<>();
            System.out.println("\n"+"The top "+n+" populated countries in Region: "+region_name);

            while (rset.next())
            {
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCity_name(rset.getString("city.Name"));

                countryList_wld.add(ct);

            }
            return countryList_wld;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    //----------------------------------------End of Top N Country Info in Region---------------------------------------


    /**
     * method to display country information
     */
    public void displayCountry(ArrayList<Country> countryList)
    {
        // Check countryList is not null
        if (countryList != null)
        {
            // Print header
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%5s %45s %15s %30s %20s %20s", "Code", "Country Name", "Population","Region", "Capital","Continent");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            // Loop over all country in the list
            for (Country ct : countryList) {

                if (ct == null)
                    continue;

            String code = ct.getCountry_code();
            String name = ct.getCountry_name();
            String continent = ct.getContinent();
            String region = ct.getRegion();
            int population = ct.getPopulation();
            String capital = ct.getCity_name();
            System.out.format("%5s %45s %15d %30s %20s %20s",
                    code, name, population, region, capital, continent);

            System.out.println();
        }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
    }
}
