package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_ListBox_6 {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
		
			Thread.sleep(3000);
			//1. Print all the values form "Skills" drop-down and select APIs values from it
			WebElement Skills=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
			
			Select S1= new Select(Skills);
			List<WebElement> ListSkills=S1.getOptions();	
			
			System.out.println("TotalSkills = " +ListSkills.size());
			for(int i = 0; i<ListSkills.size();i++) {
				
				String SkillValues = ListSkills.get(i).getText();
				System.out.println(SkillValues);
				
				if(SkillValues.equals("APIs"))
					ListSkills.get(i).click();
			}
			Thread.sleep(2000);
			//driver.close();
			//2. Print all the values which are present in day, 
			//month and year drop down & Select Date Of Birth (8/06/1923)
			
			System.out.println();

			//DAY
			WebElement Years=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
			Select S2= new Select(Years);
			List<WebElement> ListYears=S2.getOptions();	
			
			System.out.println("TotalYears = " +ListYears.size());
			for(int j = 0; j<ListYears.size();j++) {
				
				String YearValues = ListYears.get(j).getText();
				System.out.println(YearValues);
				
				if(YearValues.equals("1923"))
					ListYears.get(j).click();
			}
			System.out.println();

			//month
WebElement Months=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
			
			Select S3= new Select(Months);
			List<WebElement> ListMonths=S3.getOptions();	
			
			System.out.println("TotalMonths = " +ListMonths.size());
			for(int k = 0; k<ListMonths.size();k++) {
				
				String MonthValues = ListMonths.get(k).getText();
				System.out.println(MonthValues);
				
				if(MonthValues.equals("June"))
					ListMonths.get(k).click();
			}
			System.out.println();
			//day
WebElement Days=driver.findElement(By.id("daybox"));
			
			Select S4= new Select(Days);
			List<WebElement> ListDays=S4.getOptions();	
			
			System.out.println("TotalDays = " +ListDays.size());
			for(int l = 0; l<ListDays.size();l++) {
				
				String DayValues = ListDays.get(l).getText();
				System.out.println(DayValues);
				
				if(DayValues.equals("8"))
					ListDays.get(l).click();
	}
	driver.close();
	Thread.sleep(10000);
	}
}
