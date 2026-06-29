Feature: Verify that the invoice updated after removing item from the cart
  Scenario: Verification of updating the invoice
    Given noon website opened
    When user is searching for product
    And user added some items to cart
    And user navigate cart page
    And user removed item
    Then verify that the invoice updated

