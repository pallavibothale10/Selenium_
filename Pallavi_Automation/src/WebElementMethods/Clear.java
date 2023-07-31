package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
 driver.get("https://www.facebook.com/"); 
 driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
 driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
 Thread.sleep(2000);
 driver.findElement(By.name("email")).clear();
 driver.findElement(By.name("email")).sendKeys("zxt@gmail.com");
 
	}
	
}
