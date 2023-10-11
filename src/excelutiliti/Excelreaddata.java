package excelutiliti;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelreaddata {
	
	public static String getreaddata(String loc,int sheetno,int colno,int rowno)

	{
		String value="";
		try {
			FileInputStream fis=new FileInputStream(loc);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			value =sheet.getRow(rowno).getCell(colno).getStringCellValue();
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		String loc= "S:\\Eclipse\\Java 08242022\\testdata\\testdata1.xlsx";
		
		String out=getreaddata(loc,0,0,13);
		System.out.println(out);
		
		
	}
}
