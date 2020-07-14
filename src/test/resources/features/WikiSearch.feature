Feature: Wiki title and search verifications

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

  @wiki
  Scenario: Search functionality title verification
    When User searches "Bill Gates" in the wiki search page
    Then User should see "Bill Gates" in the wiki title


  @wiki2
  Scenario Outline: Search functionality title verification
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header

    Examples: Example test data for wikipedia search
      | searchValue   | expectedTitle | expectedMainHeader | expectedImageHeader |
      | Bill Gates    | Bill Gates    | Bill Gates         | Bill Gates          |
      | John Travolta | John Travolta | John Travolta      | John Travolta       |
      | Keanu Reeves  | Keanu Reeves  | Keanu Reeves       | Keanu Reeves        |

