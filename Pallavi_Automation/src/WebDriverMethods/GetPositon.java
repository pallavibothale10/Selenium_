package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositon {
	
public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep (4000);
		
		driver.manage ().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep (6000);
        System.out.println(driver.manage ().window().getPosition());
		driver.close();
}}
