package org.demo;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adeptin extends Baseclass {
	
	public static void main(String[] args) throws IOException {
		
	launchBrowser();
	
	getUrl("https://adactinhotelapp.com/index.php");
	
	Browsermaxi();
	
	WebElement textuser = driver.findElement(By.id("username"));
	
	keysend(textuser, excelRead(1, 0));
	
	
		
		
		
	} 

}
