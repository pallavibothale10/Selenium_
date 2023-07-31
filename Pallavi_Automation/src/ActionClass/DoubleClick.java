package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement Double= driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
		Actions act = new Actions(driver);
		
		act.doubleClick(Double).build().perform();
	  
		Thread.sleep(2000);
		String Text = driver.switchTo().alert().getText();
		System.out.println(Text);
		
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		driver.quit();
	}

}
