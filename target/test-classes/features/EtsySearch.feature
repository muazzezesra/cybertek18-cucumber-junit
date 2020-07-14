Feature: Etsy search feature
  Agile story: User should be able to enter search terms and see relevant results in the page and in the title.


  Background: User is on the etsy home page
    Given User is on the etsy home page

  @etsyWip
  Scenario: Title verification
    Then User should see title is as expected

    #Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @2etsyWip
  Scenario: Title verification after search term
    Then User types "Wooden spoon" in the search box
    And User clicks to search button
    Then User should see "Wooden spoon" in the etsy title