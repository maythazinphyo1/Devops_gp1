package com.napier.sem;
import java.sql.*;

/**
 * CREATED ON 12.12.2022
 * CREATED BY GROUP-1
 * REPRESENT Country DATA FOR CITY OBJECT
 */

public class Population {

    //-------------------------------- GET and Set method for COUNTRY NAME ----------------------------------------
    /*** Country name*/
    private String country_name; // country name
    public String getCountry_name() {
        return country_name;
    }
    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    //-------------------------------- END OF GET and Set method for NAME ----------------------------


    //-------------------------------- GET and Set method for REGION ----------------------------------
    /*** Region*/
    private String region;
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {this.region = region;}

    //-------------------------------- END OF GET and Set method for REGION ----------------------------------


    //-------------------------------- GET and Set method for Population ----------------------------------
    /*** Country Population*/
    private long population;
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {this.population = population;}

    //-------------------------------- End Of GET and Set method for Population -------------------------------


    //-------------------------------- GET and Set method for Continent ---------------------------------------
    /*** Continent*/
    private String continent;
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }

    //-------------------------------- End Of GET and Set method for Continent ----------------------------------


    //-------------------------------- GET and Set method for Capital city name--------------------------------
    /*** Capital city name*/
//    private String city_name; // city name
//    public String getCity_name() {
//        return city_name;
//    }
//
//    public void setCity_name(String city_name) {
//        this.city_name = city_name;
//    }
    //---------------------- End of GET and Set method for Capital city name--------------------------------

    //-------------------------------- GET and Set method for CITY POPULATION ----------------------------------

    private long city_population; // city population
    public long getCity_population() {
        return city_population;
    }

    public void setCity_population(long city_population) {
        this.city_population = city_population;
    }

    //--------------------------------END OF GET and Set method for CITY POPULATION ----------------------------------

}
