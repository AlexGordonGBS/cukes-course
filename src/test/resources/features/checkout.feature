#garbage here
#@focus
#@wip

  #TODO after
  # outline
  # return (cancel) a banana

Feature: Checkout

  Background: Load prices
    Given the price of a "banana" is 40c
    And the price of a "apple" is 25c
    And the price of a "unknown" is 100c
    And the price of a "potato" is 1c

  Scenario: Checkout a banana
#    Given the price of a "banana" is 40c
#    wrongKeyword: test
    When I checkout 1 "banana"
    Then the total price should be 40c

  Scenario: Two bananas scanned separately
#    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    And I checkout 1 "banana"
#  wrongKeyword2: test
    Then the total price should be 80c

  Scenario: A banana and an apple
#    Given the price of a "banana" is 40c
#    And the price of a "apple" is 25c
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then the total price should be 65c

#  BAD case!!!
  Scenario: Checkout an unknown
#    Given the price of a "unknown" is 33c
    When I checkout 1 "unknown"
    Then the total price should be 100c

  Scenario: Checkout an potato
    When I checkout 1 "potato"
    Then the total price should be 1c

  Scenario: Checkout an potato and apple
    When I checkout 1 "potato"
    And I checkout 2 "apple"
    Then the total price should be 51c
