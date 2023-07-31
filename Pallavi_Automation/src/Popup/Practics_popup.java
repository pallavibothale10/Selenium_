package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			
	   	driver.get("https://demo.automationtesting.in/Alerts.html");

	   	Thread.sleep(4000);
	   	
	   	driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
	   	
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
	   	
	   	Thread.sleep(2000);

	   	driver.switchTo().alert().sendKeys("sswpamil");
	   	driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		
		driver.close();
	}

}
