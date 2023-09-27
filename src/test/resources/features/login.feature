@Regression @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And homepage should be displayed.

  Accounts are: hr,marketing,helpdesk

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user go to the login page
@hr
  Scenario: Login with hr
    When User enter hr username and password and click login
    Then User should be able to login

  @helpdesk
  Scenario: Login with helpdesk
    When User enter helpdesk username and password and click login
    Then User should be able to login

    @marketing
  Scenario: Login with marketing
    When User enter marketing username and password and click login
    Then User should be able to login




