package PageObjectModel_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoClass {
	WebDriver driver;

	public MyInfoClass(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	// to click on my info tab
	 @FindBy(xpath="//span[text()=\"My Info\"]")
	 WebElement MyInfo;
	 
	 @FindBy(xpath="//input[@name=\"firstName\"]")
	 WebElement FirstName;
	 
	 @FindBy(xpath="//input[@name=\"lastName\"]")
	 WebElement LastName;
	 
	 @FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	 WebElement NickName;
	 
	 @FindBy(xpath="//a[text()=\"Contact Details\"]")
	 WebElement ContactNumber;
	 
	 public void MyInfoButton() {
		 MyInfo.click();
	 }

	 public void FirstnameValidation() {
		String Fname=FirstName.getText();
		if(Fname.equals("Paul")) {
			System.out .println("Correct firstname");
			}
			else {
			System.out.println ("Incorrect firstname");
			}
	 }
	 
	 public void LastnameValidation() {
		 String Lname=LastName.getText();
		 if(Lname.equals("David")) {
				System.out .println("Correct lastname");
				}
				else {
				System.out.println ("Incorrect lastname");
				}
	 }
	 public void NickName() {
		 String NickN=NickName.getText();
		 if(NickN.equals("Stephen")) {
				System.out .println("Correct nickname");
				}
				else {
				System.out.println ("Incorrect nickname");
				}
	
	 }
	 public void ContactNo() {
		 ContactNumber.click();
		 
	 }
	 
}
