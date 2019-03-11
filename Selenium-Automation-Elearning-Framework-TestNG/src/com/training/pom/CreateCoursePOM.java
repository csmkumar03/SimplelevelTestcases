package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCoursePOM {
	private WebDriver driver; 
	
	public CreateCoursePOM(WebDriver driver) {
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
	
	//@FindBy(xpath="//a[contains(text(),'Course list')]")
	//private WebElement CourseList;
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement CreateACourse;
		
	@FindBy(xpath="//input[@id='update_course_title']")
	private WebElement Title;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement Submit;
	
	
	//@FindBy(xpath="//a[@href='http://elearning.upskills.in/main/admin/course_list.php?delete_course=0001']//img[@title='Delete']")
	//private WebElement DeleteCourse;
	
	
	
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
	
	public void clickCreateACourse() {
		this.CreateACourse.click();
	
		}

	public void enterTitle(String Title) {
		this.Title.clear();
		this.Title.sendKeys(Title);
	}
	
	public void clickSubmit() {
		this.Submit.click();
	
		}

	
	//public void clickDeleteCourse() {
		//this.DeleteCourse.click();
	
		}

