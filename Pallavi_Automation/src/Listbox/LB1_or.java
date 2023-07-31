package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LB1_or {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(), \"Create new account\")]")).click();
		Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("pallll");  
	driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("bothhhhh");    

	WebElement Day = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
	WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));

	WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));

	Select s1 = new Select(Day);
	s1.selectByValue("10");
	Select s2= new Select(month);
	s2.selectByValue("4");
	Select s3= new Select(year);
	s3.selectByValue("2020");

//	Select s11= new Select(Day);
//	s11.selectByIndex(9);
//	Select s12= new Select(month);
//	s12.selectByIndex(3);
//	Select s13= new Select(year);
//	s13.selectByIndex(10);
	
	}
}