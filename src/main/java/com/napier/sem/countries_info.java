package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class countries_info {

    // create instance for DB_connect
    DB_connect db = new DB_connect();

    Connection con1;
    //----------------------------------- SECTION FOR GET COUNTRY ------------------------------------------
    /**
     * method to get country data
     */
    public ArrayList<Country> getCountry()
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
            //ArrayList Obj created
            ArrayList<Country> countryList = new ArrayList<>();
            System.out.println("\n"+"All the countries in the world organised by largest population to smallest");

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

                countryList.add(ct);

            }
            return countryList;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }
    //----------------------------------- SECTION FOR GET COUNTRY ENDED ------------------------------------------

    //----------------------------------- SECTION FOR CONTINENT NAME ---------------------------------------------
    public ArrayList<Country> getCountry_inContinent(String continent_name)
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
            String strSelect1 =
                    "SELECT Code, Name, Continent, Region, Population, Capital FROM country WHERE Continent = '" + continent_name +"' ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<Country> countryList_con = new ArrayList<>();
            System.out.println("\n"+"All the countries in " + continent_name + " organised by largest population to smallest");
           while (rset1.next())
            {
                // get country data
                Country ct = new Country();
                ct.setCountry_code(rset1.getString("Code"));
                ct.setCountry_name(rset1.getString("Name"));
                ct.setContinent(rset1.getString("Continent"));
                ct.setRegion(rset1.getString("Region"));
                ct.setPopulation(rset1.getInt("Population"));
                ct.setCapital(rset1.getInt("Capital"));

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
    //----------------------------------- SECTION FOR CONTINENT NAME ENDED ------------------------------------------

    //----------------------------------- SECTION FOR GET DISPLAY ------------------------------------------
    /**
     * method to display country information
     */
    public void displayCountry(ArrayList<Country> ArrayList)
    {
        if (ArrayList != null)
        {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%5s %45s %15s %30s %10s %20s", "Code", "Country Name", "Population","Region", "Capital","Continent");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Country ct : ArrayList) {

            String code = ct.getCountry_code();
            String name = ct.getCountry_name();
            String continent = ct.getContinent();
            String region = ct.getRegion();
            int population = ct.getPopulation();
            int capital = ct.getCapital();
            System.out.format("%5s %45s %15d %30s %10d %20s",
                    code, name, population, region, capital, continent);

            System.out.println();
        }
        }
    }
    //----------------------------------- SECTION FOR DISPLAY ENDED ------------------------------------------
}
