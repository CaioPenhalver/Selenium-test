Feature: Animais
		As user I would like to help animals that have
		no home. So, I want to register them. Also, I wish I
		could see which animals are available to adoption.
		
		@registerAnimal
		Scenario: Registering an animal
			Given I am on HomePage
			When I put the cursor over Animais
			And I click on "Cadastrar Animais"
			Then I should see "CADASTRO DE ANIMAIS"
			
			#Scenario: Checking animals list
				#Given I am on HomePage
				#When I put the cursor over Animais
				#And I click on "Visualizar Animais"
				#Then I should see "VISUALIZAÇÃO DE ANIMAIS"