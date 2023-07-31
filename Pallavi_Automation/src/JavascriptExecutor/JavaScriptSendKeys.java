package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			    driver.get("https://www.facebook.com/");
					Thread.sleep(4000);
			   driver.manage().window().maximize();
			   JavascriptExecutor js= (JavascriptExecutor) driver;
			   
//			   //first way
//			   js.executeScript("document.getElementById('email').value='abcd@gmail.com';");
//			   js.executeScript("document.getElementById('pass').value='2345ft45';");
			   
			   //second way
			   WebElement username=driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
			   WebElement password= driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
			   js.executeScript("arguments[0].value='"+"Test"+"';",username);
		        js.executeScript("arguments[0].value='"+"Test123"+"';",password);

	}

}
