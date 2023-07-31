package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JavaScript_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		//Step 2:	
	WebDriver driver=new ChromeDriver();
		//Step 3:	
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//Alert A1= new Alert();
	
	driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
	Thread.sleep(2000);
	
	String Text= driver.switchTo().alert().getText();
	System.out.println(Text);
	
	
	
	}

}
