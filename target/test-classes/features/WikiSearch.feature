Feature: Wiki title and search verifications

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

    @wiki
    Scenario: Search functionality title verification
      When User searches "Bill Gates" in the wiki search page
      Then User should see "Bill Gates" in the wiki title