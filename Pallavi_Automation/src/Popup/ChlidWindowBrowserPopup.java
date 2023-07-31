package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChlidWindowBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		//Step 2:	
	WebDriver driver=new ChromeDriver();
		//Step 3:
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	driver.findElement(By.xpath("//a[@href=\"#Seperate\"]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	String Parentwindow= driver.getWindowHandle();
	System.out.println(Parentwindow);
	//07F11A2E62BA1E72F7C74018B5F80719
	Set<String> ChildWindows=driver.getWindowHandles();
	
	
	for(String ChildWindow:ChildWindows) {
		if(!Parentwindow.equalsIgnoreCase(ChildWindow)) {
			driver.switchTo().window(ChildWindow);
		
		String Text1 =driver.findElement(By.xpath("//h1[contains(text(),\"Selenium automates browsers. That's it!\")]")).getText();
		System.out.println(Text1);
		driver.close();
		}
	}
	driver.switchTo().window(Parentwindow);
	String Text2= driver.findElement(By.xpath("//p[contains(text(),\"click the button to open a new\")]")).getText();
	System.out.println(Text2);
	driver.quit();
		
	}

}
