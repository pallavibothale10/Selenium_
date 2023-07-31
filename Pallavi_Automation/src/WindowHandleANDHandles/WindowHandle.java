package WindowHandleANDHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		//Step1:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			//Step 3:	
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		String WindowID= driver.getWindowHandle();
		//by using getwindowhandle methods we can get theID of the browserWindow
		//744D4E293721DA5D3B4392F6DC21106B
		
		System.out.println(WindowID);
		
	}

}
