package ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		  String Path = "C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx";
	      FileInputStream file1 = new FileInputStream(Path); // Open the file
	      String data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
          System.out.println(data1);
          
          FileInputStream file2=new FileInputStream("C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx");
          String data2 = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
          System.out.println(data2);
          
          FileInputStream file3 = new FileInputStream("C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx");
          String data3 = WorkbookFactory.create(file3).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data3);
		
		FileInputStream file4 = new FileInputStream("C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx");
        String data4 = WorkbookFactory.create(file4).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data4);
		
		FileInputStream file5 = new FileInputStream("C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx");
        double data5 = WorkbookFactory.create(file5).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(data5);
		
		FileInputStream file6 = new FileInputStream("C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx");
        double data6 = WorkbookFactory.create(file6).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data6);
		
		FileInputStream file7 = new FileInputStream("C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx");
        double data7 = WorkbookFactory.create(file7).getSheet("Sheet3").getRow(0).getCell(7).getNumericCellValue();
		System.out.println(data7);
		
	
	}

}
