
Feature: Login page for sauce demo
Scenario: Login is successfull with valid credentials

Given User is on login page
When User Enter valid "<UserName>"  and "<Password>"
And  Clicks on Login Button
Then User Navigates to home page
And Close the browser

Examples:
|UserName|  |Password|
|standard_user| 			|secret_sauce|
|locked_out_user| 			|secret_sauce|

