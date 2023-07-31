package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//facebook
public class XpathByAttributes2 {
	public static void main(String[] args) throws InterruptedException {
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	
		driver.get ("https://www.facebook.com//");
			
		driver.manage().window().maximize();  
              
// driver.findElement (By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("abc@gmail.com"); //email text	         
//driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("aa#45678");  // password text
//driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();   // login button
 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();  //create new act tab 
}
}