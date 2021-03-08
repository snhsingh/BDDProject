$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/AddItemToCart.feature");
formatter.feature({
  "name": "To test whether the item is added into the cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the item is added in the cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logged in with valid login credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "AddItemToCartSteps.user_logged_in_with_valid_login_credentials()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitionFiles.AddItemToCartSteps.user_logged_in_with_valid_login_credentials(AddItemToCartSteps.java:42)\r\n\tat ✽.User logged in with valid login credentials(file:src/test/java/features/AddItemToCart.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User hover on dresses and click on summer dresses",
  "keyword": "When "
});
formatter.match({
  "location": "AddItemToCartSteps.user_hover_on_dresses_and_click_on_summer_dresses()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User adds any one item to the cart by clicking “Add to Cart”",
  "keyword": "And "
});
formatter.match({
  "location": "AddItemToCartSteps.user_adds_any_one_item_to_the_cart_by_clicking_add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Continue shopping button",
  "keyword": "Then "
});
formatter.match({
  "location": "AddItemToCartSteps.user_clicks_on_continue_shopping_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User adds one more item",
  "keyword": "And "
});
formatter.match({
  "location": "AddItemToCartSteps.user_adds_one_more_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Proceed to Checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "AddItemToCartSteps.user_clicks_on_proceed_to_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validates whether 2 items are added in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddItemToCartSteps.user_validates_whether_items_are_added_in_the_cart(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/LoginPage.feature");
formatter.feature({
  "name": "To test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browser launched",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.browser_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the logo",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see Logo Image",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.User_is_able_to_see_Logo_Image()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitionFiles.LoginStep.User_is_able_to_see_Logo_Image(LoginStep.java:42)\r\n\tat ✽.User is able to see Logo Image(file:src/test/java/features/LoginPage.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Check the details in the login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "And "
});
formatter.step({
  "name": "user is able to verify Contact us and Sign In links on the page",
  "keyword": "And "
});
formatter.step({
  "name": "User cliks on Sign In link",
  "keyword": "When "
});
formatter.step({
  "name": "User provides \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to see error on invalid login and  able to see Qurate selenium tab on the next page with valid login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "abc@bdd.com",
        "12345"
      ]
    },
    {
      "cells": [
        "qurate@bdd.com",
        "qurate"
      ]
    }
  ]
});
formatter.background({
  "name": "browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browser launched",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.browser_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the details in the login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to verify Contact us and Sign In links on the page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_is_able_to_verify_contact_us_and_sign_in_links_on_the_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitionFiles.LoginStep.user_is_able_to_verify_contact_us_and_sign_in_links_on_the_page(LoginStep.java:61)\r\n\tat ✽.user is able to verify Contact us and Sign In links on the page(file:src/test/java/features/LoginPage.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User cliks on Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_cliks_on_sign_in_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User provides abc@bdd.com and 12345",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_provides_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to see error on invalid login and  able to see Qurate selenium tab on the next page with valid login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_should_be_able_to_see_error_on_invalid_login_and_able_to_see_qurate_selenium_tab_on_the_next_page_with_valid_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browser launched",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.browser_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the details in the login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to verify Contact us and Sign In links on the page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_is_able_to_verify_contact_us_and_sign_in_links_on_the_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitionFiles.LoginStep.user_is_able_to_verify_contact_us_and_sign_in_links_on_the_page(LoginStep.java:61)\r\n\tat ✽.user is able to verify Contact us and Sign In links on the page(file:src/test/java/features/LoginPage.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User cliks on Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_cliks_on_sign_in_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User provides qurate@bdd.com and qurate",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_provides_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to see error on invalid login and  able to see Qurate selenium tab on the next page with valid login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_should_be_able_to_see_error_on_invalid_login_and_able_to_see_qurate_selenium_tab_on_the_next_page_with_valid_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/OrderPlacement.feature");
formatter.feature({
  "name": "To test whether the order is placed",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Order Summary Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logged in with valid login credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "AddItemToCartSteps.user_logged_in_with_valid_login_credentials()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitionFiles.AddItemToCartSteps.user_logged_in_with_valid_login_credentials(AddItemToCartSteps.java:42)\r\n\tat ✽.User logged in with valid login credentials(file:src/test/java/features/OrderPlacement.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User adds items in the cart",
  "keyword": "When "
});
formatter.match({
  "location": "OrderPlacementSteps.user_adds_items_in_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User navigates to summary page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_navigates_to_summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Proceed to Checkout button and validate that user is on Address Page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderPlacementSteps.user_clicks_on_proceed_to_checkout_button_and_validate_that_user_is_on_address_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Proceed to Checkout button and validate that user is on Shipping Page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_clicks_on_proceed_to_checkout_button_and_validate_that_user_is_on_shipping_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify that by-default checkbox for T\u0026C is not selected",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_verify_that_by_default_checkbox_for_t_c_is_not_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User checks the “Terms and Condition” Check box and click on “Proceed To Checkout” button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_checks_the_terms_and_condition_check_box_and_click_on_proceed_to_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be on Payment Page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_should_be_on_payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validates the total amount on the payment page is correct",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_validates_the_total_amount_on_the_payment_page_is_correct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validates the payment options",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPlacementSteps.user_validates_the_payment_options()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User logs out of the website and Sign in link is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderPlacementSteps.user_logs_out_of_the_website_and_sign_in_link_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});