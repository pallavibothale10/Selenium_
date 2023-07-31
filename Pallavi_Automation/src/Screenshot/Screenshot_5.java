package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_5 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    String FileName="Facebook";
	    Screenshot_5.Screenshotmethod(FileName); 
	    Screenshot_5.Screenshotmethod("Test1" +FileName);   
	    Screenshot_5.Screenshotmethod("Test2" +FileName);    

	}
	
	public static void Screenshotmethod(String FName ) throws IOException {
	
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(5);
		File Destination= new File("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\screenshot\\"+FName+" "+Random+" .jpeg");
		FileHandler.copy(Source, Destination);
		driver.quit();
	}

}
