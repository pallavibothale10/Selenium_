package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("pal");
    	driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("both");
    	driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
    	driver.findElement(By.name("reg_passwd__")).sendKeys("123xzv");
	
    	driver.findElement(By.xpath("//select[@aria-label=\"Day\"]")).click();// for date
    	driver.findElement(By.xpath("//option[@value=\"10\"]")).click();
    	
    	driver.findElement(By.xpath("//select[@aria-label=\"Month\"]")).click(); //for month
    	//driver.findElement(By.xpath("(//option[@value=\"10\"])[2]")).click();
    	driver.findElement(By.xpath("//option[contains(text(), 'Oct')]")).click();
    	
    	driver.findElement(By.xpath("//select[@aria-label=\"Year\"]")).click(); //for year
    	driver.findElement(By.xpath("//option[@value=\"1998\"]")).click();
    	
    	Thread.sleep(4000);
    	driver.quit();
	}
}

