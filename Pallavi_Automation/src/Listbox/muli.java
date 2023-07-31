package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class muli {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");

driver.manage().window().maximize();

Thread.sleep(2000);


driver.findElement(By.xpath("//input[@aria-expanded=\"false\"]")).click();
}}
