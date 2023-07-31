package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_fileUploadORwindow_popup {
	public static void main(String[] args) throws InterruptedException {
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	
		driver.get ("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\A\\Desktop\\Installation\\Data2.xlsx");
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
	Thread.sleep(2000);
		String Text=	driver.findElement(By.xpath("//h3[text()=\"File Uploaded!\"]")).getText();
   //String Text= 	driver.findElement(By.id("uploaded-files")).getText();
        System.out.println(Text);
	  driver.close();
	}

}
