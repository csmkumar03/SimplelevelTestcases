package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherAuthorTestPOM {
	private WebDriver driver; 
	
	public TeacherAuthorTestPOM(WebDriver driver) {
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
	
	
 @FindBy(xpath="//a[@title='Administration']")
	private WebElement AdminTab;
	
	public void clickAdminTab() {
		this.AdminTab.click();
}

	//a[contains(text(),'Course list')]
	@FindBy(xpath="//a[contains(text(),'Course list')]")
	private WebElement CourseLnk;
	
	public void clickCourseLnk() {
		this.CourseLnk.click();
}
	
	
	//a[contains(text(),'test5')]
	@FindBy(xpath="//a[contains(text(),'test5')]")
	private WebElement TestLnk;
	
	public void clickTestLnk() {
		this.TestLnk.click();
}
	
	//img[@id='toolimage_1182']
	@FindBy(xpath="//img[@id='toolimage_1182']")
	private WebElement TestIcon;
	
	public void clickTestIcon() {
		this.TestIcon.click();
}
	
	//img[@title='Create a new test']
	@FindBy(xpath="//img[@title='Create a new test']")
	private WebElement NewTest;
	
	public void clickNewTest() {
		this.NewTest.click();
}
	//input[@id='exercise_title']
	@FindBy(xpath="//input[@id='exercise_title']")
	private WebElement TestName;
	
	public void enterTestName(String TestName) {
		this.TestName.clear(); 
		this.TestName.sendKeys(TestName); 
	}
	
	//button[@id='advanced_params']
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement AdvanceTab;
	
	public void clickAdvanceTab() {
		this.AdvanceTab.click();
}
	
	//iframe[@title='Rich Text Editor, exerciseDescription']
	//div[@id='cke_1_contents']
	/*@FindBy(xpath="//div[@id='cke_1_contents']")
	private WebElement ContextTest;
	
	public void enterContextTest(String ContextTest) {
		this.ContextTest.clear(); 
		this.ContextTest.sendKeys(ContextTest); 
	}
	
	*/
	//input[@id='qf_3b7743']
	//label[contains(text(),'Enable end time')]
	//label[contains(text(),'Enable start time')]
	@FindBy(xpath="//label[contains(text(),'Enable start time')]")
	private WebElement StartTime;
	
	public void enableStartTime() {
		this.StartTime.click();
}
	
	//input[@id='pass_percentage']
	@FindBy(xpath="//input[@id='pass_percentage']")
	private WebElement Percentage;
	
	public void enterPercentage(String string) {
		//Thread.sleep(2000);
		//this.Percentage.clear();
		this.Percentage.sendKeys(string); 
	}
	
	@FindBy(xpath="//button[@id='exercise_admin_submitExercise']")
	private WebElement ProceedBtn;
	
	public void clickProceedBtn() {
		//this.ProceedBtn.sendKeys(Keys.ENTER);
		this.ProceedBtn.click();
		this.ProceedBtn.sendKeys(Keys.ENTER);
}
	
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement MultipleChoiceIcon;
	
	public void clickMultipleChoiceIcon() throws InterruptedException {
		Thread.sleep(5000);
		this.MultipleChoiceIcon.submit();
}
	
	//input[@id='question_admin_form_questionName'] >>> enter Question(which course learning?)
	@FindBy(xpath="//input[@id='question_admin_form_questionName']")
	private WebElement QuestionName;
	
	public void enterQuestionName(String string) {
		this.QuestionName.clear();
		this.QuestionName.sendKeys(string); 
	}
	//Selenium
	//iframe[@title='Rich Text Editor, answer[1]']
	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement OptionOne;
	
	public void enterOptionOne(String string) {
		//this.OptionOne.clear();
		this.OptionOne.sendKeys(string); 
	}
	
	//Java
	//iframe[@title='Rich Text Editor, answer[2]']
	
	//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p
	
	//iframe[@title='Rich Text Editor, answer[3]']
	//C
	//iframe[@title='Rich Text Editor, answer[4]']
	//C#
	
	
		
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

	//a[contains(text(),'Course catalog')]
			@FindBy(xpath="//a[contains(text(),'Course catalog')]")
			private WebElement CourseCatelog;
			
			public void clickCourseCatelog() {
				this.CourseCatelog.click();
		}
			
			//a[@title='My courses']
			//div[@id='collapse_14']//img[@class='img-responsive']
			@FindBy(xpath="//div[@id='collapse_14']//img[@class='img-responsive']")
			private WebElement Course;
			
			public void clickCourse() {
				this.Course.click();
		}
			
			
			@FindBy(xpath="//img[@id='toolimage_6']")
			private WebElement TestFolderIcon;
			
			public void clickTestFolderIcon() {
				this.TestFolderIcon.click();
		}
			
			//a[contains(text(),'online test1')]
			@FindBy(xpath="//a[contains(text(),'online test1')]")
			private WebElement OnlineTest1;
			
			public void clickOnlineTest1() {
				this.OnlineTest1.click();
		}
			
			//a[@class='btn btn-success btn-large']
			@FindBy(xpath="//a[@class='btn btn-success btn-large']")
			private WebElement StartTest;
			
			public void clickStartTest() {
				this.StartTest.click();
		}
			
			//input[@id='choice-25-1']
			@FindBy(xpath="//input[@id='choice-25-1']")
			private WebElement SeleniumOption;
			
			public void selectSeleniumOption() {
				this.SeleniumOption.click();
		}
			
			//button[@name='save_now']
			@FindBy(xpath="//button[@name='save_now']")
			private WebElement EndTest;
			
			public void clickEndTest() {
				this.EndTest.click();
		}
			
			@FindBy(xpath="//a[@title='Reporting']")
			private WebElement Reporting;
			
			public void clickReporting() {
				this.Reporting.click();
		}
			
			//input[@id='search_user_keyword']
			@FindBy(xpath="//input[@id='search_user_keyword']")
			private WebElement StudentName;
			
			public void searchStudentName(String string) {
				//this.OptionOne.clear();
				this.StudentName.sendKeys(string); 
			}
			
			//a[contains(text(),'Muthu')]
			@FindBy(xpath="//a[contains(text(),'Muthu')]")
			private WebElement ParticularUser;
			
			public void selectParticularUser() {
				this.ParticularUser.click();
				//this.ParticularUser.sendKeys(Keys.ENTER);
		}
			
			
			@FindBy(xpath="//button[@id='search_user_submit']")
			private WebElement Search;
			
			public void clickSearch() {
				this.Search.click();
		}
			
			//div[5]//table[1]//tbody[1]//tr[1]//td[1]//a[1] >>> CourseIcon
			@FindBy(xpath="//div[5]//table[1]//tbody[1]//tr[1]//td[1]//a[1] >>> CourseIcon")
			private WebElement CourseIcon;
			
			public void selectCourseIcon() {
				this.CourseIcon.click();
		}
			
			//TestFolder
			@FindBy(xpath="//img[@id='toolimage_6']")
			private WebElement Testicon;
			
			public void clickTesticon() {
				this.Testicon.click();
		}
			
			//QuizIcon
			@FindBy(xpath="//a[@id='tooltip_2']")
			private WebElement QuizIcon;
			
			public void clickQuizIcon() {
				this.QuizIcon.click();
		}
			
			//click showBtn to display CorrectOption
			@FindBy(xpath="//tr[2]//td[5]//a[1] >>> click showBtn to display CorrectOption")
			private WebElement ShowBtn;
			
			public void clickShowBtn() {
				this.ShowBtn.click();
		}
			
			

}

