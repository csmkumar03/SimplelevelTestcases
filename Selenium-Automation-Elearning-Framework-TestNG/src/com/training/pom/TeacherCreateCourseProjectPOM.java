package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherCreateCourseProjectPOM {
	private WebDriver driver; 
	
	public TeacherCreateCourseProjectPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[2]/li[2]")
	private WebElement LogoutDropdwn;
	
	public void clickLogoutDropdwn() {
		this.LogoutDropdwn.click();
}
	//a[@id='logout_button']
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement LogOut;
	
	public void clickLogOut() {
		this.LogOut.click();
}

	
	
	//a[contains(text(),'Create a course')]
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement CreateACourse; 
	
	public void clickCreateACourse() {
		this.CreateACourse.click(); 
	}
	
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement TitleName; 

	public void typeTitleName(String TitleName) {
		this.TitleName.clear();
		this.TitleName.sendKeys(TitleName);
	}

	//button[@id='advanced_params']
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement AdvanceTab; 
	
	public void clickAdvanceTab() {
		this.AdvanceTab.click(); 
	}

	//*[@id="advanced_params_options"]/div[1]/div[1]/div
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div")
	private WebElement CategoryDropDwn; 
	
	public void clickCategoryDropDwn() {
		this.CategoryDropDwn.click(); 
	}

	//*[@id="advanced_params_options"]/div[1]/div[1]/div/div/div/input
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/div/input")
	private WebElement Project; 

	public void typeProject(String Project) {
		this.Project.clear();
		this.Project.sendKeys(Project);
		this.Project.sendKeys(Keys.ENTER);
	}

	//input[@id='add_course_wanted_code']
	@FindBy(xpath="//input[@id='add_course_wanted_code']")
	private WebElement CourseCode; 

	public void typeCourseCode(String CourseCode) {
		this.CourseCode.clear();
		this.CourseCode.sendKeys(CourseCode);
		this.CourseCode.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement SubmitCourseBtn; 
	
	public void clickSubmitCourseBtn() {
		this.SubmitCourseBtn.click(); 
	}
	
	//*[@id="course_tools"]/div[1]/div/div[1]/a
	//div[@class='btn-group pull-right']//a[@title='Add an introduction text']
	//*[@id="course_tools"]/div[1]/div/div[2]/div/a[1]
	
	@FindBy(xpath="//*[@id=\"course_tools\"]/div[1]/div/div[1]/a")
	private WebElement AddIntroBtn;
	
	public void clickAddIntroBtn() {
		this.AddIntroBtn.click(); 
		this.AddIntroBtn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, intro_content']")
	private WebElement IntroContent; 

	public void typeIntroContent(String IntroContent) {
		this.IntroContent.clear();
		this.IntroContent.sendKeys(IntroContent);
		//this.IntroContent.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath="//img[@id='toolimage_1711']")
	private WebElement CourseDecrip;
	
	public void clickCourseDecrip() {
		this.CourseDecrip.click(); 
	}
	
	@FindBy(xpath="//img[@title='Description']")
	private WebElement DescriptionIcon;
	
	public void clickDescriptionIcon() {
		this.DescriptionIcon.click(); 
	}
	
	//input[@id='course_description_title']
	@FindBy(xpath="//input[@id='course_description_title']")
	private WebElement DescripTitle; 

	public void typeDescripTitle(String DescripTitle) {
		this.DescripTitle.clear();
		this.DescripTitle.sendKeys(DescripTitle);
		//this.IntroContent.sendKeys(Keys.ENTER);
	}

	//html
	@FindBy(xpath="//html")
	private WebElement Content; 

	public void typeContent(String Content) {
		this.Content.clear();
		this.Content.sendKeys(Content);
				
	}
	
	@FindBy(xpath="//img[@id='toolimage_1731']")
	private WebElement ProjectIcon;
	
	public void clickProjectIcon() {
		
		this.ProjectIcon.click(); 
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement CourseCatelog;
	
	public void clickCourseCatelog() {
		this.CourseCatelog.click(); 
	}

	//a[contains(text(),'GK1')]
	@FindBy(xpath="//a[contains(text(),'GK2')]")
	private WebElement CourseGK;
	
	public void clickCourseGK() {
		this.CourseGK.click(); 
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-lg btn-success btn-block']")
	private WebElement SubscribeGK;
	
	public void clickSubscribeGK() {
		this.SubscribeGK.click(); 
	}
	
	//a[@title='Reporting']
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement TeacherReport;
	
	public void clickTeacherReport() {
		this.TeacherReport.click(); 
	}
	
	//input[@id='search_user_keyword']
	@FindBy(xpath="//input[@id='search_user_keyword']")
	private WebElement SearchUser; 

	public void typeSearchUser(String SearchUser) {
		this.SearchUser.clear();
		this.SearchUser.sendKeys(SearchUser);
		}
	
	//button[@id='search_user_submit']
	@FindBy(xpath="//button[@id='search_user_submit']")
	private WebElement SubmitBtn;
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click(); 
	}
	
	//a[contains(text(),'Muthu')]
	@FindBy(xpath="//a[contains(text(),'Muthu')]")
	private WebElement SelectStudent;
	
	public void clickSelectStudent() {
		this.SelectStudent.click(); 
	}
	}
			
			



