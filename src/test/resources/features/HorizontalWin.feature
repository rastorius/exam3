Feature: Horizontal Win

  Scenario: Should show X win horizontal #1 [0,1,2]
    Given new game initialized
    And step to [0,0]
    And step to [1,1]
    And step to [0,1]
    And step to [1,2]
    When step to [0,2]
    Then should show win with X

  Scenario: Should show O win horizontal #1 [0,1,2]
    Given new game initialized
    And step to [2,2]
    And step to [0,0]
    And step to [2,1]
    And step to [0,1]
    And step to [1,2]
    When step to [0,2]
    Then should show win with O

  Scenario: Should show X win horizontal #1 [3,4,5]
    Given new game initialized
    And step to [1,0]
    And step to [0,1]
    And step to [1,1]
    And step to [0,2]
    When step to [1,2]
    Then should show win with X

  Scenario: Should show O win horizontal #1 [3,4,5]
    Given new game initialized
    And step to [0,0]
    And step to [1,0]
    And step to [2,1]
    And step to [1,2]
    And step to [0,2]
    When step to [1,1]
    Then should show win with O
