package org.demo;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Baseclass{
	
	public static void main(String[] args)  {
		
		launchBrowser();
		getUrl("https://www.facebook.com/");
		Browsermaxi();
		javaobjectcreation();
		
		WebElement username = driver.findElement(By.id("email"));
		javasendkey("arguments[0].setAttribute('value','vignesh')", username);
		
		javasendkey("Return arguments[0].getAttribute('value')", username);
		
		
		WebElement pass = driver.findElement(By.id("pass"));
		javasendkey("arguments[0].setAttribute('value','2345678989')", pass);
		
	
		

		
	
		
		
	}
	
	

}
