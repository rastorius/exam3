Feature: Step

  Scenario: Should show correct board after first step
    Given new game initialized
    When step to [1,1]
    Then should show board
      | | | | |X| | | | |
