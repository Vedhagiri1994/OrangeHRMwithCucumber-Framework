@ApplicationLogin
Feature: Login 

Scenario: A_Login scenario
	Given user navigate the OrangeHRM URL
	When user enter the valid username into username field
	And user enter the valid password into password field
	Then clicks on login button


