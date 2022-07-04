Feature: Bot Game

  Scenario: Bot game should end in a correct way
    Given new bot
    When play
    Then should show valid end message
