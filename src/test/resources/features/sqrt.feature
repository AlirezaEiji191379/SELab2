@tag
Feature: Get Sqrt of integer


  Scenario: sqrt of an integer
    Given integer input as 9
    When I Call Calculate in SqrtCalculator
    Then as output I see "3"
