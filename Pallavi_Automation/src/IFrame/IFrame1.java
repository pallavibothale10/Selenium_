package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");//child frame
 String text= driver.findElement(By.xpath("//h2[text()=\"My First JavaScript\"]")).getText();
	System.out.println(text);
	
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	Thread.sleep(3000);
	
	driver.switchTo().defaultContent();//back to home page
	driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	Thread.sleep(3000);

	//driver.quit();
	}
}
