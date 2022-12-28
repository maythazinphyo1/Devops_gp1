package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class capitalcity_info {


    /**
     * method to get capital city data in the world
     */
    public ArrayList<City> getCapitalcity_inWorld(Connection con1)
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
                    "SELECT city.Name, country.Name,  city.Population  FROM city INNER JOIN country ON city.ID = country.Capital ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> captialcityList_wld = new ArrayList<>();
            System.out.println("\n"+"All the capital cities in the world organised by largest population to smallest");

            while (rset.next())
            {
                // get city data
                City ct = new City();
                ct.setCity_name(rset.getString("Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_population(rset.getInt("Population"));


                captialcityList_wld.add(ct);

            }
            return captialcityList_wld;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * method to display capital city information in continent
     */
    public ArrayList<City> getCapitalcity_inContinent(Connection con1, String continent_name)
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
                    "SELECT city.Name, country.Name,  city.Population  FROM city INNER JOIN country ON city.ID = country.Capital WHERE country.Continent = '" + continent_name + "'ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<City> capitalcityList_con = new ArrayList<>();
            System.out.println("\n"+"All the capital cities in " + continent_name + " organised by largest population to smallest");
            while (rset1.next())
            {
                // get city data
                City ct = new City();
                ct.setCity_name(rset1.getString("Name"));
                ct.setCountry_name(rset1.getString("country.Name"));
                ct.setCity_population(rset1.getInt("Population"));

                capitalcityList_con.add(ct);

            }

            return capitalcityList_con;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }






    /**
     * method to display capital city information in Region
     */

    public ArrayList<City> getCapitalcity_inRegion(Connection con1, String region_name)
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
                    "SELECT city.Name, country.Name,  city.Population  FROM city INNER JOIN country ON city.ID = country.Capital WHERE country.Region = '" + region_name + "'ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<City> capitalcityList_reg = new ArrayList<>();
            System.out.println("\n"+"All the capital cities in " + region_name + " organised by largest population to smallest");
            while (rset1.next())
            {
                // get city data
                City ct = new City();
                ct.setCity_name(rset1.getString("Name"));
                ct.setCountry_name(rset1.getString("country.Name"));
                ct.setCity_population(rset1.getInt("Population"));

                capitalcityList_reg.add(ct);

            }

            return capitalcityList_reg;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }



    /**
     * method to display top N capital city information in the world
     */

    public ArrayList<City> getTopNCapitalcity_inWorld(Connection con1, int n)
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
                    "SELECT city.Name, country.Name,  city.Population  FROM city INNER JOIN country ON city.ID = country.Capital ORDER BY city.Population DESC LIMIT " +n;
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<City> capitalcityList_reg = new ArrayList<>();
            System.out.println("\n"+"Top "+ n + " most populated capital cities in the world organised by largest population to smallest");
            while (rset1.next())
            {
                // get city data
                City ct = new City();
                ct.setCity_name(rset1.getString("Name"));
                ct.setCountry_name(rset1.getString("country.Name"));
                ct.setCity_population(rset1.getInt("Population"));

                capitalcityList_reg.add(ct);

            }

            return capitalcityList_reg;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }


    /**
     * method to display top N populated capital city information in continent
     */
    public ArrayList<City> getTopNCapitalcity_inContinent(Connection con1, String continent_name, int n)
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
                    "SELECT city.Name, country.Name,  city.Population  FROM city INNER JOIN country ON city.ID = country.Capital WHERE country.Continent = '" + continent_name + "'ORDER BY city.Population DESC LIMIT " +n;
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<City> capitalcityList_con = new ArrayList<>();
            System.out.println("\n" + "Top "+ n + " most populated capital cities in " + continent_name + " organised by largest population to smallest");
            while (rset1.next())
            {
                // get city data
                City ct = new City();
                ct.setCity_name(rset1.getString("Name"));
                ct.setCountry_name(rset1.getString("country.Name"));
                ct.setCity_population(rset1.getInt("Population"));

                capitalcityList_con.add(ct);

            }

            return capitalcityList_con;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }


    /**
     * method to display top N populated capital city information in region
     */
    public ArrayList<City> getTopNCapitalcity_inRegion(Connection con1, String region_name, int n)
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
                    "SELECT city.Name, country.Name,  city.Population  FROM city INNER JOIN country ON city.ID = country.Capital WHERE country.Region = '" + region_name + "'ORDER BY city.Population DESC LIMIT " +n;
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            //ArrayList Obj created
            ArrayList<City> capitalcityList_con = new ArrayList<>();
            System.out.println("\n" + "Top "+ n + " most populated capital cities in " + region_name + " organised by largest population to smallest");
            while (rset1.next())
            {
                // get city data
                City ct = new City();
                ct.setCity_name(rset1.getString("Name"));
                ct.setCountry_name(rset1.getString("country.Name"));
                ct.setCity_population(rset1.getInt("Population"));

                capitalcityList_con.add(ct);

            }

            return capitalcityList_con;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }


    /**
     * method to display capital city information
     */
    public void displayCapitalcity(ArrayList<City> capitalcityList) {

            if (capitalcityList != null) {
                //System.out.println(capitalcityList.size());
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%30s %40s %10s ", "Capital City Name", "Country", "Population");
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                // Loop over all capital city in the list
                for (City ct : capitalcityList) {

                    if (ct == null) {
                        System.out.println("The ct object is null");
                    } 
                    else {
                        String captial_name = ct.getCity_name();
                        String country_name = ct.getCountry_name();
                        int population = ct.getCity_population();

                        System.out.format("%30s %40s %10d ",
                                captial_name, country_name, population);

                        System.out.println();
                    }
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else {
                System.out.println("The array list object is null.");
            }
        }

}
