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

//2. Take a screenshot of the  "Kite to login" text and store it in the project folder.

public class Assignment1_Screenshot2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
			Thread.sleep(4000);
	   driver.manage().window().maximize();
	   
	 // Take a screenshot of the  "Kite to login" text and store it in the project folder.
	   
		  WebElement LoginText= driver.findElement(By.xpath("//h2[text()=\"Login to Kite\"]"));
		 File Source= ((TakesScreenshot)LoginText).getScreenshotAs(OutputType.FILE);
		      String Random = RandomString.make(5);
	String ImageName="kite";
	File Destination= new File("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\screenshot\\"+ImageName+" "+Random+" .jpeg");
	FileHandler.copy(Source, Destination);
	driver.quit();   
	}

}
