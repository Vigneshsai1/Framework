package org.base;

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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static Actions a;
	public static JavascriptExecutor js;
	public static Select s;
	
	public  static void launchBrowser() {
		 driver=new ChromeDriver();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void Browsermaxi() {
		driver.manage().window().maximize();
	}
	public static void keysend(WebElement refer,String name) {
		refer.sendKeys(name);
		
	}
	public static void toclose(WebElement refer) {
		refer.clear();

	}
	

			
	public static void Toclick(WebElement Referclick) {
			Referclick.click();
	}
	public static void gettheText(WebElement ReferText) {
		ReferText.getText();
		
	}
	public static void attributeget(WebElement attribute,String value) {
		
		attribute.getAttribute(value);
	}
	public static void objectcreataction() {
	    a=new Actions(driver);

	}
	public static void Rightclick(WebElement elementrefer) {
		a.contextClick(elementrefer).perform();

	}
	public static void move(WebElement elementrefer ) {
		a.moveToElement(elementrefer).perform();

	}
	public static void Doubletab(WebElement elementrefer) {
		a.doubleClick(elementrefer).perform();

	}
	public void Holdandclick(WebElement elementrefer) {
		a.clickAndHold(elementrefer).perform();

	}
	public static void javaobjectcreation() {
		 js=(JavascriptExecutor)driver;

	}
	public static void javasendkey(String script,WebElement Referince) {
		js.executeScript(script, Referince);

	}
	public static void javaclick(String script,WebElement Referinc) {
		js.executeScript(script, Referinc);

	}
	public static void objectDrOpdown(WebElement referince) {
		 s=new Select(referince);

	}
	public static void Byvalue(String value) {
		s.selectByValue(value);

	}
	public static void Byvisibl(String value) {
		s.selectByVisibleText(value);

	}
	
	


	public static String  excelRead(int row,int cell) throws IOException {
		
		File f=new File("C:\\Users\\vike\\eclipse-workspace\\Mavan\\Excel1\\sample1.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
	     Sheet sheet = w.getSheet("Sheet1");
	     
	     Row r = sheet.getRow(row);
	    	 
	    	Cell c = r.getCell(cell);
	    	
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
	    	return value;
	
	
	
	
	
	
	

	}
}
	
	
	


