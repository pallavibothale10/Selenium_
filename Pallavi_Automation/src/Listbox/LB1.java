package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LB1 {
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


String Dob = "10-Apr-2023";

//Demo(Day, "10");
//Demo(month, "Apr");
//Demo(year,"2023");

String date[]= Dob.split("-");

Demo(Day, date[0]);
Demo(month, date[1]);
Demo(year, date[2]);
}
public static void Demo(WebElement ele, String text) {
	Select s = new Select(ele);
	s.selectByVisibleText(text);
	
}
}
