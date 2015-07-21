$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flight.feature");
formatter.feature({
  "line": 1,
  "name": "Ryanair flight Search",
  "description": "",
  "id": "ryanair-flight-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search for flights and reserve seats",
  "description": "",
  "id": "ryanair-flight-search;search-for-flights-and-reserve-seats",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on the Ryanair Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for flight \"\u003corigin\u003e\" to \"\u003cdestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select my flights",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Services Section and enter the passenger names",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I reserve my seats",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the seat were selected",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "ryanair-flight-search;search-for-flights-and-reserve-seats;",
  "rows": [
    {
      "cells": [
        "origin",
        "destination"
      ],
      "line": 12,
      "id": "ryanair-flight-search;search-for-flights-and-reserve-seats;;1"
    },
    {
      "cells": [
        "DUB",
        "STN"
      ],
      "line": 13,
      "id": "ryanair-flight-search;search-for-flights-and-reserve-seats;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Search for flights and reserve seats",
  "description": "",
  "id": "ryanair-flight-search;search-for-flights-and-reserve-seats;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on the Ryanair Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for flight \"DUB\" to \"STN\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select my flights",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Services Section and enter the passenger names",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I reserve my seats",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the seat were selected",
  "keyword": "Then "
});
formatter.match({
  "location": "mainTest.goToRyanairSearchPage()"
});
formatter.result({
  "duration": 5293527412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DUB",
      "offset": 21
    },
    {
      "val": "STN",
      "offset": 30
    }
  ],
  "location": "mainTest.searchForFlight(String,String)"
});
formatter.result({
  "duration": 2901533113,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.flightSelection()"
});
formatter.result({
  "duration": 24468041338,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.groupServicePassagerInformation()"
});
formatter.result({
  "duration": 5362872736,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.reserveSeats()"
});
formatter.result({
  "duration": 2349509996,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.verifyAndBrowserClose()"
});
formatter.result({
  "duration": 356906678,
  "status": "passed"
});
});