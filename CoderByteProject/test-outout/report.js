$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Features/TestCase1.feature");
formatter.feature({
  "line": 1,
  "name": "Confirm Facebook URL",
  "description": "",
  "id": "confirm-facebook-url",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Confirm Facebook URL Test scenario",
  "description": "",
  "id": "confirm-facebook-url;confirm-facebook-url-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Crawford homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on facebook link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User confirms the URL of our facebook link on this page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase1StepDefinition.user_is_already_on_Crawford_homepage()"
});
formatter.result({
  "duration": 4457550300,
  "status": "passed"
});
formatter.match({
  "location": "TestCase1StepDefinition.title_of_homepage()"
});
formatter.result({
  "duration": 8756300,
  "status": "passed"
});
formatter.match({
  "location": "TestCase1StepDefinition.user_clicks_on_facebook_link()"
});
formatter.result({
  "duration": 82806800,
  "status": "passed"
});
formatter.match({
  "location": "TestCase1StepDefinition.user_confirms_the_URL_of_our_facebook_link_on_this_page()"
});
formatter.result({
  "duration": 4866754200,
  "status": "passed"
});
formatter.match({
  "location": "TestCase1StepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 27300,
  "status": "passed"
});
});