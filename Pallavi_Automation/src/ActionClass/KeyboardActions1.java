package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement input1= driver.findElement(By.id("email"));
		WebElement input2= driver.findElement(By.id("pass"));

		Thread.sleep(2000);
		input1.sendKeys("Thisismyfirstjavaprogram");
		Actions act= new Actions(driver);
		
		//CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
																						
	
		//CTRL+C
				act.keyDown(Keys.CONTROL);
				act.sendKeys("c");
				act.keyUp(Keys.CONTROL);
				act.build().perform();
				
				//tab
				act.sendKeys(Keys.TAB);
				act.build().perform();
				
				
				//CTRL+V
				act.keyDown(Keys.CONTROL);
				act.sendKeys("v");
				act.keyUp(Keys.CONTROL);
				act.build().perform();
				
				//compareText means email are password values same of not
				if(input1.getAttribute("values").equals(input1.getAttribute("values"))) {
					System.out.println("Correct Copied");
				}
					else {
						System.out.println("InCorrect Copied");
					}
				}
																		
		
	
}
