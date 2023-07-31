package PageObjectModel_WithoutDDF;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	P_RegistrationClass PF = new P_RegistrationClass(driver);
	
	PF.url();

	PF.F_name("pal");
	Thread.sleep(2000);
	
	
	driver.quit();

}
}