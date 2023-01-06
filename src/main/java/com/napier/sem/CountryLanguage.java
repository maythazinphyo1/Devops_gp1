package com.napier.sem;

/**
 * CREATED ON 12.12.2022
 * CREATED BY GROUP-1
 * REPRESENT LANGUAGE DATA FOR LANGUAGE OBJECT
 */
public class CountryLanguage {

    //-------------------------------- GET and Set method for language ----------------------------------

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    //-------------------------------- END Of GET and Set method for language ----------------------------------



    //-------------------------------- GET and Set method for Population ----------------------------------

    private long population;
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {this.population = population;}

    //-------------------------------- End Of GET and Set method for Population -------------------------------



    //-------------------------------- GET and Set method for SPOKEN LANGUAGE POPULATION PERCENTAGE----------------------------------
    private float language_population_percent;

    public float getLanguage_population_percent() {
        return language_population_percent;
    }

    public void setLanguage_population_percent(float language_population_percent) {
        this.language_population_percent = language_population_percent;
    }

    //-------------------------------- END of GET and Set method for SPOKEN LANGUAGE POPULATION PERCENTAGE----------------------------------

}
