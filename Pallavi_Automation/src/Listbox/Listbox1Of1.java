package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1Of1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();

	    
	   driver.get("http://omayo.blogspot.com/");
	   driver.manage().window().maximize();
	  // driver.findElement(By.id("drop1")).click();
	   Thread.sleep(3000);
	   
	   WebElement e1= driver.findElement(By.xpath("//select[@class=\"combobox\"]"));
	  
	   Select S1= new Select(e1);           //by text
	   S1.selectByVisibleText("doc 1");
	   
	   
//	   Select Select1= new Select(e1);       //by value
//		Select1.selectByValue("def");
	   
//	   Select Select1= new Select(e1);         // by index
//		Select1.selectByIndex(3);
	   

   Thread.sleep(3000);

	}

	

}

