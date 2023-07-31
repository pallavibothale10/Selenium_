package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pune");
	}

}
