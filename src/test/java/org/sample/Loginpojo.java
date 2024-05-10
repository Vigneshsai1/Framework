package org.sample;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends Baseclass {
	
	public Loginpojo() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="username")
	private WebElement textuser;
	
	@FindBy(id="password")
	private WebElement textpas;
	
	@FindBy(id="login")
	private WebElement textlogin;

	public WebElement getTextuser() {
		return textuser;
	}

	public WebElement getTextpas() {
		return textpas;
	}

	public WebElement getTextlogin() {
		return textlogin;
	}
	
	
	

}
