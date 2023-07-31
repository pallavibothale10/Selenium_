package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics_ChildWindow {
	public static void main(String[] args) {
		
		//Step1:
				System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
					//Step 2:	
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/browser-windows");
				
				driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
				
				Set<String> ids= driver.getWindowHandles();
				//System.out.println(ids);
				
				ArrayList<String> al= new ArrayList<String>(ids);
				 String ChildWindowIs= al.get(1);   /// index 1 for child
				 System.out.println(ChildWindowIs);
				 
				 String ParentWindowid = al.get(0);
				 System.out.println(ParentWindowid);
				 
				 
				 if(ChildWindowIs.equals(ParentWindowid))
				 {
					System.out.println("Both are equal"); 
				 }
				 else
				 {
					 System.out.println("Both are different");
				 }
	}
	
	/*Iterator<String> it=id.iterator();
		
		String parentid=it.next();
		
		String childid =it.next();
		
		System.out.println("parentwindow--->"+parentid);
		
		System.out.println("childwindow--->"+childid);*/

}
