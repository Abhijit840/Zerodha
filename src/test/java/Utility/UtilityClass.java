package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	
	public static String getID1(int rowindex, int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet");
		String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
		
	}

}
