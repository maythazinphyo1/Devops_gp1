# USE CASE: 3 Produce the report about cities in the world, continent, region, country and district organised by largest population to smallest

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *Sale department manager*, I want to produce the report about cities in the world, continent, region, country and district organised by largest population to smallest so that I can decide which cities to target sale promotion.

### Scope

Company.

### Level

Primary.

### Preconditions

We know the population information about each city around the world from world Database.

### Success End Condition

A report is available for sale department manager to target sale promotion.

### Failed End Condition

No report is produced.

### Primary Actor

Sale department manager

### Trigger

A report request for population information is sent to sale department.

## MAIN SUCCESS SCENARIO

1. Report of cities in the world sorted by population in descending order
    1. Sale department request population information for all the cities around the world.
    2. Sale department manager extracts all information of all the cities around in the world.
    3. Sale department manager sorts the extracted information by population in descending.
2. Report of cities in certain continent sorted by population in descending order
   1. Sale department request population information for all the cities in certain continent.
   2. Sale department manager extracts all information of all the cities in certain continent.
   3. Sale department manager sorts the extracted information by population in descending.
3. Report of cities in certain region sorted by population in descending order
   1. Sale department request population information for all the cities in certain region.
   2. Sale department manager extracts all information of all the cities in certain region.
   3. Sale department manager sorts the extracted information by population in descending.
4. Report of cities in certain country sorted by population in descending order
   1. Sale department request population information for all the cities in certain country.
   2. Sale department manager extracts all information of all the cities in certain country.
   3. Sale department manager sorts the extracted information by population in descending.
5. Report of cities in certain district sorted by population in descending order
   1. Sale department request population information for all the cities in certain district.
   2. Sale department manager extracts all information of all the cities in certain district.
   3. Sale department manager sorts the extracted information by population in descending.




## EXTENSIONS

**City population information does not exist**:
    1. Sale department manager informs sale department no information exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4