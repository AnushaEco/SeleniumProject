package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New2 {
	public static void main(String[] args) throws Throwable, Throwable, IOException {
		FileInputStream f= new FileInputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
 Workbook book = WorkbookFactory.create(f);
book.getSheet("Sheet1").getRow(0).getCell(1).setCellValue("anusha");
FileOutputStream f1= new FileOutputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
book.write(f1);
  
	}
}
