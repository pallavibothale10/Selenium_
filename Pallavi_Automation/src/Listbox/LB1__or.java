package Listbox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LB1__or {
	//handle lisbox select class
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(), \"Create new account\")]")).click();
		Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("pallll");  
	driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("bothhhhh");    


	WebElement day = driver.findElement(By.id("day"));
    Select select = new Select(day);
    List<WebElement> dayOptions = select.getOptions();
    System.out.println("Total day-->" +dayOptions.size());
    
    for(int i= 0; i<dayOptions.size();i++) {
    	
    	String ListDay= dayOptions.get(i).getText();
    	
    	System.out.println(ListDay);
    	if(ListDay.equals("10")) {
    		dayOptions.get(i).click();
    	}
    }
    WebElement Month= driver.findElement(By.id("month"));
    Select S2= new Select(Month);
    List<WebElement> monthOptions = S2.getOptions();
    System.out.println("Total Month-->" +monthOptions.size());
    
    for(int j=0;j<monthOptions.size(); j++) {
    	String ListMonth=monthOptions.get(j).getText();
    	System.out.println(ListMonth);
    	if(ListMonth.equals("Apr")) {
    		monthOptions.get(j).click();
    	}
    }
    
    WebElement Year = driver.findElement(By.id("year"));
    Select S3= new Select(Year);
    List<WebElement> yearOptions= S3.getOptions();
    System.out.println("Total Year-->"+yearOptions.size());
    for(int k=0; k<yearOptions.size();k++) {
    	String ListYear=yearOptions.get(k).getText();
    	System.out.println(ListYear);
    	if(ListYear.equals("2012")) {
    		yearOptions.get(k).click();
    		
    	}
    }
	}

}
