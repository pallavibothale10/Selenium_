package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				
		driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		driver.manage().window().maximize();
       Thread.sleep(2000);
                
		driver. findElement (By.xpath("//a[contains(text (), 'OrangeHRM, Inc')]")).click();
		//Thread.sleep(2000);
		driver.quit();
				
			

		
}
}