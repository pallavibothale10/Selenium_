package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitlemethod {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Dynamic
				
		driver.get("https://www.amazon.in/");

		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.close();
 String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"; 
    if(Title.equals(ExpectedTitle)) {
    	System.out.println("Correct Title");
    }
    else {
    	System.out.println("Incorrect Title");
    }
}
}
