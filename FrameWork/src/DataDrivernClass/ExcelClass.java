package DataDrivernClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelClass {
/*
 * data driving xcel
 * 
 * we need to download poi jar to read and write the data to excel 
 * 
 * we need to create class of File input stream class and provide the path of xlx 
 * workbook    and after sheet row coloumn grab the value
 * first we need to take the control of workbook 
 * to read and write we slect the excel 
 * 
 * 
 * 
 */
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow  row;
	public static XSSFCell cell;
	
	public void Getexcel() throws FileNotFoundException
	{
		fis=new FileInputStream("C:\\data");
		wb=new XSSFworkbook(fis);
		//now gt the sheet name script
		sheet = wb.getSheet("script");
		row=sheet.getRow(2);
		cell=row.getCell(2);
		String value=cell.getStringCellValue();
		

	}
	public static String getCellData(int row ,int col)
	{
		fis=new FileInputStream("C:\\data");
		wb=new XSSFworkbook(fis);
		//now gt the sheet name script
		sheet = wb.getSheet("script");
		row=sheet.getRow(2);
		cell=row.getCell(2);
		
		//to set data steps till above steps will same 
		cell.setCellValue("hye")
		return cell.getStringCellValue();
	}
	public setData()
	{
		//https://www.youtube.com/watch?v=iIp7_n01RzI
		//https://www.youtube.com/watch?v=zSjwgjVl4P4
		//https://www.youtube.com/watch?v=m4rjnOxqcjg
		
	}
}
