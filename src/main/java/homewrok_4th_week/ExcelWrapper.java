package homewrok_4th_week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExcelWrapper extends OpenExcelBook{
	
	RemoteWebDriver driver;
	
	public void OpenWorkBook(String Filepath, String SheetName) {
		
		
			
			try {
				XSSFWorkbook Wbook = new XSSFWorkbook(Filepath);
				XSSFSheet sheet =Wbook.getSheet(SheetName);
				System.out.println("Able to Open");
			} catch (IOException e) {
				System.out.println("File Not Opened");
			}
			
		}
	
	public int getNoofRows(String Filepath, String SheetName) throws IOException {
		
		try {
			XSSFWorkbook Wbook = new XSSFWorkbook(Filepath);
			XSSFSheet sheet =Wbook.getSheet(SheetName);
			int noofrow=sheet.getLastRowNum();
			System.out.println("No of Rows: " + noofrow);
	
		} catch (Exception e) {
			System.out.println("No Rows Retruned");
		}
		return 0;
	}
	
	
	
	public String getCellValue(String Filepath, String SheetName,int Rownum, int Cellnum) throws IOException {
		
		XSSFWorkbook Wbook = new XSSFWorkbook(Filepath);
		XSSFSheet sheet = Wbook.getSheet(SheetName);
		String val=sheet.getRow(Rownum).getCell(Cellnum).getStringCellValue();
		System.out.println("Cell Value: " + val);
		return null;
		
	}
	
	public void WriteData(String FilePath,String Sheet,int Rownum, int Cellnum, String Data) throws IOException {
		
		try {
			XSSFWorkbook Wbook = new XSSFWorkbook();
			XSSFSheet sheet = Wbook.getSheet(Sheet);
			XSSFRow row0=sheet.createRow(Rownum);
			sheet.getRow(Rownum).createCell(Cellnum).setCellValue(Data);
			System.out.println(sheet.getRow(Rownum).getCell(Cellnum).getStringCellValue());
			FileOutputStream fileout = new FileOutputStream(new File(FilePath));
			Wbook.write(fileout);
			Wbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			System.out.println("Unable to Write");
		}
	}
	
		
	}


