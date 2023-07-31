package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		//Step 1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
        //Step 2
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);

		List<WebElement> day =driver.findElements(By.xpath("//select[@aria-label=\"Day\"]//option"));
System.out.println(day.size());
	}
}