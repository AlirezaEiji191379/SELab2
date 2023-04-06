
Feature: outline Sqrt

  Scenario Outline: outline sqrt calculator
    Given integer inputs as <number>
    When we call calculate in SqrtCalculatorOperator
    Then we get results <result>
    Examples:
      | number | result |
      | 1      | 1      |
      | 4      | 2      |
      | 9      | 3      |
      | 16     | 4      |
      | 25     | 5      |
