package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//instagram
public class XpathByAttributes3 {
	public static void main(String[] args)  {
		    //Step1: 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	to get the link
		driver.get ("https://www.instagram.com/");
			//step4 to maximize the window
		driver.manage().window().maximize();
		
		// xpath By Attribute
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("xyz@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("asd12345");
	driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]")).click();
	}
}
