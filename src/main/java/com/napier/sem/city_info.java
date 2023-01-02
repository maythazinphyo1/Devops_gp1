package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class city_info {

    //--------------------------------------- START GET CITY IN WORLD ------------------------------------------
    /**
     * method to get city data
     */
    public ArrayList<City> getCity_inWorld(Connection con1) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "All the cities in the world organised by largest population to smallest");

            while (rset.next()) {
                // create new obj
                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);

            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //--------------------------------------- END GET CITY IN WORLD -------------------------------------

    //--------------------------------------- START SORT by CONTINENT -----------------------------------

    public ArrayList<City> getCity_inContinent(Connection con1, String continent_name) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Continent = '" + continent_name + "' ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "All the cities in Continent: " + continent_name + " organised by largest population to smallest");

            while (rset.next()) {
                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);

            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //--------------------------------------- ENDED SORT by CONTINENT -------------------------------------

    //--------------------------------------- START SORT by REGION ----------------------------------------

    public ArrayList<City> getCity_inRegion(Connection con1, String region_name) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Region = '" + region_name + "' ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "All the cities in Region: " + region_name + " organised by largest population to smallest");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);

            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //--------------------------------------- ENDED SORT by REGION ----------------------------------------------------
    //--------------------------------------- START SORT by COUNTRY ----------------------------------------------------
    public ArrayList<City> getCity_inCountry(Connection con1, String country_name) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Name ='" + country_name +"' ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "All the cities in Country: " + country_name +" organised by largest population to smallest");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);

            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //--------------------------------------- ENDED SORT by COUNTRY ----------------------------------------------------
    //--------------------------------------- START SORT by DISTRICT_NAME ----------------------------------------------------
    public ArrayList<City> getCity_inDistrict(Connection con1, String district_name) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE city.District ='" + district_name +"' ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "All the cities in District: " + district_name +" organised by largest population to smallest");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));

                cityList.add(ct);

            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //--------------------------------------- ENDED SORT by DISTRICT_NAME ----------------------------------------------------

    //--------------------------------------START OF TOP N CITIES IN THE WORLD----------------------------------------------------

    /**
     *
     * Method for top N cities in the world.
     * This method returns cityList obj
     */
    public ArrayList<City> getTopNCity_inWorld(Connection con1, int n) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code ORDER BY city.Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "The Top "+n+" populated cities in the world.");

            while (rset.next()) {
                // get country data
                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //--------------------------------------- START OF TOP N POPULATED CITIES IN A CONTINENT ----------------------------------------------------

    /**
     *
     * Method for Top N cities in a continent.
     */
    public ArrayList<City> getTopNCity_inContinent(Connection con1, String continent_name, int n) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Continent = '" + continent_name + "' ORDER BY city.Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "The Top "+n+" populated cities in Continent: "+continent_name+".");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //------------------------------------- END OF TOP N POPULATED CITIES IN A CONTINENT ---------------------------------------------------------

    //-------------------------------------START OF TOP N POPULATED CITIES IN A REGION ---------------------------------------------------------
    /**
     *
     * Method for Top N populated cities in a region.
     */
    public ArrayList<City> getTopNCity_inRegion(Connection con1, String region_name, int n) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Region = '" + region_name + "' ORDER BY city.Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "The Top "+n+" populated cities in Region: "+region_name+"");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //-------------------------------------END OF TOP N POPULATED CITIES IN A REGION ---------------------------------------------------------

    //-------------------------------------START OF TOP N POPULATED CITIES IN A COUNTRY ---------------------------------------------------------
    /**
     *
     * Method for Top N populated cities in a country.
     */
    public ArrayList<City> getTopNCity_inCountry(Connection con1, String country_name, int n) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE country.Name = '" + country_name + "' ORDER BY city.Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "The Top "+n+" populated cities in country: "+country_name+".");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //-------------------------------------END OF TOP N POPULATED CITIES IN A COUNTRY ---------------------------------------------------------


    //-------------------------------------START OF TOP N POPULATED CITIES IN A DISTRICT ---------------------------------------------------------
    /**
     *
     * Method for Top N populated cities in a district.
     */
    public ArrayList<City> getTopNCity_inDistrict(Connection con1, String district_name, int n) {
        try {

            if (con1 == null) {
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population  FROM city INNER JOIN country ON city.CountryCode = country.Code WHERE city.District = '" + district_name + "' ORDER BY city.Population DESC LIMIT "+n;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            //ArrayList Obj created
            ArrayList<City> cityList = new ArrayList<>();
            System.out.println("\n" + "The Top "+n+" populated cities in district: "+district_name+".");

            while (rset.next()) {

                City ct = new City();
                ct.setCity_name(rset.getString("city.Name"));
                ct.setCountry_name(rset.getString("country.Name"));
                ct.setCity_district(rset.getString("city.District"));
                ct.setCity_population(rset.getInt("city.population"));
                cityList.add(ct);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }
    //-------------------------------------END OF TOP N POPULATED CITIES IN A DISTRICT ---------------------------------------------------------


    //--------------------------------------- DISPLAY START ------------------------------------------------------------
        public void displayCity(ArrayList<City> cityList)
        {
            if (cityList != null)
            {
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%30s %40s %40s %15s", "City Name", "Country Name", "District", "Population");
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (City ct : cityList) {
                    if (ct == null)
                    {
                        System.out.println("ct object is null");
                    }
                    else{
                        String city_name = ct.getCity_name();
                        String name = ct.getCountry_name();
                        String city_district = ct.getCity_district();
                        //int population = ct.getCity_population();
                        //population number in commas format
                        DecimalFormat decFormat = new DecimalFormat("###,###");
                        String population_comma_str = decFormat.format(ct.getCity_population());
                        System.out.format("%30s %40s %40s %15s",
                                city_name, name, city_district, population_comma_str);

                        System.out.println();
                    }
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            else{
                System.out.println("The arraylist object is null");
            }
        }
    //    --------------------------------------- DISPLAY END ------------------------------------------------------------
    }


