package org.sample;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;

public class Insta extends Baseclass{
	
	public static void main(String[] args) {
		launchBrowser();
		getUrl("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fonetap%2F%3F__coig_login%3D1");
		Browsermaxi();
		
		Instagramepojo p=new Instagramepojo();
		
		keysend(p.getUsername(), "vignesh");
		keysend(p.getPass(), "125676543");
		WebElement button = p.getButton();
		Toclick(button);
		
	
		
		
	}

}
