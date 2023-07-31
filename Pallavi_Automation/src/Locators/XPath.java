package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	public static void main(String[] args) throws InterruptedException {
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	
		driver.get ("https://www.irctc.co.in/");
			
		driver.manage().window().maximize();
		// xpath By Attribute
				driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys("PUNE");
driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_1_list\"]")).sendKeys("WARORA");
}}