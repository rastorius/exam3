Feature: Vertical Win

  Scenario: Should show X win vertical #1 [0,3,6]
    Given new game initialized
    And step to [0,0]
    And step to [1,1]
    And step to [1,0]
    And step to [1,2]
    When step to [2,0]
    Then should show win with X

  Scenario: Should show O win vertical #1 [0,3,6]
    Given new game initialized
    And step to [1,0]
    And step to [0,0]
    And step to [1,1]
    And step to [1,0]
    And step to [2,2]
    When step to [2,0]
    Then should show win with O

  Scenario: Should show X win vertical #2 [1,4,7]
    Given new game initialized
    And step to [0,1]
    And step to [0,2]
    And step to [1,1]
    And step to [1,2]
    When step to [2,1]
    Then should show win with X

  Scenario: Should show O win vertical #2 [1,4,7]
    Given new game initialized
    And step to [1,0]
    And step to [0,1]
    And step to [1,2]
    And step to [1,1]
    And step to [2,2]
    When step to [2,1]
    Then should show win with O

  Scenario: Should show X win vertical #3 [2,5,8]
    Given new game initialized
    And step to [0,2]
    And step to [0,0]
    And step to [1,2]
    And step to [1,1]
    When step to [2,2]
    Then should show win with X
