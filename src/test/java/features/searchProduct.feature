Feature: Search and place order for vegetable

@Offerspage
Scenario: Search for tomato homepage and offer page
Given Verify user is on greencart landing page
When User search with short name <Name> and extracted the actual name of product
Then User searched for <Name> short name in offer page 
And validate product name in offers page matches with landing page

Examples:
| Name |
| Tom |
| Beet |