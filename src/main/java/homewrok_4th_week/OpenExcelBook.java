package homewrok_4th_week;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpenExcelBook {

	public void ExcelBook(String FilePath) throws IOException {
		
		XSSFWorkbook Wbook = new XSSFWorkbook(FilePath);
		
		
	}
	
}
