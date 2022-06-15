package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com");
	   String ak= driver.getPageSource();
	   System.out.println(ak);

	}

}
