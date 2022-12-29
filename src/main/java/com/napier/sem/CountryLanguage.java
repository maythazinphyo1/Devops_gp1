package com.napier.sem;

/**
 * CREATED ON 12.12.2022
 * CREATED BY GROUP-1
 * REPRESENT LANGUAGE DATA FOR LANGUAGE OBJECT
 */
public class CountryLanguage {

    //-------------------------------- GET and Set method for language ----------------------------------
    /*** langugae */
    private String language;  // country language

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    //-------------------------------- GET and Set method for language ----------------------------------


    //-------------------------------- GET and Set method for language percentage ----------------------------------
    /*** langugae percentage*/
//    private float language_percentage;   // language percentage
//
//    public float getLanguage_percentage() {
//        return language_percentage;
//    }
//
//    public void setLanguage_percentage(float language_percentage) {
//        this.language_percentage = language_percentage;
//    }

    //-------------------------------- GET and Set method for language percentage ----------------------------------

    //-------------------------------- GET and Set method for Population ----------------------------------
    /*** Country Population*/
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
