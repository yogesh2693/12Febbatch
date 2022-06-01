package com.SauceDemo.UtilityClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelSheet 
{
	
	public static String exceldata(WebDriver driver) throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\Excelsheet\\Book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("table");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		return username;
		
	}

}
