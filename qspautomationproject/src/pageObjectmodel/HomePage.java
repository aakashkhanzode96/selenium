package pageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(linkText="Settings")  private WebElement settings;
		
	
	
	
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	//Utilization
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSettings() {
		return settings;
	}
	
	
	

}

    //generic reusable method



    

   //operational method
