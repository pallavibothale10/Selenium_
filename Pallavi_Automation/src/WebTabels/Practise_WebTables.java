package WebTabels;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 JavascriptExecutor js =  (JavascriptExecutor)driver;
	}

}
