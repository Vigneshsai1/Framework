package org.junit;

import java.util.Date;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.sample.Facebookpojo;

public class Facebookjunit extends Baseclass {
	
	@BeforeClass
	
	public static void befortime() {
		
		launchBrowser();
		Browsermaxi();
		 getUrl("https://www.facebook.com/");
	
	}
	@AfterClass
	public static void aftertime() {
		//driver.quit();

	}
	@Before
	public void beforstart() {
		
		 Date d=new Date();
		 System.out.println(d);

	}
	@After
	public void afterstarts() {
		
		Date d=new Date();
		System.out.println(d);
		
	}
	@Test
	public  void tc1() {
		Facebookpojo f=new Facebookpojo();
		
		keysend(f.getUsername(), "vignesh");
		keysend(f.getPassword(), "234567890");
		WebElement buttun = f.getButtun();
		Toclick(buttun); 

	}
	@Test
	public void tc2() {
		Facebookpojo f=new Facebookpojo();
		
		keysend(f.getUsername(), "java");
		keysend(f.getPassword(), "365768787");
		WebElement buttun = f.getButtun();
		Toclick(buttun);
	}
	@Test
	public void tc3() {
		
		Facebookpojo f=new Facebookpojo();
		
		keysend(f.getUsername(), "python");
		keysend(f.getPassword(), "77879809");
		WebElement buttun = f.getButtun();
		Toclick(buttun);
	

	}
	@Test
	public void tc4() {
		Facebookpojo f=new Facebookpojo();
		
		keysend(f.getUsername(), "Gowes");
		keysend(f.getPassword(), "rtyui7899");
		WebElement buttun = f.getButtun();
		Toclick(buttun);

	}
	
	
	
	
	
	
		
	

}
