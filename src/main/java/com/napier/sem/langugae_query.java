package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class langugae_query {


    /**
     * METHOD TO GET WORLD POPULATION
     */
    public Population getWorld_Population(Connection con1)
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
                    "SELECT SUM(country.Population) AS world_population FROM country";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Print header
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            //create population obj
            Population ct = new Population();
            while (rset.next())
            {

                ct.setPopulation(rset.getLong("world_population"));

                long world_population = ct.getPopulation();

                System.out.println("The population of the world : " + world_population);
            }
            return ct;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * METHOD TO GET Continent POPULATION
     */
    public Population getContinent_Population(Connection con1, String continent_name)
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
                    "SELECT SUM(Population) AS continent_population, Continent FROM `country` WHERE Continent = '" + continent_name +"'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //create population obj
            Population ct = new Population();
            while (rset.next())
            {
                ct.setContinent(rset.getString("Continent"));
                ct.setPopulation(rset.getLong("continent_population"));

                long continent_population = ct.getPopulation();
                String con_name =  ct.getContinent();

                System.out.println("The population of a continent '" + continent_name +"': " + continent_population);
            }

            return ct;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * METHOD TO GET Region POPULATION
     */
    public Population getRegion_Population(Connection con1, String region_name)
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
                    "SELECT SUM(Population) AS region_population, Region FROM `country` WHERE Region = '" + region_name +"'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //create population obj
            Population ct = new Population();
            while (rset.next())
            {
                 ct.setPopulation(rset.getLong("region_population"));

                long region_population = ct.getPopulation();

                System.out.println("The population of a region '" + region_name +"': " + region_population);
            }

            return ct;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * METHOD TO GET Country POPULATION
     */
    public Population getCountry_Population(Connection con1, String country_name)
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
                    "SELECT Population FROM `country` WHERE Name =  '" + country_name +"'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //create population obj
            Population ct = new Population();
            while (rset.next())
            {
                ct.setPopulation(rset.getLong("Population"));

                long country_population = ct.getPopulation();

                System.out.println("The population of a country '" + country_name +"': " + country_population);
            }

            return ct;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * METHOD TO GET District POPULATION
     */
    public Population getDistrict_Population(Connection con1, String district_name)
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
                    "SELECT SUM(city.Population) AS district_population FROM `country`INNER JOIN city ON country.Code = city.CountryCode WHERE city.District = '" + district_name +"'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //create population obj
            Population ct = new Population();
            while (rset.next())
            {
                ct.setPopulation(rset.getLong("district_population"));

                long district_population = ct.getPopulation();

                System.out.println("The population of a district '" + district_name +"': " + district_population);
            }

            return ct;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * METHOD TO GET City POPULATION
     */
    public Population getCity_Population(Connection con1, String city_name)
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
                    "SELECT city.Population FROM `country` INNER JOIN city ON country.Code = city.CountryCode WHERE city.Name = '" + city_name +"'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //create population obj
            Population ct = new Population();
            while (rset.next())
            {
                ct.setPopulation(rset.getLong("city.Population"));

                long city_population = ct.getPopulation();

                System.out.println("The population of a city '" + city_name +"': " + city_population);
            }
            //create footer
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            return ct;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }


    /**
     * METHOD TO GET PEOPLE POPULATION WHO LIVE IN CITIES, NOT LIVING IN CITIES IN EACH CONTINENT
     */

    public void getChinese_lan_population(Connection con1, Population ctp)
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
                    "SELECT (SUM(countrylanguage.Percentage*country.Population/100)) AS Language_Population, (SUM(countrylanguage.Percentage*country.Population/100)*100/'"+ctp.getPopulation()+"') AS Language_Population_Percent, countrylanguage.Language FROM `countrylanguage` INNER JOIN country ON countrylanguage.CountryCode = country.Code WHERE countrylanguage.Language IN ('Chinese', 'English', 'Hindi', 'Spanish', 'Arabic') GROUP BY LANGUAGE";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Print header
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.format("%10s %35s %40s",
                    "Language", "Population of Spoken Language", "Population % of Spoken language in world");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


            while (rset.next())
            {
                CountryLanguage ct = new CountryLanguage();
                ct.setLanguage(rset.getString("countrylanguage.Language"));
                ct.setPopulation(rset.getLong("Language_Population"));
                float language_population_percent = rset.getFloat("Language_Population_Percent");

                String language = ct.getLanguage();
                long language_population = ct.getPopulation();
                System.out.format("%10s %35d %,40.2f",
                        language, language_population, language_population_percent);
                System.out.println();
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
        }
    }





}
