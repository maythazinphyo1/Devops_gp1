package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    DB_connect db = new DB_connect(); // create instance for DB_connect

    Connection con1;

    /**
     * method to get country data
     */
    public Country getCountry(int ct_capital)
    {
        try
        {
            // connection to the database
            db.connect();
            con1= db.getCon();
            if (con1==null){
                System.out.println("con is null");
            }
            // Create an SQL statement
            Statement stmt = con1.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Capital = " + ct_capital;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCapital(rset.getInt("Capital"));
                db.disconnect();
                System.out.println("Country Information for Capital: "+ct_capital);
                return ct;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * method to display country information
     */
    public void displayCountry(Country ct)
    {
        if (ct != null)
        {
            System.out.println(
                    "Country code:" + ct.getCountry_code()+ "\n"
                            +"Country name:" + ct.getCountry_name()+ "\n "
                            +"Continent: "+ ct.getContinent() + "\n"
                            +"Region: "+ ct.getRegion() + "\n"
                            + "Population:" + ct.getPopulation() + "\n"
                            +"Capital:" + ct.getCapital() + "\n"
            );
        }
    }
}
