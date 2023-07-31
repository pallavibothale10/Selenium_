package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_1 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
       WebDriver   driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      
      //Take screenshot and copy object
      
      File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println(Source);
      
      File Destination= new File("C:\\Users\\A\\Desktop\\11March Screenshot\\Sample1.jpeg");
      FileHandler.copy(Source,Destination);
      driver.quit();
}
}