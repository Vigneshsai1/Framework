package org.demo;

import org.base.Baseclass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.sample.Facebookpojo;

public class Assert1 extends Baseclass{
	
	@BeforeClass
	public static void beforstart() {
		launchBrowser();
		getUrl("https://www.facebook.com/");
		Browsermaxi();

	}
	@Test
	public void tc1() {
		
		Facebookpojo f=new Facebookpojo();
		
		String url = driver.getCurrentUrl();
		
		Assert.assertTrue("cheak the url", url.contains("facebook")); 
		
		keysend(f.getUsername(), "vignesh");
		
		keysend(f.getPassword(),"13435465767" );
		
		WebElement buttun = f.getButtun();
		Toclick(buttun); 
		
	

	}
	
	
	
	
	
	
	


}
