package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OR_Listbox_6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
    WebDriver   driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Pal");
      driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Both");
      driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("0978876");
      driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("abc#34");
      Thread.sleep(2000);

     // driver.findElement(By.id("day"))
//      .sendKeys("10");
      List<WebElement> Day = driver.findElements(By.xpath("//select[@name=\"birthday_day\"]//option"));
      
		 System.out.println("Total Day --> " + Day.size());

	        for (int i = 0; i < Day.size(); i++) {
	            String DayName = Day.get(i).getText();
	            System.out.println(DayName);
	            
	            if (DayName.equals("10")) {
	             System.out.println(DayName);
	              Day.get(i).click();
	            
	            }
	        }
	        System.out.println();
	        driver.findElement(By.id("month")).sendKeys("Apr");
	        List<WebElement> Month = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
	        
	  		 System.out.println("Total Day --> " + Month.size());

	  	        for (int j = 0; j < Month.size(); j++) {
	  	            String MonthName = Month.get(j).getText();
	  	            System.out.println(MonthName);
	  	            
//	  	            if (MonthName.equals("10")) {
//	  	              System.out.println(MonthName);
//	  	            Month.get(j).click();
//	  	            
//	  	            }
	  	        }
	  	      System.out.println();
		        driver.findElement(By.id("year")).sendKeys("2020");
		        List<WebElement> Year = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		        
		  		 System.out.println("Total Year --> " + Year.size());

		  	        for (int k = 0; k < Year.size(); k++) {
		  	            String YearName = Year.get(k).getText();
		  	            System.out.println(YearName);
		  	            
//		  	            if (YearName.equals("2020")) {
//		  	              System.out.println(YearName);
//		  	            Year.get(k).click();
//		  	            
//		  	            }
		  	        }

		
	}

}
