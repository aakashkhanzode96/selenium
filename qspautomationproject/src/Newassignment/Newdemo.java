package Newassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("aakashkhanzode125");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//div[@id='password']")).sendKeys("Meena1995");
		driver.findElement(By.xpath("//span[.='Next']")).click();

		
		
		
		
		
	}

}
