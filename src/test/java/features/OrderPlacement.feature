Feature: To test whether the order is placed

Scenario: Validate Order Summary Page

Given User logged in with valid login credentials
When User adds items in the cart
And User navigates to summary page
Then User clicks on Proceed to Checkout button and validate that user is on Address Page
And User clicks on Proceed to Checkout button and validate that user is on Shipping Page
And User verify that by-default checkbox for T&C is not selected
And User checks the “Terms and Condition” Check box and click on “Proceed To Checkout” button
And User should be on Payment Page
And User validates the total amount on the payment page is correct
And User validates the payment options
Then User logs out of the website and Sign in link is displayed