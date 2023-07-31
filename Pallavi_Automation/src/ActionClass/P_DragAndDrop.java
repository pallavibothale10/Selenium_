package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_DragAndDrop {

	     public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/droppable");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[@class=\"nav-item nav-link\"]")).click();
	        
	        Actions actions = new Actions(driver);
	        
	        WebElement drag1 = driver.findElement(By.id("acceptable"));
	        WebElement drop1=driver.findElement(By.xpath("(//div[@id=\"droppable\"])[2]"));
	        
	        
	        actions.dragAndDrop(drag1, drop1).build().perform();
	        
	        Thread.sleep(5000);
	        System.out.println("Drop Text-->" +drop1.getText());
	        driver.quit();
	    }
	}


	