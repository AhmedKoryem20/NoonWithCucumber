Feature: Add Multiple products to cart
  Scenario: Add multiple headphones to cart
    Given open the noon website
    When type headphones in search field
    And add your items
    And go to cart page
    Then verify added items in cart with details

