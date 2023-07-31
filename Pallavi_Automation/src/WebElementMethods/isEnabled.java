package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	//driver.get("https://www.facebook.com/");
    	//driver.get("https://app.hubspot.com/login");
		
    	driver.get("http://omayo.blogspot.com/");
    	
    	Thread.sleep(4000);
    	
 //   	Boolean b1=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();  
 // 	System.out.println(B1);
 // 	Boolean b2=driver.findElement(By.xpath("//button[@id='loginBtn']")).isEnabled();
 // System.out.println(b2);
    	
    	Boolean B3 = driver.findElement(By.id("but1")).isEnabled();
	    System.out.println(B3);
	   // driver.close();

}

}
