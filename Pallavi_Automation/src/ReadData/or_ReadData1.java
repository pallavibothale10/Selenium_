package ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class or_ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		  String Path = "C:\\Users\\A\\Desktop\\Installation\\Data1.xlsx";
	        FileInputStream file = new FileInputStream(Path); // Open the file

              XSSFWorkbook workbook = new XSSFWorkbook(file);
             
              for(int i=0;i<2;i++) {
      			
      			for(int j=0;j<2;j++) {
      
      				 String data2= workbook.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
      			        System.out.print(data2);	
      			        
      			        System.out.print(" ");
      		
      				
      			}
      			System.out.println();
      		}
              String data2= workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
              System.out.println(data2);
            
}
}

