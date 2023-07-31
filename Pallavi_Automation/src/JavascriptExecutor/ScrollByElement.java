package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		    driver.get("https://www.w3schools.com/");
				Thread.sleep(4000);
		   driver.manage().window().maximize();
		   JavascriptExecutor Js= (JavascriptExecutor) driver;
	
		   
					WebElement Ele= driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));

	///WebElement Ele= driver.findElement(By.xpath("//h3[contains(text(),\"It is free to use, and\")]"));
	//scroll by element
	Js.executeScript("argument[0].scrollIntoView();", Ele);
	
	}

}
