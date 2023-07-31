package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Listbox_5 {
	public static void main(String[] args) throws InterruptedException {
		
		//Handle listbox without using select class-->REDBUS
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.findElement(By.id("txtSource")).sendKeys("pune");
       Thread.sleep(5000); // Wait for the list to populate

		 List<WebElement> city = driver.findElements(By.xpath("//ul[@id='C120_suggestion-wrap']//li"));
		 //Thread.sleep(2000); 
		 System.out.println("Total Count --> " + city.size());

	        for (int i = 0; i < city.size(); i++) {
	            String cityName = city.get(i).getText();
	            System.out.println(cityName);
	            
	            if (cityName.equals("Wakad, Pune")) {
	             // System.out.println(cityName);
	                city.get(i).click();
	             break;
	            }
	        }
	        System.out.println();
	      //destination
	        driver.findElement(By.id("txtDestination")).sendKeys("mumbai");
	        Thread.sleep(2000);
	        List<WebElement> Dcity = driver.findElements(By.xpath("//ul[@class=\"C120_suggestions\"]//li"));

	        System.out.println("Total Count --> " + Dcity.size());

	        for (int j = 0; j < Dcity.size(); j++) {
	            String DcityName = Dcity.get(j).getText();
	            System.out.println(DcityName);

	            if (DcityName.equals("Vashi, Mumbai")) {
	                System.out.println(DcityName);
	                Dcity.get(j).click();
	                break;
	            }
	        }

	       // driver.findElement(By.xpath("//input[@id=\"txtOnwardCalendar\"]")).click();
	}

}
