package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Listbox_5 {
	public static void main(String[] args) throws InterruptedException {
		//Step 1
				System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
		        //Step 2
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.redbus.in/");
				
				driver.findElement(By.xpath("//input[@class=\"sc-bxivhb hrsLPT\"]")).sendKeys("mumbai");
			       Thread.sleep(2000);
			       
			       List<WebElement> city =driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li"));
			      
			       Thread.sleep(10000);
                  System.out.println("total city count--> " +city.size());
			       
			       for(int i= 0; i<city.size();i++) {
			    	  String CityName= city.get(i).getText() ;
			    	  System.out.println(CityName);
			    	  
			    	  if(CityName.equals("Borivali East")) {
			    		  city.get(i).click();
			    	  }
			       }
	driver.quit()
	;}

}
