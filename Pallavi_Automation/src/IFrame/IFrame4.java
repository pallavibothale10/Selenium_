package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	Thread.sleep(2000);
	driver.switchTo().frame("iframeResult");
	
	String Text=driver.findElement(By.xpath("//p[contains(text(), \"You can use the height and width\")]")).getText();
	System.out.println(Text);
	
	WebElement InnerFrame = driver.findElement(By.xpath("//iframe[@src=\"demo_iframe.htm\"]"));
	driver.switchTo().frame(InnerFrame);
	String Text1= driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText();
	System.out.println(Text1);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@onclick=\"openMenu()\"]")).click();
	System.out.println("Execution Completed");
	Thread.sleep(5000);
	driver.quit()
	;
	}
}
