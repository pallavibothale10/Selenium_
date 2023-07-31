package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_IFrame {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
driver.switchTo().frame("frame1");

String Text = driver.findElement(By.xpath("//h1[text()=\"This is a sample page\"]")).getText();

System.out.println(Text);

//WebElement Text = driver.findElement(By.xpath("//h1[text()=\"This is a sample page\"]"));
//String data= Text.getText();
//System.out.println(data);
	}

}
