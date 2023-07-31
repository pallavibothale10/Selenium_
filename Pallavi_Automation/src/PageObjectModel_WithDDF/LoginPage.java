package PageObjectModel_WithDDF;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;     //globality dec //this driver is used to interact with browser
	
	//WebDriver Element = driver.findElement(By.id("username"));
	
	public LoginPage(WebDriver driver) { // this driver is used to access the webelement 
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement useremail;
	@FindBy(xpath="//input[@name=\"password\"]")
	public WebElement Password;
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement Button;
	
     public void Usermail(String email){
    	 useremail.sendKeys(email);
}
     public void Password1(String pass){
    	 Password.sendKeys(pass);
}
     public void Login(){
    	 Button.click();
}
     public void GoTo() {
    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     }
}
