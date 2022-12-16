# USE CASE: 7 Produce the report about the population of people, people who are living in cities, and who are not living in cities in each continent, region and country.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *Department Manager*, I want to produce the report about the population of people, people who are living in cities, and who are not living in cities in each continent, region and country so that I can give a report about which cities have more people living in cities than others.
### Scope

Company.

### Level

Primary Task.

### Preconditions

We know the population, city, spoken language information about cities around the world from world Database.

### Success End Condition

A report is available for Department manager about the population of people, people who are living in cities, and who are not living in cities in each continent, region and country.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager

### Trigger

A report request for population information is sent to Department.

## MAIN SUCCESS SCENARIO

1. The report about the population of people, people who are living in cities, and who are not living in cities in each continent
    1. Department Manager extracts all information of all cities in the world.
    2. Department Manager then calculate the extracted information of population in cities and show result about who are living in cities and who are not living in cities in each continent.
    3. Department Manager provides report to Department.
2. The report about the population of people, people who are living in cities, and who are not living in cities in each region
   1. Department Manager extracts all information of all cities in the world.
   2. Department Manager then calculate the extracted information of population in cities and show result about who are living in cities and who are not living in cities in each region.
   3. Department Manager provides report to Department.
3. The report about the population of people, people who are living in cities, and who are not living in cities in each country
   1. Department Manager extracts all information of all cities in the world.
   2. Department Manager then calculate the extracted information of population in cities and show result about who are living in cities and who are not living in cities in each country.
   3. Department Manager provides report to Department.


## EXTENSIONS

None.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.5