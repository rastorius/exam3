Feature: Hello World

  Scenario: "Hello World"
    Given DummyService
    When hello
    Then should return Hello World!
