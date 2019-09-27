Feature: Login page Action

Scenario Outline: Successful login with Valid Credentials
Given User opens the testmeapp application
When Users click on the sign in link
And User enters "<username>" and "<password>"
Then Message displayed Login page successfully

Examples:
|username | password     |
|lalitha  | Password123  |
|admin    | Password456  |
