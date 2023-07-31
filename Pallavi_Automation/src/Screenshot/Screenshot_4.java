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

public class Screenshot_4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	       WebDriver   driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	     
	      WebElement LoginBox= driver.findElement(By.xpath("//form[@class=\"_9vtf\"]"));
	      //Take screenshot and copy object
	      
	      File Source= ((TakesScreenshot)LoginBox).getScreenshotAs(OutputType.FILE);
	      	      String Random = RandomString.make(5);
	      String ImageName="facebook";
	      File Destination= new File("C:\\Users\\A\\Desktop\\11March Screenshot\\"+ImageName+" "+Random+" .jpeg");
	FileHandler.copy(Source, Destination);
	driver.quit();
	}

}
