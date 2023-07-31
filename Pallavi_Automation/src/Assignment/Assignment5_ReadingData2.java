package Assignment;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Assignment5_ReadingData2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path= "C:\\Users\\A\\Desktop\\Installation\\Data2.xlsx";
FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	
		//4. Print last Row&Cell number.
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		
		System.out.println("last row number--->"+row);
		
		
		int cell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("last cell number--->"+cell);
		
		
		System.out.println();
		
		System.out.println("Print data using if else ");
		//3. Print all the data using if else statement

		
		for(int r=0;r<row;r++) {
			
			XSSFRow row1=sheet.getRow(r);
			
			for(int c=0;c<cell;c++) {
				
			
				XSSFCell cell1=row1.getCell(c);
				if (cell1.getCellType() == CellType.NUMERIC) {//CellType enum is used to represent the different types of
					                                            //cells that can exist in an Excel spreadsheet. 
                    double value = cell1.getNumericCellValue();
                    System.out.print(value);
				}
                    
                    else
                    	if (cell1.getCellType() == CellType.STRING) {
                            String value1 = cell1.getStringCellValue();
                            System.out.print(value1);
				
			           
				
		}
				System.out.print("  ||  ");
		
		}
		
			System.out.println("  ");
		
		
		
		}	
		
		
		
	}
}