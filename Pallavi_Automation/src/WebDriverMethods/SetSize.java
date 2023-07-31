package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
         WebDriver driver = new ChromeDriver();
		 
        driver.get("https://www.amazon.in/");
			
         driver.manage ().window().maximize();

		 Thread.sleep(3000);
		 
		 Dimension D1= new Dimension(800,600);
			
		 driver.manage ().window().setSize(D1);
		 Thread.sleep(8000);
		 System.out.println(driver.manage ().window().getSize());
		 driver.close();
	}
}
