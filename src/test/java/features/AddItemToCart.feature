Feature: To test whether the item is added into the cart

Scenario: Check the item is added in the cart

Given User logged in with valid login credentials
When User hover on dresses and click on summer dresses
And User adds any one item to the cart by clicking “Add to Cart”
Then User clicks on Continue shopping button
And User adds one more item
And User clicks on Proceed to Checkout button
Then User validates whether 2 items are added in the cart