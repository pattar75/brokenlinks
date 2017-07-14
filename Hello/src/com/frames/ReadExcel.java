package com.frames;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	public static void main(String[] args) throws Exception {
		
		//specify the path of file
		
		File src = new File("\\C:\\Users\\patta\\Desktop\\Selenium\\Testdata.xlsx");
		
			FileInputStream fis = new FileInputStream(src);
			
			//Load workbook
			
			XSSFWorkbook xwb1 =new XSSFWorkbook(fis);
			
			//Load sheet
			
			XSSFSheet sh1 = xwb1.getSheetAt(0);
			String data1= sh1.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Data from excel is " +data1);
			
			XSSFSheet sh2 = xwb1.getSheetAt(0);
			String data2 = sh2.getRow(0).getCell(1).getStringCellValue();
			System.out.println("Data from excel is" +data2);
			
			XSSFSheet sh3 = xwb1.getSheetAt(0);
			String data3 = sh3.getRow(1).getCell(0).getStringCellValue();
			System.out.println("Data from excel is " +data3);
			
			XSSFSheet sh4 = xwb1.getSheetAt(0);
			String data4 = sh3.getRow(1).getCell(1).getStringCellValue();
			System.out.println("Data from excel is " +data4);
			
			XSSFSheet sh5 = xwb1.getSheetAt(0);
			String data5 = sh3.getRow(1).getCell(2).getStringCellValue();
			System.out.println("Data from excel is " +data5);
			
	}
	
}

			
		
		


