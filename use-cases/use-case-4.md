# USE CASE: 4 Produce the report of Top 10 populated cities in the world, continent, region, country and district.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *Department manager*, I want to produce the report of Top 10 most populated cities so that I could know which cities are the most populated to open new stores. 
### Scope

Company.

### Level

Sub function.

### Preconditions

We know the city information such as name, country, district and population from the world database. 

### Success End Condition

A report is available for the department to check top 10 populated cities in the world, in a specific continent, in a region, in a country and in a district for business decision.

### Failed End Condition

No report is produced.

### Primary Actor

Department manager

### Trigger

A report request for population information of top 10 cities is sent to the department.

## MAIN SUCCESS SCENARIO

1. The top 10 populated cities in the world.
   1. Department requests report about top 10 populated cities in the world.
   2. Department manager extracts required city information from city table and country table of world database.
   3. Department manager sorts the extracted data by population and limited by 10 to get top 10 populated cities in a city.
   4. Department manager provides the report to the department.
2. The top 10 populated cities in a continent.
   1. Department requests report about top 10 populated cities in a continent.
   2. Department manager extracts city information related with continent from the world database.
   3. Department manager sorts the extracted data by population and are limited by 10 to get top 10 populated cities in a continent.
   4. Department manager provides the report to the Department.
3. The top 10 populated cities in a region.
   1. Department requests report about top 10 populated cities in a region.
   2. Department manager extracts city information related with region from the world database.
   3. Department manager the extracted data by population and are limited by 10 to get top 10 populated cities in a region.
   4. Department manager provides the report to the Department.
4. The top 10 populated cities in a country.
   1. Department requests report about top 10 populated cities in a country.
   2. Department manager extracts city information related with country from the world database.
   3. Department manager sorts the extracted data by population in descending order and are limited by 10 to get top 10 populated cities in a country.
   4. Department manager provides the report to the Department.
5. The top 10 populated cities in a district.
   1. Department requests report about top 10 populated cities in a district.
   2. Department manager extracts city information related with district from the world database.
   3. Department manager sorts the extracted data by population in descending order and are limited by 10 to get top 10 populated cities in a district.
   4. Department manager provides the report to the Department.


## EXTENSIONS

**City name does not exist**:
    1. Department manager informs the department no city name exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4