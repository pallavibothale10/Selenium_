package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightlightBorder {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/");
				Thread.sleep(4000);
		   driver.manage().window().maximize();
		   WebElement Ele = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		   WebElement Ele1 = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		   
		   JavascriptExecutor Js= (JavascriptExecutor) driver;
		   Js.executeScript("arguments[0].style.border='15px solid red'", Ele);
		   Js.executeScript("arguments[0].style.border='5px solid yellow'", Ele1);

		  
		   
		   
}

}