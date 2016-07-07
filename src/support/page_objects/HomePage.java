package support.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import support.driver.FactoryDriver;

public class HomePage {

	
	private WebDriver driver = FactoryDriver.getInstance();
	
	public HomePage(){
		driver.get("file:///home/caio/Desktop/Tester%20Course/animal-best-friend-forever-master/index.html");
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void ClickOnVisualizarAnimais(){
		WebElement option = driver.findElement(By.id("lnk-visualizar-animais"));
		hoverAnimais().moveToElement(option).click().build().perform();
		if(option.isDisplayed()){
			
		}else System.out.println("Not visible");
	}
	
	private Actions hoverAnimais(){
		WebElement menu = driver.findElement(By.className("dropbtn"));
		Actions actions = new Actions(driver);
		return actions.moveToElement(menu);
	}
}
