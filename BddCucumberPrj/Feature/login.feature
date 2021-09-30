Feature: Login Test

Scenario: Successful log in with log in credentials

Given user is on the log in page
When user enters username and password
Then message displayed login successfully
