package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_2 {
	public static void main(String[] args) {
		
		//Step-1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		//Step-2
		WebDriver driver= new ChromeDriver();
		
		//Step 3
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		//These two line is use for signle web element 
		//WebDriverWait mywait = new WebDriverWait (driver, Duration.ofSeconds(10));
		//WebElement Element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));
	
		By input1= By.id("src");
		Waitforelement(driver, input1,30).sendKeys("Pune");
		
		By input2= By.id("dest");
		Waitforelement(driver, input2,30).sendKeys("Mumbai");
		
	}
	public static WebElement Waitforelement(WebDriver driver,By locotors, int timeout) {
		
		WebDriverWait mywait = new WebDriverWait (driver, Duration.ofSeconds(timeout));
		
		mywait.until(ExpectedConditions.presenceOfElementLocated(locotors));
		
		return driver.findElement(locotors);
	}

}
