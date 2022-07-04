Feature: Win

  Scenario: Should show win horizontal #1 [0,1,2]
    Given new game initialized
    And step to [0,0]
    And step to [1,1]
    And step to [0,1]
    And step to [1,2]
    When step to [0,2]
    Then should show win with X
