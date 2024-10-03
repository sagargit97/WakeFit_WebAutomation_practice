Feature: Product search functionality for WakeFit

  As a user,
  I want to search for products on the Wakefit website,
  So that I can quickly find what I'm looking for.

  Scenario: Searching for a specific product
    Given given url for the website
    Then navigate to search bar
    When the user enters a product name "mattress" in the search bar
    Then related products should appear in the suggestions
    But if no suggestions are available, display the error message "No Products Found for xyz"