$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/calculator.feature");
formatter.feature({
  "name": "As a user I want to add two numbers to avoid human mistakes",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add two whole numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I insert the numbers \"50\" and \"80\" in my calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.insertNumbers(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"add\" button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.i_click_on_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my calculator displays the result \"130\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.checkResult(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("features/login.feature");
formatter.feature({
  "name": "As a user I want to log in my application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "seleniumSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I insert User Information",
  "keyword": "When "
});
formatter.match({
  "location": "seleniumSteps.insertUserInfo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the welcome message \"Welcome back to Mercury Tours!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.iAmLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
});