package Multiple_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

public static void main(String[] args) throws InterruptedException {
		
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			//Step 3:	
		driver.get("https://www.amazon.com");
		List<WebElement>links = driver.findElements(By.tagName ("a"));
		System.out.println("Number of link -->" +links.size());
		
		for (WebElement link : links) {
			System.out.println(link.getText()); // to fetch the link name
			System.out.println(link.getAttribute("href")); // to fetch the url
		}
		driver.quit();
		

}
}