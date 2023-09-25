@Regression @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: hr,marketing,helpdesk

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the crm login page

  @hr
  Scenario: Login as hr
    When user enters librarian username
    And user enters librarian password
    Then user should see the group pages

  @helpdesk
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @marketing
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

#this is how we add comments in feature file