Feature: Ryanair flight Search

  Scenario Outline: Search for flights and reserve seats
    Given I am on the Ryanair Search page
    When I search for flight "<origin>" to "<destination>"
    And I select my flights
    And I go to the Services Section and enter the passenger names
    And I reserve my seats
    Then I verify the seat were selected

  Examples:
  | origin | destination |
  | DUB    | STN         |
