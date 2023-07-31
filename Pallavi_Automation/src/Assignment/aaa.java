package Assignment;

public class aaa {

	/*Assignment 6

Handle Multiple Windows in Selenium
Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target

Test Scenario:
1.Go to the above URL.
2.Get the current window’s handle and write to the console window. It must be the first window handle.
3.Locate the “Visit W3Schools.com!” link and click it.
4.Get all window handles and hold them in a list.
5.Write to total window handle number to the console. It must be 2.
5.Switch t0 the second window.
6.Get the current window’s handle and write to the console window. It must be a second window handle.
7.Check the upper left side logo in the second window.
8.Go back (Switch) to the first window.
10.Get the current window’s handle and write to the console window. It must be the first window handle.
11.Check the See Run Button Text. It must contain “Run >” text.         

*
*
*
*System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		Thread.sleep(5000);
		
		// 2.Locate the “Visit W3Schools.com!” link and click it.
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
		Thread.sleep(5000);
		
		// 3.Get all window handles and hold them in a list.
		
		Set<String> WDID1 = driver.getWindowHandles();
		
		// 4. Write to total window handle number to the console. It must be 2.
		
		Iterator<String> P1 = WDID1.iterator();
		String Parent = P1.next();
		String Child = P1.next();
		
		System.out.println("Parent Window-->"+Parent);
		System.out.println("Child Window-->"+Child);
		
		// 5.Switch t0 the second window.
		
		driver.switchTo().window(Parent);
		//System.out.println("Parent window-->"+driver.getTitle());
		
		driver.switchTo().window(Child);
		
		// 6.Get the current window’s handle and write to the console window. It must be a second window handle.
		System.out.println("Child window Title-->"+driver.getTitle());
		
		// 7.Check the upper left side logo in the second window.
		
		Boolean B1=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
		System.out.println("Check the Left Handside Logo:"+B1);
		
		// 8.Go back (Switch) to the first window.
		
		driver.switchTo().window(Parent);
		
		// 9. 10.Get the current window’s handle and write to the console window. It must be the first window handle.
		System.out.println("Parent window Title-->"+driver.getTitle());
		
		// 10.Check the See Run Button Text. It must contain “Run >” text.
		
		String S1=driver.findElement(By.xpath("//button[contains(text(),'Run ❯')]")).getText();
		System.out.println(S1+"Check the Run text:");
		
        Thread.sleep(3000);
        
        driver.quit();*/
}
