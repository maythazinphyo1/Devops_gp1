# USE CASE: 5 Produce the report of all the capital cities in the world, a continent and a region organised by largest population to smallest.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *Department manager*, I want to produce the report of all the capital cities in the world, continent and region organised by largest population to smallest for analysis.
### Scope

Company.

### Level

Primary task

### Preconditions

We know the capital information (capital name, country, population) from the related tables of the world database.

### Success End Condition

A report is available for the department to analyse the population of capital cities in the world, in a continent and region for market requirement.

### Failed End Condition

No report is produced.

### Primary Actor

Department manager 

### Trigger

A report request for sorted population information of capital cities is sent to the department.

## MAIN SUCCESS SCENARIO

1. All the capital cities in the world organised by largest population to smallest.
   1. Department requests report of all the capital cities in the world organised by largest population to smallest.
   2. Department manager extracts required capital cities information from related tables of world database.
   3. Department manager sorts the extracted data by population in descending order.
   4. Department manager provides the report to the Department.
2. All the capital cities in a continent organised by largest population to smallest.
   1. Department requests report of all the capital cities in a  continent organised by largest population to smallest.
   2. Department manager extracts required capital cities information from related tables of world database.
   3. Department manager sorts the extracted data by population in descending order.
   4. Department manager provides the report to the Department.
3. All the capital cities in a region organised by largest to smallest.
   1. Department requests report of all the capital cities in a  region organised by largest population to smallest.
   2. Department manager extracts required capital cities information from related tables of world database.
   3. Department manager sorts the extracted data by population in descending order.
   4. Department manager provides the report to the Department.

## EXTENSIONS

**Capital name does not exist**:
    1. Department manager informs the department no capital name exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4