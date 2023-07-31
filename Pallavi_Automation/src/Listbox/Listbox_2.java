package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_2 {
	
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

	WebElement Day = driver.findElement(By.id("day"));
	WebElement Month = driver.findElement(By.id("month"));
	WebElement Year = driver.findElement(By.id("year"));
	
	//1.selectByVisibleText
	/* Select Select1= new Select(Day);
	Select1.selectByVisibleText("4");
	Select Select2= new Select(Month);
	Select2.selectByVisibleText("Mar");
	Select Select3= new Select(Year);
	Select3.selectByVisibleText("1996"); */
	
	//2.selectByValue
	/* Select Select4= new Select(Day);
	Select4.selectByValue("4");
	Select Select5= new Select(Month);
	Select5.selectByValue("3");
	Select Select6= new Select(Year);
	Select6.selectByValue("1996"); */
	
	//3.selectByIndex
	Select Select7= new Select(Day);
	Select7.selectByIndex(3); // 3 is not a day this the index
	Select Select8= new Select(Month);
	Select8.selectByIndex(2); //mar -->this index starts from 0,1,2,3...
	Select Select9= new Select(Year);
	Select9.selectByIndex(96);
	

}
}