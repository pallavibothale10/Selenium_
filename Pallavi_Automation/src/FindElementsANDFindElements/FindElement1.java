package FindElementsANDFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {
	public static void main(String[] args) throws InterruptedException {
		//Step1:
				System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
					//Step 2:	
				WebDriver driver=new ChromeDriver();
					//Step 3:	
				driver.get ("https://www.amazon.in/");
				driver.manage().window().maximize();
				
				WebElement Searchbox =driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	            Searchbox.sendKeys("Oneplus");
				
	          WebElement Links=  driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
	          System.out.println(Links.getText());
				Thread.sleep(3000);
	driver.close();
	}

}
