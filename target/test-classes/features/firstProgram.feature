#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Application Login

Background: 
		
    When launch the browser from config variables
    Then Hit the home page url

  @RegressionTest
  Scenario: Admin Page Login
  
    Given User is on netbanking landing page
    When User login to application with user1 and password 1234
    Then Home page is displayed
    And Card details are displayed
    
  @RegressionTest
  Scenario: User Page Login
  
    Given User is on netbanking landing page
    When User login to application with "user2 and password "pass2"
    Then Home page is displayed
    And Card details are displayed
    
## parameterization   
  @SmokeTest @RegressionTest
  Scenario Outline: User Page Login
  
    Given User is on netbanking landing page
    When User login to application with "<username>" and password "<password>"
    Then Home page is displayed
    And Card details are displayed
    
  Examples:
   | username | password |
   |  user3   |   pass3  |
   |  user4   |   pass4  |
   |  user5   |   pass5  |
    
  @SmokeTest  
  Scenario: User Page SignUp
  
    Given User is on practice landing page
    When User signup int to application with
		|      anu      |
		|    kunjumon   |
		| anu@gmail.com |
		|  9075658990   |
    Then Home page is displayed
    And Card details are displayed
