Feature: Game Board Creation

  Scenario: Should show empty board
    Given new tic-tact-toe service
    When initialize
    Then should show empty board

  Scenario: Should show board creation messages
    Given new tic-tact-toe service
    When initialize
    Then should show board creation messages