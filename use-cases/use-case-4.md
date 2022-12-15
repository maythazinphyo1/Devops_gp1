# USE CASE: 4 Produce the report of Top 10 populated cities in the world, continent, region, country and district.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *Sale department manager*, I want to produce the report of Top 10 populated cities so sale department manager could know which cities are the most populated to open new stores. 
### Scope

Company.

### Level

Sub function.

### Preconditions

We know the city information such as name, country, district and population from the world database. 

### Success End Condition

A report is available for sale department manager to check top 10 populated cities in the world, in a specific continent, in a region, in a country and in a district for business decision.

### Failed End Condition

No report is produced.

### Primary Actor

Sale department manager

### Trigger

A report request for population information of top 10 cities is sent to sale department.

## MAIN SUCCESS SCENARIO

1. The top 10 populated cities in the world.
   1. Sale department requests report about top 10 populated cities in the world.
   2. HR advisor extracts required city information from city table and country table of world database.
   3. HR advisor sorts the extracted data by population and limited by 10 to get top 10 populated cities in a city.
   4. HR advisor provides the report to Sale Department.
2. The top 10 populated cities in a continent.
   1. Sale department requests report about top 10 populated cities in a continent.
   2. HR advisor extracts city information related with continent from the world database.
   3. HR advisor sorts the extracted data by population and are limited by 10 to get top 10 populated cities in a continent.
   4. HR advisor provides the report to Sale Department.
3. The top 10 populated cities in a region.
   1. Sale department requests report about top 10 populated cities in a region.
   2. HR advisor extracts city information  from the world database.
   3. HR advisor sorts the extracted data by population and are limited by 10 to get top 10 populated cities in a region.
   4. HR advisor provides the report to Sale Department.
4. The top 10 populated cities in a country.
   1. Sale department requests report about top 10 populated cities in a country.
   2. HR advisor extracts city information related with country from the world database.
   3. HR advisor sorts the extracted data by population in descending order and are limited by 10 to get top 10 populated cities in a country.
   4. HR advisor provides the report to Sale Department.
5. The top 10 populated cities in a district.
   1. Sale department requests report about top 10 populated cities in a district.
   2. HR advisor extracts city information related with district from the world database.
   3. HR advisor sorts the extracted data by population in descending order and are limited by 10 to get top 10 populated cities in a district.
   4. HR advisor provides the report to Sale Department.


## EXTENSIONS

**City name does not exist**:
    1. HR advisor informs sale department no city name exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4