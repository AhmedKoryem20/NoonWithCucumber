Feature: Add Multiple products to cart then verify all products details in cart
  Scenario: Add multiple headphones to cart and verify their details in cart page
    Given open the noon website
    When type headphones in search field
    And add your items
    And go to cart page
    And verify added items in cart with cost details
    Then verify products selected are shown in cart
