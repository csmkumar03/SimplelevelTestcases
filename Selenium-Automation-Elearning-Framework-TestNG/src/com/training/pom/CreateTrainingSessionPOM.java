package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateTrainingSessionPOM {
	private WebDriver driver; 

	public CreateTrainingSessionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login")
	private WebElement userName; 

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="form-login_submitAuth")
	//button[@id='form-login_submitAuth']
	private WebElement loginBtn; 

	@FindBy(xpath="//a[@title='Administration']")
	private WebElement AdminTab;

	@FindBy(xpath="//a[contains(text(),'User list')]")
	private WebElement UserList;

	@FindBy(xpath="//a[contains(text(),'Sessions categories list')]")
	private WebElement SessionsCategories;

	@FindBy(xpath="//img[@title='Add category']")
	private WebElement AddCategory;

	@FindBy(xpath="//input[@placeholder='Category']")
	private WebElement CategoryName;

	@FindBy(xpath="//button[@value='Add category']")
	private WebElement AddBtn;

	@FindBy(xpath="//img[@title='Training sessions list']")
	private WebElement TrainingSessionsList;

	@FindBy(xpath="//img[@title='Add a training session']")
	private WebElement AddTrainingSession;

	@FindBy(xpath="//input[@id='add_session_name']")
	private WebElement SessionName;
	
	

	// These three xpaths may be used if needed
	/*@FindBy(xpath="//span[@class='select2-selection__placeholder']")
	private WebElement DropDwn;
	
	@FindBy(xpath="//input[@type='search']") //Enter CoachName
	private WebElement CoachName;
		
	//@FindBy(xpath="//span[@id='select2-add_session_coach_username-container']")
	//private WebElement SelectCoach;
	
	*/
	
	////span[@id='select2-add_session_coach_username-container']
	////b[@role='presentation']
	////span[@class='select2-selection__arrow']
	////input[@type='search']
	
		
	@FindBy(xpath="//button[@id='advanced_params']") //Click Advance
	private WebElement AdvanceTab;
		
//Session categories dropdown
	
	@FindBy(xpath="//button[@title='none']") //Click Advance
	private WebElement DropDown;
	
	//search with Session name
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[2]/div[1]/div/div/div/input") //Click Advance
	private WebElement GiveSessionName;
	             
	@FindBy(xpath="//button[@id='add_session_submit']") //Click Advance
	private WebElement NextStep;
	
	
	@FindBy(xpath="//option[contains(text(),'Selenium WebDriver (TR56)')]") //Select Course name
	private WebElement SelectedCourse;
	
	@FindBy(xpath="//button[@name='add_course']") //click >>> button
	private WebElement ArrowBtn;
	
	@FindBy(xpath="//button[@name='next']") //click NEXT button
	private WebElement NextBtn;
	
	@FindBy(xpath="//input[@id='user_to_add']") //Enter StudentName
	private WebElement StudentName;
	
	@FindBy(xpath="//a[contains(text(),'Kumar Muthu (csmkumar03)')]") //Enter StudentName
	private WebElement StudentLink;
	
	@FindBy(xpath="//button[@name='next']") //Click FinishButton
	private WebElement FinishBtn;
	
	
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

	public void clickSessionsCategories() {
		this.SessionsCategories.click();
	}

	public void clickAddCategory() {
		this.AddCategory.click();
	}

	public void enterCategoryName(String CategoryName) {
		this.CategoryName.clear();
		this.CategoryName.sendKeys(CategoryName); //enter category name
	}

	public void clickAddBtn() {
		this.AddBtn.click();
	}

	public void clickTrainingSessionsList() {
		this.TrainingSessionsList.click();

	}

	public void clickAddTrainingSession() {
		this.AddTrainingSession.click();

	}

	public void typeSessionName(String SessionName) {
		this.SessionName.clear();
		this.SessionName.sendKeys(SessionName); //give Selenium Training Session1
	}

	
	public void clickAdvanceTab() {
		this.AdvanceTab.click();
	}
	
	public void clickDropDown() {
	this.DropDown.click();
}
	public void searchSessionName(String GiveSessionName) {
		//this.GiveSessionName.clear();
		this.GiveSessionName.sendKeys(GiveSessionName); //Search with "Testcategory1"
		this.GiveSessionName.sendKeys(Keys.ENTER);
	}
	
	
	public void clickNextStep() {
		this.NextStep.click();
	}
	
	public void clickSelectedCourse() {
		this.SelectedCourse.click();
	}
	
	public void clickArrowBtn() {
		this.ArrowBtn.click();
	}
	
	public void clickNextBtn() {
		this.NextBtn.click();

		}
	public void enterStudentname(String StudentName) {
		this.StudentName.clear();
		this.StudentName.sendKeys(StudentName); //Enter Student name:::Muthu
}
	public void clickStudentlink() {
		this.StudentLink.click();
		}
	
	public void enterFinishBtn() {
		this.FinishBtn.click();
		}

	}
	/*public void enterCoachName(String CoachName) {
		this.CoachName.clear();
		this.CoachName.sendKeys(CoachName); // Enter CoachName...manzoor
		
		//Select dropdown = new Select(driver.findElement(By.xpath("//input[@type='search']")));
        //dropdown.selectByVisibleText("manzoor mehadi");
        //this.CoachName.click();
	}
	*/
		/*//this.CoachName.sendKeys(Keys.ENTER);
		//this.CoachName.submit();
		
		//WebElement menu = driver.findElement(By.xpath(“//*[@id=’b2ctour_block’]/ul/li[4]/a”));
		//WebElement SUBMenu = driver.findElement(By.xpath(“//*[@id=’b2ctour_block’]/ul/li[4]/a”));

				Actions action = new Actions(driver);
				action.moveToElement(CoachName).perform();
				//action.click(SUBMenu).perform();
	}
	
	//public void enterKey(Keys) {
	//this.ENTER.sendKeys(Keys.ENTER)
	//} */
	
	/*public void DrpDwnSelectCoach(WebElement SelectCoach) {
		//this.SelectCoach.sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		action.moveToElement(SelectCoach).perform();
		action.click(SelectCoach).perform();
	} */

		
	
	
	

