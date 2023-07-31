package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_DragAndDrop2 {

	     public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/droppable");
	        Thread.sleep(2000);
	        
	        Actions actions = new Actions(driver);
	        
	        WebElement drag = driver.findElement(By.id("draggable"));
	        WebElement drop = driver.findElement(By.id("droppable"));
	        
	        actions.dragAndDrop(drag, drop).build().perform();
	        
	        Thread.sleep(5000);
	        driver.quit();
	    }
	}


	