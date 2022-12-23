package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static DB_connect app;
    static countries_info ct;

    @BeforeAll
    static void init()
    {
        app = new DB_connect();
        app.connect("localhost:33060", 30000);

    }

    @Test
    void testGetCountry_inWorld()
    {
        Connection con1 = app.getCon();
        ArrayList<Country> country = ct.getCountry_inWorld(con1);
        assertEquals(country.get(0).getCountry_code(), "CHN");
        assertEquals(country.get(0).getCountry_name(), "China");
        assertEquals(country.get(0).getContinent(), "Asia");
        assertEquals(country.get(0).getRegion(), "Eastern Asia");
        assertEquals(country.get(0).getPopulation(), 1277558000);
        assertEquals(country.get(0).getCapital(), 1891);

    }
}
