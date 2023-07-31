package ExceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
WebElement element=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]"));
		
		element.click();
		
	    driver.navigate().back();
		
	    
	    try {
	          element.click();
	
	    }
	    catch (Exception e) {
	    	WebElement element1=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]"));
	    	element1.click();
	    	
		}
	    
	    driver.quit();
	    
	    System.out.println("Execution complete");
		
		
		
	}

}
