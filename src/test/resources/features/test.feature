Feature: Test

  Scenario: Checkout a banana
    * the price of a "banana" is 40c
#    wrongKeyword: test
    * I checkout 1 "banana"
    * the total price should be 40c

  Scenario: Two bananas scanned separately
    * the price of a "banana" is 40c
    * I checkout 1 "banana"
    * I checkout 1 "banana"
    Given the total price should be 80c

  Scenario: A banana and an apple
    Given the price of a "banana" is 40c
    And the price of a "apple" is 25c
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then the total price should be 65c

#  BAD case!!!
#  Scenario: Checkout an unknown
#    Given the price of a "unknown" is 33c
#    When I checkout 1 "unknown"
#    Then the total price should be 33c

