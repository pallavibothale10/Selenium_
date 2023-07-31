package WindowHandleANDHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			//Step 3:	
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		Thread.sleep(3000);

		Set<String> WindowID= driver.getWindowHandles();
		//it is use to store all opened windows ID in the set data
		
		//first method
		Iterator<String> It=  WindowID.iterator();
		
		String ParentWindow= It.next();
		String ChildWindow= It.next();

		System.out.println("ParentWindow -->" +ParentWindow);
		System.out.println("ChildWindow-->" +ChildWindow);
		
		//Second way
		List<String> WindowList= new ArrayList(WindowID);
		
		String Parent =WindowList.get(0);
		String Child =WindowList.get(1);

		System.out.println("ParentWindow -->" +Parent);
		System.out.println("ChildWindow-->" +Child);
		
		///ArrayList<String> AL= driver.getWindowHandles();
		driver.switchTo().window(ParentWindow);
		System.out.println("ParentWindow-->" +driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println("ChildWindow-->" +driver.getTitle());
		
		driver.quit();

	}

}
