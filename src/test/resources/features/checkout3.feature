@focus
Feature: Checkout2

  Scenario Outline:
    Given the prices as follows
      | name    | price |
      | apple   | 25    |
      | unknown | 100   |
      | potato  | 1     |
      | banana  | 40    |
    When I checkout a cart of <Banana#>, <Apple#>,<Potato#>,<Unknown#>
    Then the NEW total price should be <total>

    Examples:
      | Banana# | Apple# | Potato# | Unknown# | total |
      | 1       | 0      | 0       | 0        | 40    |
      | 2       | 0      | 0       | 0        | 80    |
      | 1       | 1      | 0       | 0        | 65    |
      | 0       | 0      | 0       | 1        | 100   |
      | 0       | 0      | 1       | 0        | 1     |
      | 0       | 2      | 1       | 0        | 51    |
