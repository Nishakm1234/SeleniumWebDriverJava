
Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking Login Page
    When User login into application with username "Nisha" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

    Scenario: Home page default login
    Given User is on NetBanking Login Page
    When User login into application with username "Neha" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"