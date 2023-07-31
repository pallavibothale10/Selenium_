package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	
    	driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
    	Thread.sleep(4000);
    	boolean Button1=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
        System.out.println(Button1);
         
        boolean Button2=driver.findElement(By.xpath("//input[@value='2']")).isSelected();
        System.out.println(Button2);
         
}
}