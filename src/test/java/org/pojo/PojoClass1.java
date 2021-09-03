package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends BaseClass {

	public PojoClass1() {
		PageFactory.initElements(driver, this); 
	}
	
    //FaceBook WebElements
	@FindBys({
		 @FindBy(xpath="//input[@type='text']"),
		 @FindBy(xpath="//input[@name='email']"),
		 @FindBy(xpath="//input[@id='email']")
	})
	private WebElement txtUser;
	
	
	@FindAll({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@name='pass']"),
		@FindBy(id="hello")
	})
	private WebElement txtPass;
	
	@CacheLookup
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;

	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	//Amazon ---- WebElements
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTxt;

	public WebElement getSearchTxt() {
		return searchTxt;
	}
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement searchBtn;


	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	//Flipkart login ---- WebElements
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginBtn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
		
}
