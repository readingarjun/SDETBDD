
Feature: Background Menu Demo
Background:User is into sauce demo app

Given User is accessing login page in app
When User provide valid credentials
Then User should navigate to home page

Scenario: Test Menu Items
And Navigate to home page and click on breadcumbs
Then User should see the Menu items


Scenario: Verify add to cart functionality
And Click on add to button
Then Items should add to cart

