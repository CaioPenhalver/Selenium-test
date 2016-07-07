package support.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import support.driver.FactoryDriver;

public class CadastroDeAnimaisPage {
	
	private WebDriver driver = FactoryDriver.getInstance();
	
	@FindBy(how=How.NAME, using="txt-nome")
	private WebElement nomeField;
	
	@FindBy(how=How.NAME, using="txt-data-nascimento")
	private WebElement dataDeNascimentoField;
	
	@FindBy(how=How.NAME, using="cmb-tipo")
	private WebElement tipoSelect;
	
	@FindBy(how=How.CLASS_NAME, using="btn-action")
	private WebElement cadastrarButton;
	
	@FindBy(how=How.CLASS_NAME, using="btn-default")
	private WebElement limparButton;
	
	public CadastroDeAnimaisPage(){
		PageFactory.initElements(driver, this);
		driver.get("file:///home/caio/Desktop/Tester%20Course/animal-best-friend-forever-master/index.html");
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void setName(String name){
		nomeField.sendKeys(name);
	}
	
	public void setPassword(String date){
		dataDeNascimentoField.sendKeys(date);
	}
	
	public void selectType(String option){
		Select select = new Select(tipoSelect);
		select.selectByVisibleText(option);
	}
	
	public void clickOnCadastrar(){
		cadastrarButton.click();
	}
}
