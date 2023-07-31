package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_2 {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
       WebDriver   driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(4000);
      driver.manage().window().maximize();
      
      //Take screenshot and copy object
      
      File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      String Random = RandomString.make(5);
      String ImageName="Redbus";
      File Destination= new File("C:\\Users\\A\\Desktop\\11March Screenshot\\"+ImageName+" "+Random+" .jpeg");
FileHandler.copy(Source, Destination);
driver.quit();
      
}
}