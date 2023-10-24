package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public static Workbook book;
	public static Sheet sheet;
	public static Object[][] readdata(String Sheetname){
		FileInputStream file = null;
		try {
			file = new FileInputStream ("C:\\Users\\swapn\\eclipse-workspace\\AmazonP\\src\\test\\java\\testdata\\Details.xlsx");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
	 book = WorkbookFactory.create(file);
		}
		catch(IOException a)
		{
			a.printStackTrace();
		}
	 sheet =	book.getSheet(Sheetname);
	}
	
}
