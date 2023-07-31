package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByText {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[text()=\"Create a Page\"]")).click();
	driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]")).click();
	}

}
