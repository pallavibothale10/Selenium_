package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox_6 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
       driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Pal");
      driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Both");
      driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("0978876");
      driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("abc#34");
      Thread.sleep(2000);

    String Day="//select[@id=\"day\"]//option";
    String Month="//select[@id=\"month\"]//option";
    String Year="//select[@id=\"year\"]//option";
    
    String DOB="10-Apr-1990";
    String Date[]=DOB.split("-");
      
    Selectdropdown(Day, Date[0]);
    Selectdropdown(Month, Date[1]);
    Selectdropdown(Year, Date[2]);

      
	}
	public static void Selectdropdown(String Element, String Values) {
	
	List<WebElement> V1= driver.findElements(By.xpath(Element));
		//System.out.println(V1);
		System.out.println("Total-->" +V1.size());
		
		for(int i =0; i<V1.size();i++) {
			System.out.println(V1.get(i).getText());
			
			if(V1.get(i).getText().equals(Values)) {
				V1.get(i).click();
				
			}
		}
		
	}

}
