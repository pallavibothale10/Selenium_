package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OR_Listbox1Of1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(3000);

		WebElement W1= driver.findElement(By.xpath("//select[@class=\"combobox\"]"));
		demo1(W1,"doc 1");
		
	
	}
	
	public static void demo1(WebElement element, String S) {
		
		Select Var1= new Select(element);
		Var1.selectByVisibleText(S);

		
		
	}

}
