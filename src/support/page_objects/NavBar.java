package support.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import support.driver.FactoryDriver;

public class NavBar {

	protected WebDriver driver = FactoryDriver.getInstance();
	
	@FindBy(how=How.CSS, using="[data-i18n='menu-animal']")
	private WebElement animaisElement;
	
	@FindBy(how=How.ID, using="")
	private WebElement organizacoesElement;
	
	@FindBy(how=How.ID, using="")
	private WebElement sairButton;
	
	public NavBar(){
		PageFactory.initElements(driver, this);
	}
	
	public String goToCadastrarAnimais(){
		Actions act = new Actions(driver);
		act.moveToElement(animaisElement)
		.moveToElement(driver.findElement(By.id("lnk-cadastrar-animais")))
		.click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".title"))).getText();
	}

	public void goToVisualizarAnimais(){
		
	}
	
	public void goToCadastrarOrganizacoes(){
		
	}
	
	public void goToVisualizarOrganizacoes(){
		
	}
}