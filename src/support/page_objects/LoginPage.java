package support.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import support.driver.FactoryDriver;

public class LoginPage {

	private WebDriver driver = FactoryDriver.getInstance();
	@FindBy(how=How.ID, using="txt-usuario")
	private WebElement userField;
	@FindBy(how=How.ID, using="txt-senha")
	private WebElement senhaField;
	@FindBy(how=How.ID, using="btn-entrar")
	private WebElement entrarButton;
	
	public LoginPage (){
		PageFactory.initElements(this.driver, this);
		driver.get("file:///home/caio/Desktop/Tester%20Course/animal-best-friend-forever-master/login.html");
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void setUsername(String username){
		userField.sendKeys(username);
	}
	
	public void setPassword(String password){
		senhaField.sendKeys(password);
	}
	
	public String login(){
		entrarButton.click();
		return driver.findElement(By.id("message-text")).getText();
	}
	
}