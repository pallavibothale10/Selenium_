package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUPTillBottom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		    driver.get("https://www.w3schools.com/");
				Thread.sleep(4000);
		   driver.manage().window().maximize();
		   JavascriptExecutor Js= (JavascriptExecutor) driver;
		   //ScrollUp
		   Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			Thread.sleep(4000);
			
			Js.executeScript("window.scrollBy( document.documentElement.scrollTop=0)", "");
			//Js.executeScript("window.scrollBy( document.documentElement.scrollTop=1000)", "");

			Thread.sleep(4000);
			
}
}