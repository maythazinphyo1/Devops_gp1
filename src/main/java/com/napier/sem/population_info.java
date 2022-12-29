/**
 * CREATED ON Dec.28.2022
 * CREATED BY GROUP-1
 * JAVA CLASS FILE TO GENERATE QUERY FOR POPULATION REPORT
 */
package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class population_info {
    /**
     * METHOD TO GET PEOPLE POPULATION WHO LIVE IN CITIES, NOT LIVING IN CITIES IN EACH CONTINENT
     */
    public void getCities_population_continent(Connection con1)
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
                    "SELECT country.Continent, SUM(DISTINCT country.Population) AS con_population, SUM(city.Population) AS city_population FROM city INNER JOIN country ON city.CountryCode = country.Code GROUP BY Continent ORDER BY con_population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Print header
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.format("%20s %25s %25s %25s %30s %30s",
                        "Continent", "Population of continent", "Population of cities", "Population % of cities", "Population outside of cities", "Population % outside of cities");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


            while (rset.next())
            {
                Population ct = new Population();
                ct.setContinent(rset.getString("Continent"));
                ct.setPopulation(rset.getLong("con_population"));
                ct.setCity_population(rset.getLong("city_population"));
                ct.setContinent(rset.getString("country.Continent"));

                String continent = ct.getContinent();
                long cities_population = ct.getCity_population();
                long con_population = ct.getPopulation();
                long population_not = con_population - cities_population;
                float cities_population_per = ((float) cities_population / (float)con_population) * 100;
                float not_cities_population_per = 100 - cities_population_per;

                System.out.format("%20s %25d %25d %,25.2f %30d %,30.2f",
                        continent, con_population, cities_population, cities_population_per, population_not, not_cities_population_per);
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




    /**
     * METHOD TO GET PEOPLE POPULATION WHO LIVE IN CITIES, NOT LIVING IN CITIES IN EACH REGION
     */
    public void getCities_population_region(Connection con1)
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
                    "SELECT country.Region, SUM(DISTINCT country.Population) AS region_population, SUM(city.Population) AS city_population FROM city INNER JOIN country ON city.CountryCode = country.Code GROUP BY country.Region ORDER BY region_population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Print header
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.format("%40s %25s %25s %25s %30s %30s",
                    "Region", "Population of country", "Population of cities", "Population % of cities", "Population outside of cities", "Population % outside of cities");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


            while (rset.next())
            {
                Population ct = new Population();
                ct.setRegion(rset.getString("country.Region"));
                ct.setPopulation(rset.getLong("region_population"));
                ct.setCity_population(rset.getLong("city_population"));


                String region_name = ct.getRegion();
                long cities_population = ct.getCity_population();
                long region_population = ct.getPopulation();
                long population_not = region_population - cities_population;
                float cities_population_per = ((float) cities_population / (float)region_population) * 100;
                float not_cities_population_per = 100 - cities_population_per;


                System.out.format("%40s %25d %25d %,25.2f %30d %,30.2f",
                        region_name, region_population, cities_population, cities_population_per, population_not, not_cities_population_per);

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




    /**
     * METHOD TO GET PEOPLE POPULATION WHO LIVE IN CITIES, NOT LIVING IN CITIES IN EACH COUNTRY
     */
    public void getCities_population_country(Connection con1)
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
                    "SELECT country.Name, SUM(DISTINCT country.Population) AS country_population, SUM(city.Population) AS city_population FROM city INNER JOIN country ON city.CountryCode = country.Code GROUP BY country.Name ORDER BY country_population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Print header
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.format("%40s %25s %25s %25s %30s %30s",
                    "Country", "Population of country", "Population of cities", "Population % of cities", "Population outside of cities", "Population % outside of cities");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            //System.out.println("\n"+"The population of people living in cities in each Continent \n");

            while (rset.next())
            {
                Population ct = new Population();
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setPopulation(rset.getLong("country_population"));
                ct.setCity_population(rset.getLong("city_population"));


                String country_name = ct.getCountry_name();
                long cities_population = ct.getCity_population();
                long country_population = ct.getPopulation();
                long population_not = country_population - cities_population;
                float cities_population_per = ((float) cities_population / (float)country_population) * 100;
                float not_cities_population_per = 100 - cities_population_per;


                System.out.format("%40s %25d %25d %,25.2f %30d %,30.2f",
                        country_name, country_population, cities_population, cities_population_per, population_not, not_cities_population_per);

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
