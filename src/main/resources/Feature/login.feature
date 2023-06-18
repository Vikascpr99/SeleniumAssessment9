@LoginFeatureTag
Feature: Uber login
	I want to check the login with this feature file
	
	
	@LoginScenario1
	Scenario Outline: User should be able to login with valid credentials
		Given The User is in login page
		When The User enters valid "<mobilenumber>" and hits submit
		
		Then The user should be logged in successfully
		
		Examples:
			|   mobilenumber    |
			|  9876543210       |
			|  78465389         |
			