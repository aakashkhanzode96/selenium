package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1_ {

	public static void main(String[] args) { 
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/?hl=en");
			driver.findElement(By.xpath("//input[@aria-lable='Phone number, username, or email']")).sendKeys("Akash");
			driver.findElement(By.xpath("//input[@aria-lable='Password']")).sendKeys("Ak123");
			driver.findElement(By.xpath("//div[@class='qF0y9']")).click();
		
			
			

		

	}

}
