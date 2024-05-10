
package org.demo;

import java.io.File;
import java.io.FileInputStream;	
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\vike\\eclipse-workspace\\Mavan\\Excel1\\sample1.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		Row r = sheet.getRow(2);
		
		Cell c = r.getCell(0);
		
		System.out.println(c);
		
		
		
		
	}

}