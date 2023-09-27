@NEXT-1344
Feature: WorkGroup feature

User Story:
As a user, I want to join workGroups, so that I can use groups feature.
@NEXT-1356 @NEXT-1362 @NEXT-1363
@joinGrp
Scenario Outline: : As a user, I should be able to join groups.
    Given user is enter  "<username>" and "<password>"
    When user should see home page
    And user should click the Workgroups button
    And user click the join button under New Corporate Identity project
    And user click the join button under New company web site development
    And user click the join button under New product development
    And user click the join button under PR and advertising
    And user click the join button under Sales
    Then user click the join button under Technology


  Examples:
    | username                      | password |
    | hr1@cybertekschool.com        | UserUser |
    | helpdesk1@cybertekschool.com  | UserUser |
    | marketing2@cybertekschool.com | UserUser |


  @sortGroup
    @NEXT-1365 @NEXT-1366 @NEXT-1367
  Scenario Outline: User should be able to sort the groups.
    Given user is enter  "<username>" and "<password>"
    When user should see home page
    And user should click the Workgroups button
    And user click the SORT BY dropdown menu
    And user click the ABC order
    And user click the SORT BY dropdown menu
    And user click the time joined button
    And user click the SORT BY dropdown menu
    And user click the last viewed
    And user click the SORT BY dropdown menu
    And user click the Number of Members
    And user click the SORT BY dropdown menu
    And user click the last active
    And user click the SORT BY dropdown menu
    Then user click the time created

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com | UserUser |

  @NEXT-1373
    @LeaveGrp
  Scenario Outline: : As a user, I should be able to join groups and should be able to leave groups.
    Given user is enter  "<username>" and "<password>"
    When user should see home page
    And user should click the Workgroups button
    Then user Enter the New Corporate Identity project and click warning button



    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com | UserUser |







