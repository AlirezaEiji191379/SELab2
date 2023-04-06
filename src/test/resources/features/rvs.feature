@tag
Feature: reverse feature
  # Enter feature description here

  Scenario: reveres an integer
    Given Input as 2
    When I Call Calulate from ReverseCalculator
    Then I Expect "0.5"
