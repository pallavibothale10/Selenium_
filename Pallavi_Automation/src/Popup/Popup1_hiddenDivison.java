package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1_hiddenDivison {
	public static void main(String[] args) {
		//Hidden division
		
		//Step1:
				System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
					//Step 2:	
				WebDriver driver=new ChromeDriver();
					//Step 3:	
				driver.manage().window().maximize();
				
				driver.get ("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
	}

}
