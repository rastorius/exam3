Feature: Step

  Scenario: Should show correct board after first step
    Given new game initialized
    When step to [1,1]
    Then should show board
      | | | | |X| | | | |

  Scenario: Should show correct header after first step
    Given new game initialized
    When step to [1,1]
    Then should show step header with X

  Scenario: Switch player after step
    Given new game initialized
    And step to [1,1]
    When step to [1,2]
    Then should show board
      | | | | |X|O| | | |