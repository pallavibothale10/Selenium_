package Shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowroot {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		        // Navigate to the webpage with the Shadow DOM
		        driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");

		        // Identify the Shadow DOM host element
		        WebElement shadowHost = driver.findElement(By.tagName("smart-ui-menu"));

		        // Execute JavaScript to access the Shadow DOM and its elements
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        WebElement shadowRoot = (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);
		        //Object shadowRoot = jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);

//		        // Now, you can interact with the elements inside the Shadow DOM
		        WebElement shadowElement = shadowRoot.findElement(By.cssSelector("smart-menu.smart-ui-component smart-element smart-menu"));
		       // WebElement shadow= shadowElement.findElement(By.cssSelector("smart-menu.smart-ui-component smart-element smart-menu"));
		        shadowElement.click();
//
//		        // Close the browser
//		        driver.quit();
		    }
	

	}


