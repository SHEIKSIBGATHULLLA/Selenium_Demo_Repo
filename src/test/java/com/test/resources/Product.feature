Feature: Placing order

Scenario Outline: Adding product to cart without adding specifications
Given User navigates to the "<url>"
When User clicks on the product
And User clicks on add to cart
Then  User should not be able to add the product to the cart without giving specifications

Examples:
|url|
|https://demo.nopcommerce.com/|

Scenario Outline: Adding product to cart with adding specifications
Given User navigates to the "<url>"
When User clicks on the product
And User clicks on the specification details "<ram>"
And User clicks on add to cart
Then User should be able to add the products to cart

Examples:
|url|ram|
|https://demo.nopcommerce.com/|2 GB| 

