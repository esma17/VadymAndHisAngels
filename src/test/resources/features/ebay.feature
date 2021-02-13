@1
Feature: As a guest I should be able to land to ebay main page

  Scenario: Guest should be able land main page



    Given User is on the page
    And User sends "phone" to search bar
    Then Title should contain "phone"
