package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        Thread.sleep(2000);

//        WebElement firstframe=driver.findElement(By.xpath("//frameset[@frameborder=\"1\"]"));
//        driver.switchTo().frame(firstframe);
       // Thread.sleep(2000);
        // Switch to the frame
      //  WebElement frameLeft = driver.findElement(By.name("frame-left"));
        driver.switchTo().frame(3);

        // Retrieve the text from the element within the frame
        String data = driver.findElement(By.tagName("body")).getText();
       
	        System.out.println( data);
}
}