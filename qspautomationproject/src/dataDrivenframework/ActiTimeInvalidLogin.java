package dataDrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=6b0iv6l90e0o9");
		
		Flib flibs = new Flib();
		 int rc = flibs.getrowCount("./Data/Actidata.xlsx","invalidcreds");
		 
		 
		 for(int i=1;i<=rc;i++)
		 {
			 String username = flibs.readData("./Data/Actidata.xlsx","invalidcreds",i,0);
			  String password = flibs.readData("./Data/Actidata.xlsx","invalidcreds",i,1);
			  
			  driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.id("loginButton")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.name("username")).clear();
			 
			 
		 }
			 
		 
			 
		
		
		
		
	}
	

}
