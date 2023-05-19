Feature: Search functionality
@smoke @regression
  Scenario Outline: verify Job Search Result Using Different DataSet
    Given I am on homePage
    When I accept cookies
    And I enter Job Title "<Title>"
    And I Enter Location "<Location>"
    And I select Distance "<Distance>"
    And  I click On more Search Option Link
    And I enter Min Salary "<Min Salary>"
    And I enter Max Salary "<Max Salary>"
    And I select salary Type "<salary Type>"
    And I select Job Type "<Job Type>"
    And I click On find Job Button
    Then Verify the "Result Display"
  Examples:
    | Title               | Location   | Distance | Min Salary | Max Salary | salary Type | Job Type  |
    | Automation Tester   | London     | 10 miles | 35000      | 45000      | Per annum   | Contract  |
    | Automation Engineer | London     | 15 miles | 38000      | 48000      | Per annum   | Contract  |
    | Manual Tester       | Luton      | 25 miles | 30000      | 45000      | Per annum   | Permanent |
    | Retail Assistant    | Manchester | 35 miles | 1500       | 2000       | Per month   | Permanent |
    | Warehouse Operative | London     | 10 miles | 10         | 12         | Per hour    | Contract  |
    | Supervisor          | London     | 25 miles | 20000      | 30000      | Per annum   | Contract  |












