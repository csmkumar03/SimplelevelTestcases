package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCategoryPOM {
	private WebDriver driver; 

	public DeleteCategoryPOM(WebDriver driver) {
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

	@FindBy(xpath="//a[contains(text(),'Computer Science category')]")
	private WebElement SelectCategory;
	
	@FindBy(xpath="//a[@href='http://elearning.upskills.in/main/admin/course_category.php?category=&id=CSE001&action=delete']//img[@title='Delete this category']")
	private WebElement DeleteCategory;
	
		
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

	public void clickSelectCategory() {
		this.SelectCategory.click();
	}

	public void clickDeleteCategory() {
		this.DeleteCategory.click();
	}

	
}

