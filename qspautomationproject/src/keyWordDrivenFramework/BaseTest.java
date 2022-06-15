package keyWordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver=new ChromeDriver();
	public void openBrowser() throws IOException 
	{
		Flib flib = new Flib();
		
		String browserValue = flib.readPropertyFile("./Data/config.Properties","Browser");
	    String url = flib.readPropertyFile("./Data/config.Properties", "url");
	    
	    if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}
	    
	    else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}
	    
	    else
		{
			System.out.println("enter the correct choice");
		}
	}
	    public void closeBrowser()
	    {
	    	driver.quit();
	    }

	}


