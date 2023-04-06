@tag
Feature: outline Scenario for reversing integer

  Scenario Outline: integer reversing in outline
    Given input as <number>
    When I Call Calculate in ReverseCalculator
    Then I want <result>

    Examples:
      | number | result |
      | 1      | 1      |
      | 2      | 0.5    |
      | 4      | 0.25   |
      | 5      | 0.2    |
      | -5     | -0.2   |