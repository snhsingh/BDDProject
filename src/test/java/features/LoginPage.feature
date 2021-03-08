Feature: To test login functionality

Background: browser
Given Browser launched

Scenario: Verify the logo
And User is on the login page
Then User is able to see Logo Image


Scenario Outline: Check the details in the login page
And User is on the login page
And user is able to verify Contact us and Sign In links on the page
When User cliks on Sign In link
And User provides <Username> and <Password>
Then User should be able to see error on invalid login and  able to see Qurate selenium tab on the next page with valid login

Examples:
| Username       | Password |
| abc@bdd.com    | 12345    |
| qurate@bdd.com | qurate   |