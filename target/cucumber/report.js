$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flight.feature");
formatter.feature({
  "line": 1,
  "name": "Ryanair flight Search",
  "description": "",
  "id": "ryanair-flight-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for flights and reserve seats",
  "description": "",
  "id": "ryanair-flight-search;search-for-flights-and-reserve-seats",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Ryanair Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for flights",
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
  "name": "I close browser session",
  "keyword": "Then "
});
formatter.match({
  "location": "mainTest.goToRyanairSearchPage()"
});
formatter.result({
  "duration": 5900223567,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.search_for()"
});
formatter.result({
  "duration": 2655261569,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.flightSelection()"
});
formatter.result({
  "duration": 34054782703,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.groupServicePassagerInformation()"
});
formatter.result({
  "duration": 7099080588,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.reserveSeats()"
});
formatter.result({
  "duration": 2807068938,
  "status": "passed"
});
formatter.match({
  "location": "mainTest.browserClose()"
});
formatter.result({
  "duration": 16545163374,
  "status": "passed"
});
});