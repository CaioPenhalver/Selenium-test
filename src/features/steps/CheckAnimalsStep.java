package features.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.page_objects.LoginPage;

public class CheckAnimalsStep {

	private LoginPage loginPage = new LoginPage();
	private String response;
	
	@Given("^I am on LoginPage$")
	public void i_am_on_LoginPage() throws Throwable {
		assertThat("ABFF - Login" , equalTo(loginPage.getTitle()));
	}

	@When("^I fill in the username field with \"([^\"]*)\"$")
	public void i_fill_in_the_username_field_with(String username) throws Throwable {
		loginPage.setUsername(username);
	}

	@When("^I fill in the password field with \"([^\"]*)\"$")
	public void i_fill_in_the_password_field_with(String password) throws Throwable {
		loginPage.setPassword(password);
	}

	@When("^I click on entrar button$")
	public void i_click_on_entrar_button() throws Throwable {
		response = loginPage.login();
	}

	@Then("^I should be redirected to HomePage$")
	public void i_should_be_redirected_to_HomePage() throws Throwable {
		assertThat("Autenticação realizada com sucesso!" , equalTo(response));
	}

}
