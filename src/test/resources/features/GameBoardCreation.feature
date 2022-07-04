Feature: Game Board Creation

  Scenario: Should show empty board
    Given new game
    When initialize
    Then should show empty board

  Scenario: Should show board creation messages
    Given new game
    When initialize
    Then should show board creation messages