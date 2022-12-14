package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    private Connection con = null;

    public Country getCountry(int ct_capital)
    {
        try
        {   System.out.println("Country Information for Capital: "+ct_capital);
            // Create an SQL statement
            Statement stmt = con.createStatement();
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
                ct.country_code = rset.getString("Code");
                ct.country_name= rset.getString("Name");
                ct.continent = rset.getString("Continent");
                ct.region= rset.getString("Region");
                ct.population= rset.getInt("Population");
                ct.capital=rset.getInt("Capital");
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
}
