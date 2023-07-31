package PageObjectModel_WithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_RegistrationClass {
	WebDriver driver;
	
	// Call constructor with public AL
	
	public P_RegistrationClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Find Web Element with @FindBy annotation
	
	@FindBy(xpath="//input[@ng-model=\"FirstName\"]")
	WebElement fname;
	
	@FindBy(xpath="//input[@ng-model=\"LastName\"]")
	WebElement lname;
	
	//Create method with public AL
	
	public void F_name(String Fname)
	{
		fname.sendKeys(Fname);
	}
	

	public void url()
	{
		driver.get("https://demo.automationtesting.in/Register.html");
	}

}
