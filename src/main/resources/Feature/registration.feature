@RegistrationFeatureTag
Feature: Uber Registration
	I want to check the signup with this feature file
	
	
	@RegistrationScenario
	Scenario Outline: User should be able to signup with valid credentials
		Given The User is in singup page
		When The User enters valid "<firstname>" and "<lastname>" and "<mobilenumber>" and "<email>" and "<password>" details
		And hits submit
		Then The user should be registered successfully
		
		Examples:
			|  firstname  |  lastname |   mobilenumber   |   email          |   password   |
			|  david      |  warner   |   785749029      |davidwarner@ac.com|   1234       |
			|  salma      |  ben      |   456387243      | salmabe@ac.com   |   43758      |
		
