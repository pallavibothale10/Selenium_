package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1111 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("https://byjus.com/learn/byjus-classes?referrer=source%3Diframe%26mx_Campaign_Type%3Dlogin-button%26SourceMedium%3Dwebsite%26mx_Page_Category%3Dhomepage&source=iframe");
//		String id1=driver.getWindowHandle();
//		
//		System.out.println(id1);
		
		driver.findElement(By.xpath("//a[@class=\"primary-login-btn\"]")).click();
		
		Thread.sleep(4000);
		
//		String id=driver.getWindowHandle();
//		
//		System.out.println(id);
		
//		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("8855947443");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
