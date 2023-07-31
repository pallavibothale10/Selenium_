package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/"); 
	driver.manage().window().maximize();
	 
	String ExpectedText= "Facebook helps you connect and share with the people in your life.";
	String ActualText= driver.findElement(By.xpath("//h2[contains (text(), \"Facebook helps you \")]")).getText();
	//String ActualText= driver.findElement(By.xpath("//h2[contains (@class, \"_8eso\"]")).getText();
	if(ExpectedText.equals(ActualText)) {
		System.out.println("Correct text");
	}else 
		System.out.println("Incorrect Text");
	
	//driver.quit();
	}
		
	
}


