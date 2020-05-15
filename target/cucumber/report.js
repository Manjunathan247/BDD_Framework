$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon_Login.feature");
formatter.feature({
  "line": 1,
  "name": "Validating Login functionality for Amazon site",
  "description": "\r\nAs a user \r\nI want to login with valide crenentials\r\nSo that I can place an order",
  "id": "validating-login-functionality-for-amazon-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "User can able to login with valide credentials",
  "description": "",
  "id": "validating-login-functionality-for-amazon-site;user-can-able-to-login-with-valide-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@AmazonLogin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user in \"https://www.amazon.in/\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user click on sign in button it shoud display Amazon signin page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enter mail id then click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enter password then click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be in home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 9
    }
  ],
  "location": "AmazonLogin.user_in_something_page(String)"
});
formatter.result({
  "duration": 158115700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.user_click_on_sign_in_button_it_shoud_display_amazon_signin_page()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.user_enter_mail_id_then_click_on_continue_button()"
});
formatter.result({
  "duration": 23700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.user_enter_password_then_click_on_login_button()"
});
formatter.result({
  "duration": 73700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.user_should_be_in_home_page()"
});
formatter.result({
  "duration": 23500,
  "status": "passed"
});
});