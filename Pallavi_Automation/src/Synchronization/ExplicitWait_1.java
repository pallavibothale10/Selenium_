package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_1
{
	public static void main(String[] args) {
		
		//Step-1
				System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
				
				//Step-2
				WebDriver driver= new ChromeDriver();
				
				//Step 3
				driver.manage().window().maximize();
				driver.get("https://www.redbus.in");
				
				WebDriverWait mywait = new WebDriverWait (driver, Duration.ofSeconds(10));
				WebElement Element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));
				//or WebElement Element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
// or WebElement ele1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type=\"text\"])[1]")));
				Element.sendKeys("Pune");
				
				WebDriverWait mywait1 = new WebDriverWait (driver, Duration.ofSeconds(10));
				WebElement Element1 = mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
				Element1.sendKeys("Mumbai");
				
				driver.quit();
				
		
		
		
	}
}
