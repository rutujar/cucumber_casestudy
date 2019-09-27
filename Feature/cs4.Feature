Feature: example mapping action
Scenario: Search product in the list
Given user opens the appn
When user click on the signin link and logins
And user search for the product
And try to proceed for the payment without adding item
Then it doesnt display the cart item
