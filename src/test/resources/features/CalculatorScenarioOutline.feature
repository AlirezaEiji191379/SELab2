Feature: real calculator

  Scenario Outline: calculator with operators
    Given as input <input> and <opt>
    When we call Calculate in CalculatorFacade
    Then we get the <result>

    Examples:
      | input | opt | result |
      | 4     | rvs | 0.25   |
      | 4     | sqr | 2      |
