# USE CASE: 6 Produce the report about the top 10 populated capital cities in the world, continent and region

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *Department Manager*, I want to produce the report about top 10 populated cities in the world, continent and region so that I can give a report about most populated cities around the world to select the city to open next branch.
### Scope

Company.

### Level

Sub function.

### Preconditions

We know the population, city, spoken language information about capital cities around the world from world Database.

### Success End Condition

A report is available for Department manager about most populated cities around the world to select the city to open next branch.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager

### Trigger

A report request for population information is sent to Department.

## MAIN SUCCESS SCENARIO

1. The top 10 populated capital cities in the world.
   1. Department Manager extracts all information of all capital cities in the world.
   2. Department Manager sorts the extracted information by population in descending order and select top 10 capital cities.
   3. Department Manager provides report to Department.
2. The top 10 populated capital cities in the continent.
   1. Department Manager extracts all information of all capital cities in the continent.
   2. Department Manager sorts the extracted information by population in descending order and select top 10 capital cities.
   3. Department Manager provides report to Department.
3. The top 10 populated capital cities in the region.
   1. Department Manager extracts all information of all capital cities in the region.
   2. Department Manager sorts the extracted information by population in descending order and select top 10 capital cities.
   3. Department Manager provides report to Department.


## EXTENSIONS

None.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.5