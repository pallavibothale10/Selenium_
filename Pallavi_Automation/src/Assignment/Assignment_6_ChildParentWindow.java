package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6_ChildParentWindow {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
	    Thread.sleep(2000);
	    
	  // 1.Get the current window’s handle and write to the console window. It must be the first window handle.
	    String currentwindowhandle=driver.getWindowHandle();
	    
	    System.out.println("current window handle----->"+currentwindowhandle);
	    
	   // 2.Locate the “Visit W3Schools.com!” link and click it. 
	    driver.switchTo().frame("iframeResult");
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
	    
	  //  3.Get all window handles and hold them in a list.
	    Set<String> windowid=driver.getWindowHandles();
	    
	//  4.Write to total window handle number to the console. It must be 2.
	    System.out.println("total window handle size is --->"+windowid.size());
	    
	    Iterator<String> id=windowid.iterator();
	    
	    String parentwindow=id.next();
	    
	    String childwindow=id.next();
	    
	    System.out.println("Parent Window-->"+parentwindow);
		System.out.println("Child Window-->"+childwindow);
		
	   // 5.Switch t0 the second window. 
	    driver.switchTo().window(childwindow);
	    
	  //  6.Get the current window’s handle and write to the console window. It must be a second window handle. 
	    //System.out.println("a second window handle--->"+childwindow);
	    System.out.println("Child window Title-->"+driver.getTitle());
	    
	 //   7.Check the upper left side logo in the second window.   
	    boolean logo=driver.findElement(By.xpath("//i[@style=\"position:relative;z-index:1;color:#04AA6D;font-size:36px!important;\"]")).isDisplayed();
	    
	    System.out.println("Check the left hand side logo--> " +logo);
	    
	  //  8.Go back (Switch) to the first window. 
	    driver.switchTo().window(parentwindow);
	    
	//    10.Get the current window’s handle and write to the console window. It must be the first window handle. 
	    System.out.println("Parent window Title--> "+driver.getTitle());
	    
	//    11.Check the See Run Button Text. It must contain “Run >” text.   
	    String RunButton =driver.findElement(By.xpath("//button[text()=\"Run ❯\"]")).getText();
		System.out.println("Check the Run text--> "+ RunButton);
	    Thread.sleep(3000);
	    
	    driver.quit();
	    

	}
	}


