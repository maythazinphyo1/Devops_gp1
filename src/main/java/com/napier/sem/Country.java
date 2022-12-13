package com.napier.sem;

import java.sql.*;

/**
 * Represents an employee
 */
public class Country
{
    /**
     * country code
     */
    public String code_num;

    /**
     * Country name
     */
    private String country_name;

    /**
     * Continent
     */
    private String continent;

    /**
     * region
     */
    private String region;

    /**
     * Country population
     */
    private int population;

    /**
     * Country's capital name
     */
    private int capital;


    /**
     * start of main
     */
    public static void main(String[] args)
    {
        // Create new Application
        Country a = new Country();

        // Connect to database
        a.connect();

        // Get Country
        Country country = a.getCountry("AFG");
        // Display results
        a.displayCountry(country);


        // Disconnect from database
        a.disconnect();
    }
    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected to world.sql from country.java");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
    public Country getCountry(String CodeID)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Code = " + CodeID;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                System.out.println("Found Matching Country Code");
                Country country = new Country();
                country.code_num = rset.getString("Country Code");
                country.country_name = rset.getString("Country Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Country Population");
                country.capital = rset.getInt("Country Capital");
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    public void displayCountry(Country country)
    {
        if (country != null)
        {
            System.out.println(
                    country.code_num + " "
                            + country.country_name + "\n"
                            + country.continent + "\n"
                            + country.region + "\n"
                            + "Population:" + country.population + "\n"
                            + country.capital + "\n");
        }
    }
}