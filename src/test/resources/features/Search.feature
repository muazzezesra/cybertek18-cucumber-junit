Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page.

  Background: User should be on google search page
    Given  User is on the google search page

  Scenario: Google default title verification
    Then User should see title is Google

  @wip #work in progress
  Scenario: Google title verification after search
    When User searches "apple"
    Then User should see "apple" in the title

  @About
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks About link
    Then User should see title Google - About Google, Our Culture & Company News

    @footer
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |