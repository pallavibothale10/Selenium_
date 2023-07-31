package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Linkbox2Of2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
    	driver.findElement(By.linkText("All Classes")).click();

		
		
	}
//public static void demo1(WebElement element, String S) {
//		
//		Select Var1= new Select(element);
//		Var1.selectByVisibleText(S);
//}

}
