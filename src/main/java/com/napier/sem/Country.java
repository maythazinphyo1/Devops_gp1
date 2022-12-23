package com.napier.sem;
import java.sql.*;

/**
 * CREATED ON 12.12.2022
 * CREATED BY GROUP-1
 * REPRESENT Country DATA FOR CITY OBJECT
 */

public class Country {
    //-------------------------------- GET and Set method for COUNTRY CODE ----------------------------------
    /*** Country code*/
    private String country_code; // country code
    public String getCountry_code() {
        return country_code;
    }
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    //-------------------------------- END OF GET and Set method for COUNTRY CODE ----------------------------------


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
    private int population;
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {this.population = population;}

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


    //-------------------------------- GET and Set method for Capital -------------------------------------------
    /*** Capital*/
    private int capital;
    public int getCapital() {
        return capital;
    }
    public void setCapital(int capital) {
        this.capital = capital;
    }

    //-------------------------------- End Of GET and Set method for Capital ----------------------------------


    //-------------------------------- GET and Set method for Capital city name--------------------------------
    /*** Capital city name*/
    private String city_name; // city name
    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    //---------------------- End of GET and Set method for Capital city name--------------------------------


    //-------------------------------- GET and Set method for Capital city id--------------------------------
    /*** Capital city id*/
    private int city_id;

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }
    //---------------------------End of GET and Set method for Capital city id------------------------------

}
