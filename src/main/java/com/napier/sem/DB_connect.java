package com.napier.sem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * CREATED ON 12.12.2022
 * CREATED BY GROUP-1
 * REPRESENT DATABASE CONNECTION
 */

public class DB_connect {

    private Connection con;
//---------------------------- GETTER AND SETTER SECTION ----------------------------------
    /**
        *Generate getter and setter
    */
    public Connection getCon() {

        return this.con;
    }

    //---------------------------- GETTER SECTION ENDED ----------------------------------

    //----------------------------  MYSQL DATABASE SECTION -----------------------------------------
    /**
            * Connect to the MySQL database.
     */
    public void connect(String location, int delay)
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to SQL database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                con= DriverManager.getConnection("jdbc:mysql://" + location
                        + "/world?allowPublicKeyRetrieval=true&useSSL=false",  "root", "example");
                System.out.println("Successfully connected to world.sql");
                break;

            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }

    }

    /**
     * Disconnect to the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
    //---------------------------- MYSQL DATABASE SECTION ENDED ---------------------------------------------
}

