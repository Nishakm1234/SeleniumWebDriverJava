
Feature: Login into Application 

  Scenario: Positive test validating login
    Given Initialize the driver with Chrome
    And Navigate to "https://qaclickacademy.com" site
    And click on Login link in home page to land on secure sign in page
    When User enters <username> and <password> and logs in
    Then Verify that the user is successfully logged in
    And Close browsers
   
Examples:
|username					|password					|
|test99@gmail.com |123456						|
|test123@gmail.com|12345						|