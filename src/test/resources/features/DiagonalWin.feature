Feature: Diagonal Win

  Scenario: Should show X win diagonal #1 [0,4,8]
    Given new game initialized
    And step to [0,0]
    And step to [0,1]
    And step to [1,1]
    And step to [1,2]
    When step to [2,2]
    Then should show win with X

  Scenario: Should show O win diagonal #1 [0,4,8]
    Given new game initialized
    And step to [0,1]
    And step to [0,0]
    And step to [1,0]
    And step to [1,1]
    And step to [1,2]
    When step to [2,2]
    Then should show win with O
