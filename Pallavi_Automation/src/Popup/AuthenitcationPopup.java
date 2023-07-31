package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenitcationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		//Step 2:	
	WebDriver driver=new ChromeDriver();
		//Step 3:
	driver.manage().window().maximize();
	
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

//	driver.switchTo().alert().sendKeys("admin");
//	driver.switchTo().alert().sendKeys("admin");

	String Text= driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.' )]")).getText();            
	System.out.println(Text);
	}

}
