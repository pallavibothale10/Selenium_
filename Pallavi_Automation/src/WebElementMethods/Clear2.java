package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/"); 
driver.manage().window().maximize();

WebElement EmailId = driver.findElement(By.name("email"));
WebElement Password = driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
EmailId.sendKeys("abcd@gmail.com");
Password.sendKeys("12345");
Thread.sleep(2000);
EmailId.clear();
Password.clear();
Thread.sleep(2000);
EmailId.sendKeys("xyz@gmail.com");
Password.sendKeys("09876");
	
	}
}