package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

//1. Take a screenshot of the entire page and store it on the desktop.

public class Assignment1_Screenshot1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
			Thread.sleep(4000);
	   driver.manage().window().maximize();
	   
	   //1. Take a screenshot of the entire page and store it on the desktop.
	  File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      
	 File Destination= new File("C:\\Users\\A\\Desktop\\11March Screenshot\\sample123.jpeg");
	FileHandler.copy(Source, Destination);
	driver.quit();    
	
	
	
	   
	}

}
