package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsertoCoursePOM {
	private WebDriver driver; 

	public UsertoCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login")
	private WebElement userName; 

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 

	@FindBy(xpath="//a[@title='Administration']")
	private WebElement AdminTab;

	@FindBy(xpath="//a[contains(text(),'Add users to course')]")
	private WebElement UserToCourse;

	@FindBy(xpath="//option[@value='563']")
	private WebElement SelectUser;

	@FindBy(xpath="//option[@value='DATASTRUCTUREMUTHU']")
	private WebElement SelectCourse;

	@FindBy(xpath="//button[@value='Add to the course(s) >>']")
	private WebElement AddToCourse;


	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickAdminTab() {
		this.AdminTab.click();
	}

	public void clickUsertoCourse() {
		this.UserToCourse.click();

	}

	public void clickSelectUser() {
		this.SelectUser.click();

	}

	public void clickSelectCourse() {
		this.SelectCourse.click();
	}

	public void clickAddtoCourse() {
		this.AddToCourse.click();

	}

}





