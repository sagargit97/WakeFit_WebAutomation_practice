Feature: Product search functionality for WakeFit

  As a user,
  I want to search for products on the Wakefit website,
  So that I can quickly find what I'm looking for.

  Scenario: Searching for a specific product
    Given g iven url for the website
    Then navigate to search bar
    And enter the product name as "Mattress"
    Then should see a list of products related to "Mattress" then clear the search bar
    And again navigate to search bar enter "xyz"
    Then check if result is not getting, get the error message "No Products Found for xyz"



  Scenario: Search for a product and verify suggestion
    Given url set to open website
    When click on the search bar
    And enter "mattress" in search bar
    Then should see a list of products related to "mattress"
    When no products are shown
    Then capture and display the error message
