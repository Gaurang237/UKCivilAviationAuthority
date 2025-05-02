# Selenium BDD Framework with Java, Maven, and Cucumber

## Overview

This project is a Test Automation Framework built using Java, Selenium WebDriver, Cucumber (BDD), and Maven. 
The framework is designed for cross-browser testing and generates detailed Cucumber reports after execution.

## Technology Used
 - Java (Programming Language)
 - Selenium WebDriver (Browser Automation)
 - Cucumber (BDD Framework)
 - Maven (Build Tool)
 - JUnit/TestNG (Test Runner)
 - IntelliJ IDEA (IDE)

## Getting started
1. Clone the Repository
   - git clone https://github.com/Gaurang237/UKCivilAviationAuthority.git

2. Import the Project in IntelliJ IDEA
   - Open IntelliJ IDEA
   - Select Import Project
   - Choose the cloned project and select Maven as the project type

3. Install Dependencies
   - Maven will automatically download the dependencies specified in the pom.xml.

##  Running the Tests
   - Navigate to src/test/java/resources/featuresfile/jobsearch.feature
   - Run the test from the feature file

##  Cross-Browser Testing
   - Navigate to src/test/java/resources/propertiesfile/config.properties
   - just change browser name  for eg. edge or chrome or firefox
   - You can execute tests on different browsers by change name in confige.properties file

##  Cucumber Reports
   - After test execution, Cucumber HTML reports are generated automatically in the /target/cucumber-reports directory.
   - To view the report:
       1. Navigate to /target/cucumber-reports
       2. Open cucumber-html-reports.html in your browser

##  Features
   - Selenium WebDriver for UI automation
   - BDD with Cucumber and Gherkin syntax
   - Cross-browser testing (Chrome, Firefox, Edge)
   - Cucumber HTML reporting
   - Page Object Model (POM) design pattern

##  How to Add a New Test
   - Create a new .feature file in src/test/java/resources/featuresfile
   - Define step definitions in src/test/java/com/UkAuthority/steps
   - Add page actions in src/main/java/com/UkAuthority/pages


     #### Happy Testing! 🚀
