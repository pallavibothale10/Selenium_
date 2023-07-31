package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRight_ClickORContext_Text {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		WebElement RightClick=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions Act = new Actions(driver);
		Act.contextClick(RightClick).build().perform();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//span[text()=\"Paste\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		Act.contextClick(RightClick).build().perform();
		driver.findElement(By.xpath("//span[text()=\"Quit\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}

}
