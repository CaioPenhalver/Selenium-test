Feature: Course site
		As a user I would like to log in
		and see if there is an animal to be 
		adopded
		
		@login
		Scenario Outline: Login 
					Given I am on LoginPage
					When I fill in the username field with "<username>"
					And I fill in the password field with "<password>"
					And I click on entrar button
					Then I should be redirected to HomePage
					
					Examples:
						| username | password |
						| caio		 | caio     |
						| adm			 | 3455			|
						| admin		 | admin 		|