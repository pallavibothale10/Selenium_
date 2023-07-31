package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//orangeHRM
public class XpathByAttributes {
	public static void main(String[] args) throws InterruptedException {
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	
		driver.get ("https://www.orangehrm.com/");
			
		driver.manage().window().maximize();
       
               driver.findElement (By.xpath("//input[@class=\"email text tryit-email\"]")).sendKeys("pallavi@gmail.com");
               driver.findElement (By.xpath("//input[@class=\"action btn btn-ohrm btn-tryit-free\"]")).click();
               driver.findElement (By.xpath("//input[@id=\"Form_getForm_Name\"]")).sendKeys("Abcde");
               driver.findElement (By.xpath("//input[@placeholder=\"Phone Number*\"]")).sendKeys("9087657483");
               //driver.findElement (By.xpath("//button[@id=\"Form_getForm_Country\"]")).click();
            
               driver.findElement (By.xpath(" //input[@class=\"dropdown\"]")).sendKeys("India");
          
	}

}
