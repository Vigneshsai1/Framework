package org.demo;



import java.util.List;

import org.base.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Facebookpojo;


public class Amazion extends Baseclass {
	
	@BeforeClass
	public static void dbeforstart() {
		
		launchBrowser();
		Browsermaxi();
		getUrl("https://www.amazon.in/");
	}
	
	@Test
	public void stc1() {
		Facebookpojo f=new Facebookpojo();
		keysend(f.getUsername(),"i phone");
		WebElement buttun = f.getButtun();
		System.out.println(buttun); 
	}
	@Test
	public void stc2() {
		
		List<WebElement> first = driver.findElements(By.xpath("//div[@class='sg-col-inner']"));
		
		System.out.println("Total No of Iphones Shown In Result : " + first.size());
		
		for (WebElement w : first) {
			
			System.out.println(w.getText());
			
		}
			
		List<WebElement> second = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		System.out.println("Amount of iphon and count:"+second.size());
		
		for (WebElement web : second) {
			
			System.out.println(web.getText());
			
			
		}
			
		

	}
	
	
	
	
	
	
}
	
	
	
	
	
	


