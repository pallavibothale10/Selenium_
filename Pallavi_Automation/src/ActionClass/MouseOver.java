package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement Account= driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
		Actions act =new Actions(driver);
		act.moveToElement(Account).build().perform();
	//OR  driver.findElement(By.xpath("(//span[text()=\"Sign in\" and@class=\"nav-action-inner\"])[1]")).click();
	driver.findElement(By.xpath("(//span[text()=\"Sign in\"])[1]")).click();
	driver.findElement(By.id("ap_email")).sendKeys("vttc@gmail.com");
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("xcergrt");
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(2000);
	boolean Text= driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
	System.out.println(Text);
	driver.quit();
	
	
	
	}
}
