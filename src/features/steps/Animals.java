package features.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.page_objects.CadastroDeAnimaisPage;
import support.page_objects.NavBar;

public class Animals {

	private CadastroDeAnimaisPage cadastro = new CadastroDeAnimaisPage();
	private NavBar navBar = new NavBar();
	private String response;
	
	@Given("^I am on HomePage$")
	public void i_am_on_HomePage() throws Throwable {
		assertThat("ABFF" , equalTo(cadastro.getTitle()));
	}

	@When("^I put the cursor over Animais$")
	public void i_put_the_cursor_over_Animais() throws Throwable {
	    
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String button) throws Throwable {
	    switch(button){
	    case "Cadastrar Animais":
	    	response = navBar.goToCadastrarAnimais();
	    break;
	    case "Visualizar Animais":
	    	throw new PendingException();
	    }
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String text) throws Throwable {
	    assertThat(text, equalTo(response));
	}
}
