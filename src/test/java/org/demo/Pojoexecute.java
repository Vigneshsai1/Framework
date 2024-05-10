package org.demo;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.sample.Loginpojo;

public class Pojoexecute extends Baseclass {
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		getUrl("https://adactinhotelapp.com/index.php");
		Browsermaxi();
		
		Loginpojo l=new Loginpojo();
		
		WebElement textuser = l.getTextuser();
		keysend(textuser, excelRead(1, 0));
		
		WebElement textpas = l.getTextpas();
		keysend(textpas, excelRead(1, 2));
		
		WebElement textlogin = l.getTextlogin();
		Toclick(textlogin);
		
	}
	
	

}
