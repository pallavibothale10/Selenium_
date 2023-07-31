package WindowHandleANDHandles;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class P_ChildWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		
		        //Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
				//Step 2:	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				//Step 3:	
		driver.get("https://www.facebook.com/");
		String id = driver.getWindowHandle();  // to get the id of parent window
		System.out.println(id);
				
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("2345");
		Thread.sleep(5000);
				
				
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		String id1 = driver.getWindowHandle();  // to get the id of child window
		System.out.println(id1);
				

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("dfgdr");
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("dfgdr123");
				
				//driver.close();
				
	    driver.switchTo().window(id);
				
	}
	

}
