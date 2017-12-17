@production
Feature: Accessing the Dashboard
This feature defines the different user access to a dashboard
and the restrictions fro the same


Scenario: Accessing with a valid user name and password

Given I am a registered user on the web page
When I understand user credentials
And I click on login
Then I should get access to the Dashboard