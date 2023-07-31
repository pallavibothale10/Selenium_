package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

//3.Take a screenshot for the Kite login page and store it in the 
//project folder three times using the random string method.
public class Assignment2_Screenshot3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		   driver= new ChromeDriver();
		    driver.get("https://kite.zerodha.com/");
				Thread.sleep(4000);
		   driver.manage().window().maximize();
		   
		   String FileName="kite";
		   Assignment2_Screenshot3.Screenshotmethod(FileName); 
		   Assignment2_Screenshot3.Screenshotmethod("Test11" +FileName);   
		   Assignment2_Screenshot3.Screenshotmethod("Test12" +FileName); 
	}
		   public static void Screenshotmethod(String FName ) throws IOException {
				
				File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Random = RandomString.make(5);
				File Destination= new File("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\screenshot\\"+FName+" "+Random+" .jpeg");
				FileHandler.copy(Source, Destination);
				
				//driver.quit();

}}