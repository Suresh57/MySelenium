package homewrok_4th_week;

import java.io.IOException;

import org.junit.Test;

public class ExcelWrapperTest extends ExcelWrapper{
	
	@Test
	
	public void TestExcel() throws IOException {
		
		OpenWorkBook("E:\\Selenium\\SimpleProject\\mybook.xlsx", "Sheet1");
		getNoofRows("E:\\Selenium\\SimpleProject\\mybook.xlsx", "Sheet1");
		getCellValue("E:\\Selenium\\SimpleProject\\mybook.xlsx", "Sheet1",1,1);
		WriteData("E:\\Selenium\\SimpleProject\\mybok.xlsx",null, 1,1,"Suresh");
	}
	
	
}
