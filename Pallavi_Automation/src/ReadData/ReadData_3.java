package ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_3 {

	public static void main(String[] args) throws IOException {
       
		String path = "C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\TestData\\Data1.xlsx";
		FileInputStream file1= new FileInputStream(path);
		XSSFWorkbook work= new XSSFWorkbook(file1);
		XSSFSheet Sheet = work.getSheetAt(2);
		//		XSSFSheet Sheet = work.getSheet("Sheet3");
		int Rows = Sheet.getLastRowNum();
		System.out.println(Rows);
		int Column= Sheet.getRow(1).getLastCellNum();
		System.out.println(Column);
		
		for(int R=0;R<Rows;  R++) {
			XSSFRow row =Sheet.getRow(R);
			for(int C= 0; C<Column; C++) {
				XSSFCell cell =row.getCell(C);   
						switch(cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				default:
					break;
				}
				System.out.print("   ||   ");
			}
			System.out.println();
		}

	}

}
