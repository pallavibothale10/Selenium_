package demooooo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
				
		   driver.manage().window().maximize();
		   JavascriptExecutor js= (JavascriptExecutor) driver;
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		
			 WebElement Uname= driver.findElement(By.xpath("//input[@name=\"username\"]"));
			 js.executeScript("arguments[0].value='"+"Admin"+"';",Uname);
			 WebElement Pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		     js.executeScript("arguments[0].value='"+"admin123"+"';",Pass);
		     
		     
//			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userName);
//			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
			Thread.sleep(5000);
}


}
