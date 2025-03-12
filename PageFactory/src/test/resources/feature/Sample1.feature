Feature: 

@SmokeTest
Scenario: To check title of the Application 
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
Then User verifies the title of the Webpage
And User closes the Browser

@RegressionTest
Scenario Outline: To check Login functionality of the Application 
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When User enters  '<username>' the username
And User enters '<password>' the password
And User clicks on the Login button
Then User verifies the Profile Account
And User closes the Browser
Examples: 
|username|password|
|Admin|admin123|
|Admin|admin123|