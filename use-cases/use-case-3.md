# USE CASE: 3 Produce the report about cities in the world, continent, region, country and district organised by largest population to smallest

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *Department Manager*, I want to produce the report about cities in the world, continent, region, country and district organised by largest population to smallest so that I can decide which cities to target sale promotion.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the population information about each city around the world from world Database.

### Success End Condition

A report is available for the department manager to target sale promotion.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager

### Trigger

A report request for population information is sent to the department.

## MAIN SUCCESS SCENARIO

1. Report of cities in the world sorted by population in descending order
    1. Department request population information for all the cities around the world.
    2. Department Manager extracts all information of all the cities around in the world.
    3. Department Manager sorts the extracted information by population in descending.
    4. Department Manager provides the report to the sale department.
2. Report of cities in certain continent sorted by population in descending order
   1. Department request population information for all the cities in certain continent.
   2. Department Manager extracts all information of all the cities in certain continent.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides the report to the sale department.
3. Report of cities in certain region sorted by population in descending order
   1. Department request population information for all the cities in certain region.
   2. Department Manager extracts all information of all the cities in certain region.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides the report to the sale department.
4. Report of cities in certain country sorted by population in descending order
   1. Department request population information for all the cities in certain country.
   2. Department Manager extracts all information of all the cities in certain country.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides the report to the sale department.
5. Report of cities in certain district sorted by population in descending order
   1. Department request population information for all the cities in certain district.
   2. Department Manager extracts all information of all the cities in certain district.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides the report to the sale department.

## EXTENSIONS

**City population information does not exist**:
    1. Department Manager informs sale department no information exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4