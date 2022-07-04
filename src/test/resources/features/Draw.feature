Feature: Draw

  Scenario: Should show draw
    Given new game initialized
    And step to [0,0]
    And step to [0,2]
    And step to [0,1]
    And step to [1,0]
    And step to [2,0]
    And step to [1,1]
    And step to [2,1]
    And step to [2,2]
    When step to [1,2]
    Then should show draw