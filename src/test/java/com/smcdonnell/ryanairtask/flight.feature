Feature: Ryanair flight Search

  Scenario: Search for flights and reserve seats
    Given I am on the Ryanair Search page
    When I search for flights
    And I select my flights
    And I go to the Services Section and enter the passenger names
    And I reserve my seats
    Then I close browser session