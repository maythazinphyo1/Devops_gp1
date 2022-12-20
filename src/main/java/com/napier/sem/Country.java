package com.napier.sem;
import java.sql.*;

/**
 * Represents a country
 */
public class Country {

    /**
     * Country code
     */
    private String country_code; // country code

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    /**
     * Country name
     */
    private String country_name; // country name
    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    /**
     * Region
     */
    private String region;
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Country Population
     */
    private int population;
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Continent
     */
    private String continent;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }


    /**
     * Capital
     */
    private int capital;

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }


}
