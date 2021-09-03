package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass2 extends BaseClass {
	public PojoClass2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastName;

	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phone;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPhone() {
		return phone;
	}

	@FindBy(xpath="//input[@value='Male']")
	private WebElement radioBtn1;
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement radioBtn2;

	public WebElement getRadioBtn1() {
		return radioBtn1;
	}
	
	public WebElement getRadioBtn2() {
		return radioBtn2;
	}

	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement checkBox1;
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement checkBox2;
	@FindBy(xpath="//input[@value='Hockey']")
	private WebElement checkBox3;

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	public WebElement getCheckBox2() {
		return checkBox2;
	}

	public WebElement getCheckBox3() {
		return checkBox3;
	}
	
	@FindBy(xpath="//select[@id='Skills']")
	private WebElement dropDown1;

	@FindBy(xpath="//select[@id='countries']")
	private WebElement dropDown2;

	public WebElement getDropDown1() {
		return dropDown1;
	}

	public WebElement getDropDown2() {
		return dropDown2;
	}

	@FindBy(xpath="//select[@id='country']")
	private WebElement dropDown3;

	public WebElement getDropDown3() {
		return dropDown3;
	}
	
	@FindBy(xpath="//select[@id='yearbox']")
	private WebElement dropDown4;

	public WebElement getDropDown4() {
		return dropDown4;
	}
	
	@FindBy(xpath="//select[@ng-model='monthbox']")
	private WebElement dropDown5;

	public WebElement getDropDown5() {
		return dropDown5;
	}
	
	@FindBy(xpath="//select[@id='daybox']")
	private WebElement dropDown6;

	public WebElement getDropDown6() {
		return dropDown6;
	}
	
	
	@FindBy(xpath="//input[@id='firstpassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	private WebElement confirmPassword;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement btnRefresh;

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getBtnRefresh() {
		return btnRefresh;
	}
	
	
}
