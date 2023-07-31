package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_WIth_DDF {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        
        //UserNmae
        FileInputStream file1
        = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\TestData\\DataDriver1.xlsx");
       String Username= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     
       driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
       
       //Password
       FileInputStream file2
       = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\TestData\\DataDriver1.xlsx");
      String Password= WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
       driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       
       //*
       FileInputStream file3
       = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\TestData\\DataDriver1.xlsx");
      
	    String Name= WorkbookFactory.create(file3).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		Thread.sleep(2000);
	    String UName=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
        //System.out.println(UName);
		System.out.println(Name);
		if(UName.equals(Name)) {
			System.out.println("user name is correct or login successfully");
			
		}else
		{
			System.out.println("login is not successful");
		}

	}

}
