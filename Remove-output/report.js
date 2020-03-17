$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/resources/NewPatient.feature");
formatter.feature({
  "name": "Scenarios",
  "description": "In order to check if the application is working as required",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LoginValidCredentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have browse with openemrpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027admin\u0027 and I enter password as \u0027pass\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with the title as \u0027openemr\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});