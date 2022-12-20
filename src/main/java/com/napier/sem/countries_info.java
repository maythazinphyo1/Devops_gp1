package com.napier.sem;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class countries_info {

    // create instance for DB_connect
    DB_connect db = new DB_connect();

    Connection con1;

    /**
     * method to get country data
     */
    public Country getCountry()
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
                    "SELECT Code, Name, Continent, Region, Population, Capital FROM country ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> countryList = new ArrayList<>();
            System.out.println("\n"+"All the countries in the world organised by largest population to smallest");
            //System.out.println("Code" + "\t\t" + "Name"+ "\t\t\t\t\t"+ "Population"+ "\n");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%5s %35s %20s", "Code", "Country Name", "Population");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            while (rset.next())
            {
                // get country data
                Country ct = new Country();
                ct.setCountry_code(rset.getString("Code"));
                ct.setCountry_name(rset.getString("Name"));
                ct.setContinent(rset.getString("Continent"));
                ct.setRegion(rset.getString("Region"));
                ct.setPopulation(rset.getInt("Population"));
                ct.setCapital(rset.getInt("Capital"));

                countryList.add(ct);
               /* // display country information
                String code = ct.getCountry_code();
                String name = ct.getCountry_name();
                String continent = ct.getContinent();
                String region = ct.getRegion();
                float population = ct.getPopulation();
                int capital = ct.getCapital();
                //System.out.println(code + "\t\t\t" + name +"\t\t\t\t\t\t" + population);

                System.out.format("%5s %35s %20f",
                        code, name, population);

                System.out.println();
                //db.disconnect(); // disconnect to the database

               //return ct;
*/
            }
          /*  DefaultTableModel tableModel = (DefaultTableModel) countryTable.getModel();
            tableModel.setRowCount(0);*/
            for (Country ct : countryList) {
                /*  Object rowData[] = {ct.getCountry_code(), ct.getCountry_name(), ct.getContinent(), ct.getRegion(), ct.getPopulation(), ct.getCapital()};
                 *//* tableModel.addRow(rowData);*/
                String code = ct.getCountry_code();
                String name = ct.getCountry_name();
                String continent = ct.getContinent();
                String region = ct.getRegion();
                int population = ct.getPopulation();
                int capital = ct.getCapital();
                System.out.format("%5s %35s %20d",
                        code, name, population, region, capital, continent);

                System.out.println();
            }


            System.out.println("-----------------------------------------------------------------------------");


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
//    public void displayCountry(Country ct)
//    {
//        if (ct != null)
//        {
//            String code = ct.getCountry_code();
//            String name = ct.getCountry_name();
//            String continent = ct.getContinent();
//            String region = ct.getRegion();
//            float population = ct.getPopulation();
//            int capital = ct.getCapital();
//           // System.out.println("Code" + "\t\t" + "Name"+ "\t\t\t"+ "Population"+ "\n");
//            System.out.println(code + "\t\t" + name +"\t\t\t\t\t\t" + population);
//        }
//    }
}
