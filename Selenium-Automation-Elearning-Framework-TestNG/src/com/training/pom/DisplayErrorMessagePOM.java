package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DisplayErrorMessagePOM {
	private WebDriver driver; 

	public DisplayErrorMessagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login")
	private WebElement userName; 

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	@FindBy(id="password")
	private WebElement password;

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	//button[@id='form-login_submitAuth']
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	@FindBy(xpath="//a[@title='Administration']")
	private WebElement AdminTab;

	public void clickAdminTab() {
		this.AdminTab.click();
	}

	//a[contains(text(),'Add a user')] >>> click Add users lnk
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement AddUserLnk;

	public void clickAddUserLnk() {
		this.AddUserLnk.click();
	}

//input[@id='firstname'] >>> eneter "First name"
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement FirstName;

	public void enterFirstName(String firstName) {
	this.FirstName.clear(); 
	this.FirstName.sendKeys(firstName); 
}

//input[@id='lastname'] >>>eneter " Last name"
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement LastName;

	public void enterLastName(String LastName) {
	this.LastName.clear(); 
	this.LastName.sendKeys(LastName);
	}

//input[@id='email'] >>> enter "email id"
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailId;

	public void enterEmailId(String EmailId) {
	this.EmailId.clear(); 
	this.EmailId.sendKeys(EmailId);
	}

	//input[@id='phone'] >>> enter phone number
	@FindBy(xpath="//input[@id='phone']")
	private WebElement PhoneNo;

	public void enterPhoneNo(String PhoneNo) {
	this.PhoneNo.clear(); 
	this.PhoneNo.sendKeys(PhoneNo);
	}

	//input[@id='username'] >>> provide username
	@FindBy(xpath="//input[@id='username']")
	private WebElement ProvideUserName;

	public void enterProvideUserName(String ProvideUserName) {
	this.ProvideUserName.clear(); 
	this.ProvideUserName.sendKeys(ProvideUserName);
	}

	//input[@id='qf_c6a9f8'] >>> click password radio button
	//label[contains(text(),'Enter password')]
	@FindBy(xpath="//label[contains(text(),'Enter password')]")
	private WebElement PwdRadioBtn;

	public void clickPwdRadioBtn() {
		this.PwdRadioBtn.click();
	}

	//input[@id='password'] >>>Provide password
	@FindBy(xpath="//input[@id='password']")
	private WebElement ProvidePassword;

	public void enterProvidePassword(String ProvidePassword) {
	this.ProvidePassword.clear(); 
	this.ProvidePassword.sendKeys(ProvidePassword);
	}
	
//span[@class='filter-option pull-left'][contains(text(),'Learner')] >>> select profile
	//button[@title='Learner']
	@FindBy(xpath="//button[@title='Learner']")
	private WebElement ProfileField;

	public void clickProfileField(String profile) {
		this.ProfileField.click();
		//Select field = new Select(this.ProfileField);
		this.ProfileField.sendKeys(profile);
		//field.selectByVisibleText(profile);
		}

	//button[@name='submit'] >>> click AddSUbmit button
	@FindBy(xpath="//button[@name='submit']")
	private WebElement AddSubmit;

	public void clickAddSubmit() {
		this.AddSubmit.click();
	}
	
	}
