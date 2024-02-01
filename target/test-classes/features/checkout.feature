Feature: Place order for vegetable

@PlaceOrder
Scenario: Search for tomato homepage and offer page

Given Verify user is on greencart landing page
When User search with short name <Name> and extracted the actual name of product
And Add "3" items of the selected product to cart
Then User proceed to checkout and validate the <Name> items in checkout page
And verify the user has ability to enter promo code and place the order


Examples:
| Name |
| Cauliflower |
