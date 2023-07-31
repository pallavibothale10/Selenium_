package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorInputText {
	public static void main(String[] args) {
		
		//Step1:
				System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
					//Step 2:	
				WebDriver driver=new ChromeDriver();
				driver.get("https://app.hubspot.com/login");
	//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("RRI@gmail.com");
driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("abc@gmail.com");
	}
	

}
