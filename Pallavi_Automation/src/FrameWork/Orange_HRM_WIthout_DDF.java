package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_WIthout_DDF {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        
        //UserName
       driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
      //Password
       driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       
       String username="Paul Collings";
		
		String name=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		if(username.equals(name)) {
			System.out.println("user name is correct or login successfully");
			
		}else
		{
			System.out.println("login is not successful");
		}

		
	}

}
