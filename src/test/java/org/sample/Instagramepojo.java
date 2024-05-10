package org.sample;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Instagramepojo extends Baseclass {
	
	public Instagramepojo() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@  type='text']")
	
	private WebElement username;
	
	@FindBy(xpath = "//input[@  type='password']")
	private WebElement  pass;
	
	@FindBy(xpath = "//button[@  type='submit']")
	private WebElement button;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}


}
