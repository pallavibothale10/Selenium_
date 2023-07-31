package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("pal");
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("both");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123xzv");
		
		//findElement is a method & return type is webelement
		WebElement Day =driver.findElement(By.xpath("//select[@class=\"_9407 _5dba _9hk6 _8esg\"]"));
		WebElement Month =driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
		
		//Listbox(Day,"10");
		//Listbox(Month, "4");
		//Listbox(Year,"1996");
		
		/* OR */
		String DOB="10/Apr/1996";
		String []Date= DOB.split("/");
		
		Listbox(Day,Date[0]);
		Listbox(Month,Date[1]);
		Listbox(Year,Date[2]);
		
		
	}
	public static void Listbox(WebElement element, String Text) {    //method
		
		Select Select1= new Select(element);
	/*The Select class in Selenium WebDriver provides methods to interact with dropdown 
lists (also known as select elements) on a web page.
The Select class constructor takes a WebElement object as a parameter.
In this case, the WebElement object element represents the dropdown list we want to interact with. By passing the element to the Select constructor, we create a new Select instance that 
is associated with that dropdown list.*/
		Select1.selectByVisibleText(Text);
/*In this line, we use the selectByVisibleText method 
 * of the Select class to select an option from the dropdown 
 * list based on its visible text. The selectByVisibleText 
	* method takes a String parameter, 
which is the visible text of the option we want to select.*/
		
	}

}
