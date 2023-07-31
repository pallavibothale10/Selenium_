package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic_Alert_1_popup {

	public static void main(String[] args) {
		
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	
		driver.manage().window().maximize();
		
	 driver.get("https://demo.automationtesting.in/Alerts.html");
	 driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	 
	 //1st box---->1st approache
	String Msg = driver.switchTo().alert().getText();
	
	System.out.println(Msg);
	
	driver.switchTo().alert().accept();
	
	//2nd box----> 2nd approach
	driver.findElement(By.xpath("//a[contains (text(), \"Alert with OK & Cancel \")]")).click();
	driver.findElement(By.xpath("//button[contains(text(), \"click the button to display a confirm box \")]")).click();
	
	Alert alt = driver.switchTo().alert();
	String text=alt.getText();
	System.out.println(text);
	alt.dismiss();      //or driver.switchTo().alert().dismiss();
	
	//3rd box
	driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
	driver.findElement(By.xpath("//button[contains(text(),\"click the button to demonstrate\")]")).click();

	System.out.println(alt.getText());
	alt.sendKeys("apple");
	alt.accept();
	System.out.println(driver.findElement(By.xpath("//p[@id=\"demo1\"]")).getText());
	}
}
