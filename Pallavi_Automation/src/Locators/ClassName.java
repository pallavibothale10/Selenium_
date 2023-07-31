package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
 
	WebDriver driver = new ChromeDriver();
	//driver.get("https://accounts.google.com/");
	//driver.manage().window().maximize();
	//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("pbb@gmail.com");
	driver.get("https://login.yahoo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("phone-no")).sendKeys("zyx@gmail.com");
	
	
	
	
	
	}

}
