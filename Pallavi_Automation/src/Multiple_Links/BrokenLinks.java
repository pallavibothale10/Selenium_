package Multiple_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks{
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
driver.manage () .window() .maximize();
		// Implicit wait for 10 secs
		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		// Open URL OF app
	driver.get("http://newtours.demoaut.com/");
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.in/");
		
		Thread.sleep (5000);
		
		// capture links from a webpage
		List<WebElement>links = driver.findElements (By.tagName ("a"));
		//number of links (total count)
		System.out.println("total link = " +links.size());
		
		
		int BrokenLink = 0;
		int ValidLink= 0;
		
		for (int i = 0; i<links.size(); i++) {
		//By using href attributes we can get URL of required link
			
		WebElement element = links.get(i);
		String url= element. getAttribute("href");
		
		//to check that the url is empty or null  
		if(url==null || url.isEmpty()) {
			System.out.println("URL is empty or null");
		}
		
		//URL is class
		URL link = new URL(url);
		/* The openConnection() method of the URL class returns 
		a URLConnection object that represents the connection to the URL */
		
		//Crete a connection using url object link
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		
		Thread.sleep (2000);
		/*The connect() method is a part of the HttpURLConnection class
		and is used to establish the actual network connection to the URL.*/
		httpConn.connect();
		
		
		int responsecode = httpConn.getResponseCode(); //return the response code
		                                      // is responsecode is above 400 then broken link
		if (responsecode >= 400) {
		System.out.println(url + " - "+"  is broken link");
		BrokenLink++;
		}
		else {
		System.out.println(url + " - " +"  is valid link");
		ValidLink++;
	}
	}
		System.out.println("No of Broken link-->  " +BrokenLink);
		System.out.println("No of Valid link-->  " +ValidLink);

		driver.quit();
}
	
	}
