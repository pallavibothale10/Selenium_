package PageObjectModel_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;    ///globalic dec  
	//1.
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement Name;
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	WebElement Time;
	
	public DashboardPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void Namevalidation () {
	String Text=Name.getText();
	
	if(Text.equals ("Paul Collings")) {
	System.out .println("Correct username");
	}
	else {
	System.out.println ("Incorrect username");
	}
	}
	public void TimeAt() {
	boolean Timel=Time.isDisplayed ();
	System.out.println(Timel);
	
}
	public void GoTo() {
   	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}