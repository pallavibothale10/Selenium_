package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byid {
	
public static void main(String[] args) {
		
	    //Step1: 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	to get the link
		driver.get ("https://www.google.com/");
			//step4 to maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).click();

}
}