package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeys2 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			    driver.get("https://www.facebook.com/");
					Thread.sleep(4000);
			   driver.manage().window().maximize();
			   JavascriptExecutor Js= (JavascriptExecutor) driver;
			   
			   //first way
			   Js.executeScript("document.getElementById('email').value='abcd@gmail.com';");
			   Js.executeScript("document.getElementById('pass').value='2345ft45';");

	}

}
