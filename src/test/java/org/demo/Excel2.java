package org.demo;

import java.io.File;
 import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
	
	public static String value;
	
	public static  void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\vike\\eclipse-workspace\\Mavan\\Excel1\\sample1.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
	     Sheet sheet = w.getSheet("Sheet1");
	     
	     
	     
	     for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	    	 
	    	 Row r = sheet.getRow(i);
	    	 
	    for (int j = 1; j < r.getPhysicalNumberOfCells(); j++) {
	    	
	    	Cell c = r.getCell(j);
	    	
	    	int cellType = c.getCellType();
	    	
	         String  value  ;
	    	
	    	if (cellType == 1) {
	    		
	    		 value = c.getStringCellValue();
				
			}else if (DateUtil.isCellDateFormatted(c)) {
				
				Date d = c.getDateCellValue();
				
				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
				
				 value = sim.format(d);
				
			}else {
				
				double dd = c.getNumericCellValue();
				
				long l=(long)dd;
				
			    value = String.valueOf(l);
			    
			    
			}
	    	System.out.println(value);
	    	
	    	
	    
	    	
		}
	    
	    
			
		}
	
	
		
		
	}

}
