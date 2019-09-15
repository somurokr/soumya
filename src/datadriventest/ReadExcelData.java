package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis= new FileInputStream("./ExcelData/testData.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		       Sheet sh=wb.getSheet("sheet1");
		       
		       int totalrow=sh.getLastRowNum();
		       System.out.println(totalrow);
		      Row r= sh.getRow(1);
		      int count=r.getLastCellNum();     

		        /*get particular all columndata
			       for(int j=0;j<totalrow;j++)
			       {
			    	  String celldata= sh.getRow(j).getCell(1).getStringCellValue();
			    	  System.out.println(celldata);
			       }
			      */
		          //get all the particular rowdata
		          for(int i=0;i<28;i++)
		          {
		        	  String rowdata=sh.getRow(1).getCell(i).getStringCellValue();
		        	  System.out.println(rowdata);
		          }
		    
		      
		      
		      
	}
}
