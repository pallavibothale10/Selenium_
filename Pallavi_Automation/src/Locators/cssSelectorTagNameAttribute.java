package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTagNameAttribute {
	public static void main(String[] args) throws InterruptedException {
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:
		driver.get("https://app.hubspot.com/login");
		driver.findElement (By.cssSelector("[name=email]")).sendKeys ("123") ;
		driver.findElement(By.cssSelector("[name=pass]")).sendKeys("1234");
		

}
}