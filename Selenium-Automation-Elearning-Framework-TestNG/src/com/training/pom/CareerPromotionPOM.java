package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CareerPromotionPOM {
	private WebDriver driver; 

	public CareerPromotionPOM(WebDriver driver) {
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
			
	
	
	//a[@title='Administration'] //click administn
	

	@FindBy(xpath="//a[@title='Administration']")
	private WebElement AdminTab; 

	public void clickAdminTab() {
		this.AdminTab.click(); 
	}
	
	
	//a[contains(text(),'Careers and promotions')] //careers and promotions
	@FindBy(xpath="//a[contains(text(),'Careers and promotions')]")
	private WebElement CareersPromoLnk; 

	public void clickCareersPromoLnk() {
		this.CareersPromoLnk.click(); 
	}
	
	//img[@title='Careers'] // carees icon
	@FindBy(xpath="//img[@title='Careers']")
	private WebElement CareersIcon; 

	public void clickCareersIcon() {
		this.CareersIcon.click(); 
	}

	
	//img[@title='Add'] //career's add icon
	@FindBy(xpath="//img[@title='Add']")
	private WebElement CareersAddIcon; 

	public void clickCareersAddIcon() {
		this.CareersAddIcon.click(); 
	}
	
	//input[@id='career_name'] // enter career name"QA2"
	@FindBy(xpath="//input[@id='career_name']")
	private WebElement CareerName;
	
	public void enterCareerName(String CareerName) {
		this.CareerName.clear(); 
		this.CareerName.sendKeys(CareerName);  // enter "QA12"
	}
	
	//button[@id='career_submit'] // addSubmit button
	@FindBy(xpath="//button[@id='career_submit']")
	private WebElement AddSubmitBtn; 

	public void clickAddSubmitBtn() {
		this.AddSubmitBtn.click(); 
	}
	
	//a[contains(text(),'Careers and promotions')] //careers and promotions link
	@FindBy(xpath="//a[contains(text(),'Careers and promotions')]")
	private WebElement CareersAndPromoLnk; 

	public void clickCareersAndPromoLnk() {
		this.CareersAndPromoLnk.click(); 
	}
	
	//img[@title='Promotions'] //click promotion icon
	@FindBy(xpath="//img[@title='Promotions']")
	private WebElement PromotionLnk; 

	public void clickPromotionLnk() {
		this.PromotionLnk.click(); 
	}
	
	//img[@title='Add'] // click add promotion icon
	@FindBy(xpath="//img[@title='Add']")
	private WebElement AddPromoIcon; 

	public void clickAddPromoIcon() {
		this.AddPromoIcon.click(); 
	}
	
	//img[@title='Add'] //enter credential "QA2 for tester"
	@FindBy(id="name")
	private WebElement Title; 

	public void enterTitle(String CareerName) {
		this.Title.clear(); 
		this.Title.sendKeys(CareerName);  //enter credential "QA2 for tester"
	}
	
	//button[@id='promotion_submit'] // click addpromotion submit
	@FindBy(xpath="//button[@id='promotion_submit']")
	private WebElement SubmitPromo; 

	public void clickSubmitPromo() {
		this.SubmitPromo.click(); 
	}
	
	//a[@href='add_sessions_to_promotion.php?id=1']//img[@title='Subscribe sessions to promotions'] >>> subscripbe session 
	@FindBy(xpath="//a[@href='add_sessions_to_promotion.php?id=1']//img[@title='Subscribe sessions to promotions']")
	private WebElement SubscribeLnk; 

	public void clickSubscribeLnk() {
		this.SubscribeLnk.click(); 
	}

	//option[@value='6'] >>> select session not subscribed
	@FindBy(xpath="//option[@value='6']")
	private WebElement SelectSession; 

	public void clickSelectSession() {
		this.SelectSession.click(); 
	}
	
	//*[@id="cm-content"]/div/form/table/tbody/tr[3]/td[2]/button[1] >>>click right arrow btn
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/form/table/tbody/tr[3]/td[2]/button[1]")
	private WebElement RightArrow; 

	public void clickRightArrow() {
		this.RightArrow.click(); 
	}

	
	//button[contains(text(),'Subscribe sessions to promotion')] >>> Finish subscribe session to promotion
	
	@FindBy(xpath="//button[contains(text(),'Subscribe sessions to promotion')]")
	private WebElement FinishBtn; 

	public void clickFinishBtn() {
		this.FinishBtn.click(); 
	}

	
	
	
	
	
	/*
	
	@FindBy(xpath="//input[@id='search_user_keyword']")
	private WebElement SearchTeacher;  //Search with Trainer name "Site Owner" //created Traner1 or other names are not listing except "Site trainer"
	
	public void enterSearchTeacher(String TeacherName) {
		this.SearchTeacher.clear();
		this.SearchTeacher.sendKeys(TeacherName);
		this.SearchTeacher.sendKeys(Keys.ENTER);
	}
	
	*/
		
}