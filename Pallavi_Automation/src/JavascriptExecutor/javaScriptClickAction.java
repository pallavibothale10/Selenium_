package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptClickAction {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		   driver.manage().window().maximize();

		    driver.get("https://www.facebook.com/");
		    
						   //second way
		   WebElement Username=driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
		   WebElement Password= driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
		   JavascriptExecutor js= (JavascriptExecutor) driver;

		 
		   js.executeScript("arguments[0].value='"+"Test"+"';",Username);
	        js.executeScript("arguments[0].value='"+"Test123"+"';",Password);
		   
		   WebElement LoginButton= driver.findElement(By.xpath("//button[starts-with(@id, \"u_0_5_\")]"));//dyanalic id
		   js.executeScript("arguments[0].click()", LoginButton);

}
}