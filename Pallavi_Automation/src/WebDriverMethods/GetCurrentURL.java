package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		 
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		if(URL.equals("https://www.amazon.in/"))
			System.out.println("Current URL");
		else {
			System.out.println("IncorrectURL");
		}
		driver.close();
	}

}
