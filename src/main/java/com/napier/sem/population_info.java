/**
 * CREATED ON Dec.28.2022
 * CREATED BY GROUP-1
 * JAVA CLASS FILE TO GENERATE QUERY FOR POPULATION REPORT
 */
package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class population_info {
    /**
     * METHOD TO GET PEOPLE POPULATION WHO LIVE IN CITIES, NOT LIVING IN CITIES IN EACH CONTINENT
     */
    public void getCities_population_con(Connection con1, String continent_name)
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
                    "SELECT country.Continent, SUM(country.Population) AS con_population, SUM(city.Population) AS city_population FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Continent = '" + continent_name +"' ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("\n"+"The population of people living in cities in Continent: "+continent_name+"\n");

            if (rset.next())
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
                System.out.println("Continent: "+continent);
                System.out.println("Population of people who live in cities: "+cities_population);
                System.out.println("Population Percentage of people who live in cities: "+cities_population_per +"%");
                System.out.println("Population of people who do not live in cities: "+population_not);
                System.out.println("Population Percentage of people who live in cities: "+not_cities_population_per +"%");
//                System.out.format("%20s %30d %30f %30d %30f",
//                        continent, cities_pop, cities_population_per, population_not, not_cities_population_per);

                System.out.println();
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
        }
    }
}
