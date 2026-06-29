Feature: Verifying errors within invalid credentials in filter by price
  Scenario Outline: error messages when providing invalid credentials in filter by price
    Given opening noon site
    When go to samsung category
    And select filter by price
    And provide invalid price range "<invalidMin>" "<invalidMax>"
    Then verify error messages "<expectedError>"
    Examples:
    |invalidMin       |invalidMax  |expectedError                           |
    |emptyMin         |maximumValue|This field cannot be empty              |
    |minimumValue     |emptyMax    |This field cannot be empty              |
    |emptyMin         |emptyMax    |This field cannot be empty              |
    |negativeMin      |maximumValue|Amount must be greater than zero        |
    |minimumValue     |negativeMax |Amount must be greater than zero        |
    |zeroMin          |zeroMax     |Amount must be greater than zero        |
    |minGreaterThanMax|maximumValue|Max price must be greater than min price|