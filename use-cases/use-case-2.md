# USE CASE: 2 Produce the report about top 10 most populated countries in the world, continent and region

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *HR Advisor*, I want to produce the report about top 10 most populated countries in the world, continent and region so that I can check which countries meet the market requirement.

### Scope

Company.

### Level

Sub function.

### Preconditions

We know the population, city, spoken language information about countries around the world from world Database.

### Success End Condition

A report is available for sale department manager to check which countries meet the market requirement.

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor

### Trigger

A report request for population information is sent to sale department.

## MAIN SUCCESS SCENARIO
1. top 10 most populated countries in the world
   1. Sale department request population information for top 10 most populated countries in the world.
   2. HR advisor extracts all information of top 10 most populated countries in the world.
   3. HR advisor sorts the extracted information by population in descending.
   4. HR advisor provides report to Sale Department.

2. top 10 most populated countries in the continent
   1. Sale department request population information for top 10 most populated countries in the certain continent.
   2. HR advisor extracts all information of top 10 most populated countries from certain continent.
   3. HR advisor sorts the extracted information by population in descending.
   4. HR advisor provides report to Sale Department.

3. top 10 most populated countries in the region
   1. Sale department request population information for top 10 most populated countries in certain region.
   2. HR advisor extracts all information of top 10 most populated countries from certain region.
   3. HR advisor sorts the extracted information by population in descending.
   4. HR advisor provides report to Sale Department.


## EXTENSIONS

**Country population information does not exist**:
    1. HR advisor informs sale department no information exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4