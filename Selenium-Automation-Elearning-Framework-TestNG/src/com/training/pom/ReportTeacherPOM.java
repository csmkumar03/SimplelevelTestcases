package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportTeacherPOM {
	private WebDriver driver; 

	public ReportTeacherPOM(WebDriver driver) {
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
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
			
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement ReportingLnk; 
	
	public void clickReportingLnk() {
		this.ReportingLnk.click(); 
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement FollwedTeacher; 
	
	public void clickFollwedTeacher() {
		this.FollwedTeacher.click(); 
	}
	
	
	@FindBy(xpath="//input[@id='search_user_keyword']")
	private WebElement SearchTeacher;  //Search with Trainer name "Site Owner" //created Traner1 or other names are not listing except "Site trainer"
	
	public void enterSearchTeacher(String TeacherName) {
		this.SearchTeacher.clear();
		this.SearchTeacher.sendKeys(TeacherName);
		this.SearchTeacher.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//button[@id='search_user_submit']")
	private WebElement SearchBtn;  //Search with user Muthu
	
	public void clickSearchBtn() {
		this.SearchBtn.click(); 
		
		}
	
	
	@FindBy(xpath="//a[contains(text(),'Site')]")
	private WebElement TrainerLnk;  //Search with user Muthu
	
	public void clickTrainerLnk() {
		this.TrainerLnk.click(); 
		
		}

	
	@FindBy(xpath="//a[@href='http://elearning.upskills.in/courses/TR56/index.php?id_session=6']")
	private WebElement CourseIconLnk;  
	
	public void clickCourseIconLnk() {
		this.CourseIconLnk.click(); 
		
		}

	
/*		
	@FindBy(xpath="//a[contains(text(),'Muthu')]")
	private WebElement StudentIcon;  //Click with user Muthu
	
	public void clickStudentIcon() {
		this.StudentIcon.click(); 
	}
	
	
	@FindBy(xpath="//a[@href='http://elearning.upskills.in/courses/TR56/index.php?id_session=9']")
	private WebElement CourseIcon;  //Click with CourseIcon "WebDriver"
	
	public void clickCourseIcon() {
		this.CourseIcon.click(); 
	}


	@FindBy(xpath="//img[@id='toolimage_6']")
	private WebElement TestSection;  //Click with CourseIcon "WebDriver"
	
	public void clickTestSection() {
		this.TestSection.click(); 
	}
	
	
	@FindBy(xpath="//a[@id='tooltip_2']")
	private WebElement SelectTest;  //Click with CourseIcon "WebDriver"
	
	public void clickSelectTest() {
		this.SelectTest.click(); 
	}
*/

		
}