@UberFunctionality
Feature: Uber Functionality
	I want to book Uber ride.
	
	
	@UberRideBookingScenario
	Scenario Outline: User should be able to book ride.
		Given The User is in home page
		When The User enters valid "<pickup>" details and select first sugestion
		Then The User enters valid destination "<destination>" details and select first suggestion
		And hits for request now
		Then The user should be able to enter valid "<mobilenumber>" and then click next for book ride
		Then close the browser
		
		Examples:
			|     pickup      |      destination     |   mobilenumber   |
			|     patna       |      gaya            |    23409737      |
			|  muzaffarpur    |     Patna            |    68384759      |