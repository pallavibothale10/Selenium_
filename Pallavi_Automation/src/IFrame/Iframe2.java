package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.switchTo().frame("singleframe"); //NoSuchElementException
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
	Thread.sleep(2000);

	}

}
