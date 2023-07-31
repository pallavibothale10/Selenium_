package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_edge {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\A\\Desktop\\Installation\\MicrosoftEdge\\edgedriver_win64\\edgedriver.exe");
	
		//C:\Users\A\Desktop\Installation\MicrosoftEdge\edgedriver_win64\\edgedriver.exe
		EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(3000);
		
		
	}

}
