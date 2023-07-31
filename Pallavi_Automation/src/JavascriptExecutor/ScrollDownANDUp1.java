package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollDownANDUp1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		    driver.get("https://www.w3schools.com/");
				Thread.sleep(4000);
		   driver.manage().window().maximize();
		   JavascriptExecutor Js= (JavascriptExecutor) driver;
		   //ScrollUp
		   Js.executeScript("window.scrollBy(0, 10000)", "");
			Thread.sleep(4000);
             //scrollDown
			   Js.executeScript("window.scrollBy(0,-2000)", "");

		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),\"A popular programming language\")]"));
		   
	}

}
