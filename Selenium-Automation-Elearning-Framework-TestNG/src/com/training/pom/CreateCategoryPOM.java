package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCategoryPOM {
	private WebDriver driver; 

	public CreateCategoryPOM(WebDriver driver) {
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

	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement CourseCategory;

	@FindBy(xpath="//img[@title='Add category']")
	private WebElement CreateCategory;

	@FindBy(xpath="//input[@id='course_category_code']")
	private WebElement CategoryCode;

	@FindBy(xpath="//input[@id='course_category_name']")
	private WebElement CategoryName;

	@FindBy(xpath="//button[@id='course_category_submit']")
	private WebElement SubmitCategory;


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


	public void clickCourseCategory() {
		this.CourseCategory.click();

	}

	public void clickCreateCategory() {
		this.CreateCategory.click();
	}

	public void enterCategoryCode(String CategoryCode) {
		this.CategoryCode.clear();
		this.CategoryCode.sendKeys(CategoryCode);
	}

	public void enterCategoryName(String CategoryName) {
		this.CategoryName.clear();
		this.CategoryName.sendKeys(CategoryName);
	}

	public void clickSubmitCategory() {
		this.SubmitCategory.click();

	}


}

