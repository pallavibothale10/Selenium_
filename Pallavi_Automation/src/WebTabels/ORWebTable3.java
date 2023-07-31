package WebTabels;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORWebTable3 {
	

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		 
		 //scroll till example element (table)
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    WebElement Ele = driver.findElement(By.xpath("//h3[contains(text() , \"Example\")]"));
		js.executeScript("arguments[0].scrollIntoView();", Ele);
	    
		//First Way
		//Question1-- How many rows in table
		int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Total number of row-->" +Row);
		//OR
		List<WebElement> Row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("ORTotal number of row-->" +Row1.size());
	    
	    //question - How many columns in table 
		int Col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total number of Col-->" +Col);
		//OR
		List<WebElement> Col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("ORTotal number of Col-->" +Col1.size());
		System.out.println();
		
		//Question- Retrive column data
		
		for (int i = 0; i < Col1.size(); i++) {
		    WebElement column = Col1.get(i);
		    String text = column.getText();
		    System.out.print(text + " | ");
		  
		}
		System.out.println();
		System.out.println();
		
		//Question- Retrive column and row data
		for(int i = 2;i<=Row; i++) {
			for (int j=1; j<=Col;j++) {
				
         String data1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data1+"|");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
