package Assignment_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_12 {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com/");
			Thread.sleep(4000);
			
			driver.findElement(By.id("denyBtn")).click();
			WebElement src = driver.findElement(By.xpath("//span[.='Offers ']"));
		 Actions trg = new Actions(driver);
		 trg.moveToElement(src).perform();
		 driver.findElement(By.xpath("//span[contains(.,' 30% Off ')]")).click();
			Thread.sleep(4000);
			driver.close();
			

			

		}

	

	}

}
