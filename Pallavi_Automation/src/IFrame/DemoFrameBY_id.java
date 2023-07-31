package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrameBY_id {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
    
    driver.switchTo().frame(1);
    
    String text1= driver.findElement(By.xpath("//h5[contains(text(), \"Nested iFrames\")]")).getText();
	System.out.println(text1);
	
	driver.switchTo().frame(0);
    
	String text2= driver.findElement(By.xpath("//h5[text()=\"iFrame Demo\"]")).getText();
	System.out.println(text2);
		
    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("123456");
    
    
    
}
}

