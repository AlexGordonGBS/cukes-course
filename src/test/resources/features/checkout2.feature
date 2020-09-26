@focus
Feature: Checkout2

  Background: Load prices from table
    Given the prices as follows
      | name    | price |
      | apple   | 25    |
      | unknown | 100   |
      | potato  | 1     |
      | banana  | 40    |

  Scenario: Checkout a banana
    When I checkoutNEW 1 "banana"
    Then the NEW total price should be 40c

  Scenario: Two bananas scanned separately
    When I checkoutNEW 1 "banana"
    And I checkoutNEW 1 "banana"
    Then the NEW total price should be 80c

  Scenario: A banana and an apple
    When I checkoutNEW 1 "banana"
    And I checkoutNEW 1 "apple"
    Then the NEW total price should be 65c

  Scenario: Checkout an unknown
    When I checkoutNEW 1 "unknown"
    Then the NEW total price should be 100c

  Scenario: Checkout an potato
    When I checkoutNEW 1 "potato"
    Then the NEW total price should be 1c

  Scenario: Checkout an potato and apple
    When I checkoutNEW 1 "potato"
    And I checkoutNEW 2 "apple"
    Then the NEW total price should be 51c

