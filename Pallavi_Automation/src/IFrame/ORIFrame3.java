package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORIFrame3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click(); //to click on next frame
	
	//in this program id class name not present then we use webelement
	WebElement outerframe= driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
	driver.switchTo().frame(outerframe);
	   // Retrieve the text from the element within the frame
	String text1= driver.findElement(By.xpath("//h5[contains(text(), \"Nested iFrames\")]")).getText();
	System.out.println(text1);
	
	
	WebElement innerframe=driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
	//iframe[@src="SingleFrame.html"]
	driver.switchTo().frame(innerframe);
//	
//	String text2= driver.findElement(By.xpath("//h5[text()=\"iFrame Demo\"]")).getText();
//	System.out.println(text2);
//	
//	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Java");
//	Thread.sleep(2000);
//	driver.switchTo().parentFrame();
//	System.out.println("Back to outer-->" +text1);
//	
//	driver.switchTo().defaultContent();
//	driver.findElement(By.xpath("//a[text()=\"WebTable\"]")).click(); // to check whether we are in main page or not
//	
//	System.out.println("Execution complete");
//	
//
//	
//
//	
//	
//	driver.quit();
	
	}

}
