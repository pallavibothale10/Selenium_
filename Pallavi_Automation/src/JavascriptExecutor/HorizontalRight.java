package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		    //driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		  driver.manage().window().maximize();

		    driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
				Thread.sleep(4000);
		  driver.manage().window().maximize();
		   
		   JavascriptExecutor Js= (JavascriptExecutor) driver;
		   //scroll right
		   Js.executeScript("window.scrollBy(10000,0)", "");
			Thread.sleep(4000);
			//scroll left
			 Js.executeScript("window.scrollBy(-2000,0)", "");

}

}
