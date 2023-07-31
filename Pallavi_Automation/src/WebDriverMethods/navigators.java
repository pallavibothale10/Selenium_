package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigators {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Dynamic
				
	
		driver.get("https://www.amazon.in/");

		String Title = driver.getTitle();
		System.out.println(Title);
		driver.navigate().to("https://www.typing.com/student/lesson/359/j-f-and-space");
		
		String title1=driver.getTitle();
		
		System.out.println(title1);
	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	

}

}
