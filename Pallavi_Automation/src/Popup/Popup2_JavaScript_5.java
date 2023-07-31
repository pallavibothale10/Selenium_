package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JavaScript_5 {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
			
	driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("pal@gmail.com");
driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

String Expected_AlertMSG= "Please enter your password";
Alert Ref_alert= driver.switchTo().alert();
String Actual_AlertMSG=Ref_alert.getText();

//String Actual_AlertMSG=driver.switchTo().alert().getText();

if(Actual_AlertMSG.equals(Expected_AlertMSG))
	System.out.println("Correct MSG");
else
	System.out.println("Incorrect MSG");
Thread.sleep(2000);


Ref_alert.accept();  //OR  driver.switchTo().alert().accept();
Thread.sleep(2000);

driver.close();

}
}