# USE CASE: 1 Produce the report about population of the countries in the world, continent and region

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *Department Manager*, I want to produce the report about population of the countries in the world, continent and region so that I can support report for which countries meet the market requirement.
### Scope

Company.

### Level

Primary task.

### Preconditions

We know the population, city, spoken language information about countries around the world from world Database.

### Success End Condition

A report is available for the department manager to check which countries meet the market requirement.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager

### Trigger

A report request for population information is sent to the department.

## MAIN SUCCESS SCENARIO

1. As a *Department Manager*, I want to produce the report about population of the countries in the world so that I can support report for which countries meet the market requirement.
   1. Department request population information for all the countries in the world.
   2. Department Manager extracts all information of all countries in the world.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides report to the department.
2. As a *Department Manager*, I want to produce the report about population of the countries in the certain continent so that I can support report for which countries meet the market requirement.
   1. Department request population information for all the countries in the certain continent.
   2. Department Manager extracts all information of all countries from certain continent.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides report to the Department.
3. As a *Department Manager*, I want to produce the report about population of the countries in the certain region so that I can support report for which countries meet the market requirement.
   1. Department request population information for all the countries in certain region.
   2. Department Manager extracts all information of all countries from certain region.
   3. Department Manager sorts the extracted information by population in descending.
   4. Department Manager provides report to the Department.


## EXTENSIONS

**Country population information does not exist**:
    1. Department Manager informs department no information exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 0.1.0.4