Feature: Shopping list

  @2
  Scenario: Create list

  Given User should Navigate to the list Page
    When he add items to the basket
    And add one more shopping list
    And delete the item from the first shopping list
    Then the deleted item should not be shown

