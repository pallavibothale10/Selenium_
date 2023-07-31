package PageObjectModel_WithDDF;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class  BaseorTestClass {
	

	
	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//login page
	        LoginPage LP = new LoginPage(driver);

	        String path = "C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\TestData\\DataDriver1.xlsx";
	        FileInputStream file = new FileInputStream(path);

	        Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
	        LP.GoTo();

	        String UserID = Data.getRow(1).getCell(0).getStringCellValue();
	        LP.Usermail(UserID);

	        String Password = Data.getRow(1).getCell(1).getStringCellValue();
	        LP.Password1(Password);

	        LP.Login();
//Dashboard page
			DashboardPage DP =new DashboardPage (driver);
		
			DP.Namevalidation();
			DP.TimeAt () ;

//MyInfo page
			MyInfoClass IC = new MyInfoClass(driver);
			
			IC.MyInfoButton();
			IC.FirstnameValidation();
			IC.LastnameValidation();
			IC.NickName();
			IC.ContactNo() ;

	      //  file.close();
	      //  driver.quit();
	    }
	


}
