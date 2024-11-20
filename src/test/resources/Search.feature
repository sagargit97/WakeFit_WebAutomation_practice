Feature: Search for a product and verify suggestion

  As a user,
  I want to search for products on the Wakefit website,
  So that I can quickly find what I'm looking for.

  Scenario: Searching for a specific product
    Given url set to open website
    Then click on the search bar
    And enter "mattress" in search bar
    Then  should see a list of products related to "Mattress"
    When no products are shown
    Then capture and display the error message




