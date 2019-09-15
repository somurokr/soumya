package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {

	static Properties pobj;
	public String ppath="./commondata.properties.txt";
	public String epath="./ExcelData/testData.xlsx";
	
	public String getpropertyobject(String key) throws Throwable
	{
		FileInputStream fis= new FileInputStream(ppath);
		pobj= new Properties();
		pobj.load(fis);
		
		String data=pobj.getProperty(key);
		return data;
		
	}
	public String getExcelData(String sheetname,int rownum,int colnum) throws Throwable
	{
		FileInputStream fis= new FileInputStream(epath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell c=row.getCell(colnum);
		String data=c.getStringCellValue();
		return data;
		
		
	}
	
	public void setExcelData(String sheetname,int rownum,int colnum,String data) throws Throwable
	{
		FileInputStream fis= new FileInputStream(epath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		      Cell cel =row.createCell(colnum);
		       cel.setCellValue(data); 
		       FileOutputStream fos= new FileOutputStream(epath);
		       wb.write(fos);
		       wb.close();
		
	}
	
}
