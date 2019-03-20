package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateUserPOM {
		private WebDriver driver; 

		public UpdateUserPOM(WebDriver driver) {
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

		@FindBy(xpath="//a[contains(text(),'User list')]")
		private WebElement UserList;

		@FindBy(xpath="//input[@id='search_simple_keyword']")
		private WebElement SearchUser;

		@FindBy(xpath="//button[@id='search_simple_submit']")
		private WebElement SearchBtn;

		@FindBy(xpath="//input[@value='563']")
		private WebElement SelectUserMuthu;

		@FindBy(xpath="//img[@title='Edit']")
		private WebElement EditUserMuthu;

		@FindBy(xpath="//input[@id='user_edit_email']")
		private WebElement UpdateEmail;
		
		@FindBy(xpath="//button[@id='user_edit_submit']")
		private WebElement SaveBtn;
		

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

		public void clickUserList() {
			this.UserList.click();
		}
		
		public void enterSearchUser(String SearchUser) {
			this.SearchUser.clear();
			this.SearchUser.sendKeys(SearchUser);
		}

		public void clickSearchBtn() {
			this.SearchBtn.click();
		}
		
		public void clickSelectUserMuthu() {
		this.SelectUserMuthu.click();

		}

		public void clickEditUserMuthu() {
		this.EditUserMuthu.click();
		
		}

		public void enterUpdateEmail(String UpdateEmail) {
			this.UpdateEmail.clear();
			this.UpdateEmail.sendKeys(UpdateEmail);
		}
		
		public void clickSaveBtn() {
			this.SaveBtn.click();
}

}

