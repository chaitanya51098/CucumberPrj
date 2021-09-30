Feature: datatable demo
Scenario: Successful login with valid credentials
Given user is on demowebshop
When user signs in with email and password
|chaitanya.parimi05@gmail.com|chaitu12|
Then user should see logout