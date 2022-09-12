package com.zoho.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream file = new FileInputStream("D:\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0; i<sheets; i++) {
			
		if (workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("Testdata")) {
			
			XSSFSheet sheet = workbook.getSheetAt(i);
			
			Iterator<Row> rows = sheet.rowIterator();  //Collection of rows is a sheet
			
			Row firstrow = rows.next();
			
			Iterator<Cell> cell = firstrow.cellIterator();   //Collection of cells is a row
			
			int k=0;
			int coloumn = 0;
			
			while(cell.hasNext()) {
				
				if(cell.next().getStringCellValue().equalsIgnoreCase("TestCases")) {
					coloumn = k;
				}
				
				k++;
				}
			
			while(rows.hasNext()) {
				
				Row r = rows.next();
				if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("LoginPage")) {
					
					Iterator<Cell> ce = r.cellIterator();
					
					while(ce.hasNext())
					
					System.out.println(ce.next().getStringCellValue());
				}
			
			}
			
			
		}
			
		
	}

}
}