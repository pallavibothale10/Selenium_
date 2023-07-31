package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orrrrrrPopup2_JavaScript_2 {

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
	
	driver.switchTo().alert().accept();
	
	Boolean Text= driver.findElement(By.id("result")).isDisplayed();// for value displyed or not
	System.out.println(Text);
	//OR  WebElement Text= driver.findElement(By.id("result"));
	//System.out.println(Text.isDisplayed());
	
	String TextPrint= driver.findElement(By.id("result")).getText();
	System.out.println(TextPrint);
	}

}
