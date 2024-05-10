package org.demo;

import java.time.Duration;

import org.base.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Makemytrip extends Baseclass{
	
	@BeforeClass
	public static void Beforstart() {
		launchBrowser();
		getUrl("https://www.makemytrip.com/");
		Browsermaxi();
		

	}
	@Test
	public void str() throws InterruptedException {
		
		WebElement locat = driver.findElement(By.xpath("//input[@id='fromCity']"));
		keysend(locat, "Madurai");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.xpath("(//div[@class='makeFlex'])[1]"));
		toclose(button);

	}
	

}
