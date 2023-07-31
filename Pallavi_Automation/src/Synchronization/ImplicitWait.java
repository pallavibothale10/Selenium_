package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Step-1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		//Step-2
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Step 3
		driver.manage().window().maximize();
		
	String URL = "https://www.facebook.com/";
	driver.get(URL);
	
	driver.findElement(By.id("email")).sendKeys("c12brtgr");
	driver.findElement(By.id("pass")).sendKeys("1234567");
		
	driver.quit();
	
		
	}

}
