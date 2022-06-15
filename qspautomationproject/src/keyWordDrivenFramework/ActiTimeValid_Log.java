package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
public class ActiTimeValid_Log extends BaseTest{
		
		
		public static void main(String[] args) throws IOException, InterruptedException {

			//object creation
			BaseTest bt = new BaseTest();
			Flib flib = new Flib();
			
			//read the data from property file use the generic reusable method
			String username = flib.readPropertyFile("./Data/config.Properties","username");
			String password = flib.readPropertyFile("./Data/config.Properties","password");
			//open the browser
			bt.openBrowser();
			Thread.sleep(3000);
			//perform login
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		

	}

}
