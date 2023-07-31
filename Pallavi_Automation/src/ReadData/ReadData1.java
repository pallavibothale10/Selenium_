package ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void main(String[] args) throws  IOException {

		
		  String Path = "C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx";
	        FileInputStream file = new FileInputStream(Path); // Open the file

              XSSFWorkbook workbook = new XSSFWorkbook(file);
              String data2= workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
              System.out.println(data2);
            //String data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
            //System.out.println(data1);
}
}

