package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_4 {
	public static void main(String[] args) throws InterruptedException {
		//Step 1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
        //Step 2
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("pal");
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("both");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123xzv");

		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		//day
		//How will you get the total no of size of List
		Select S1=new Select(Day);
		List <WebElement> ListDay= S1.getOptions();
		System.out.println("TotalDays--> " +ListDay.size());
		
		//How will you print all the values
		//0;0<31
		//1<31
		for(int i= 0;i<ListDay.size();i++) {
			String DayValues= ListDay.get(i).getText();
			//1=1.getText();
			System.out.println(DayValues);
			
			//How will you select Specific values from the dropdown
			if(DayValues.equals("10")) {   //10.10// 1.equals10,2.equals10...
				
				ListDay.get(i).click();
			}
			
		}
		System.out.println();
		
		//month
		Select S2= new Select(Month);
		List<WebElement> ListMonth= S2.getOptions();
		System.out.println("Total Month-->" +ListMonth.size());
		
		for(int j=0;j<ListMonth.size();j++) {
			String MonthValues=ListMonth.get(j).getText();
			System.out.println(MonthValues);
			
			if(MonthValues.equals("Apr")) {
				
				ListMonth.get(j).click();
			}
		}
		System.out.println();
		
		//year
		Select S3= new Select(Year);
		List<WebElement> ListYear= S3.getOptions();
		System.out.println(ListYear.size());
//		
//		for(int k= 0; k<ListYear.size();k++) {
//			String YearValues= ListYear.get(k).getText();
//			System.out.println(YearValues);
//			
//			if(YearValues.equals("1996")) {
//				ListYear.get(k).click();
//				
//			}
//		}
		for (WebElement s : ListYear) {
		    String YearValues = s.getText();
		    System.out.println(YearValues);
		    
		    if (YearValues.equals("1996")) {
		        s.click();
		    }
		
	}

	}
}
