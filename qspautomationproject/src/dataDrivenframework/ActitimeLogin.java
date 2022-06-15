package dataDrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=6b0iv6l90e0o9");
		
		Thread.sleep(1000);
		
		Flib fb = new Flib();
		String username = fb.readData("./Data/Actidata.xlsx","validcreds",1, 0);
		String password = fb.readData("./Data/Actidata.xlsx","validcreds",1, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		

	}

}
