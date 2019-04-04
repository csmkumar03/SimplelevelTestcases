package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.CreateCategoryPOM;
import com.training.pom.CreateCoursePOM;
import com.training.pom.DeleteCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UserProfiledb_ELTC_85 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.UsersDiffRolesPOM UsersDiffRolesPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		UsersDiffRolesPOM = new com.training.pom.UsersDiffRolesPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	
	@Test(priority=2, dataProvider = "muthu-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String firstName, String lastName,String email,String Phone,String uName,String pwd,String profile) {
		//loginPOM.sendUserName(userName);
		//loginPOM.sendPassword(password);
		//loginPOM.clickLoginBtn();
		//screenShot.captureScreenShot(userName);
		UsersDiffRolesPOM.sendUserName("admin");
		UsersDiffRolesPOM.sendPassword("admin@123");
		UsersDiffRolesPOM.clickLoginBtn(); 
		UsersDiffRolesPOM.clickAdminTab();
		UsersDiffRolesPOM.clickAddUserLnk();

		UsersDiffRolesPOM.enterFirstName(firstName); //provide declared string name for Username.Get data from XLS
		UsersDiffRolesPOM.enterLastName(lastName); //provide declared string name for password
		UsersDiffRolesPOM.enterEmailId(email); //provide declared string name 
		UsersDiffRolesPOM.enterPhoneNo(Phone);
		UsersDiffRolesPOM.enterProvideUserName(uName);
		UsersDiffRolesPOM.clickPwdRadioBtn();
		UsersDiffRolesPOM.enterProvidePassword(pwd);
		UsersDiffRolesPOM.clickProfileField(profile); // fetch profile from XLS
		screenShot.captureScreenShot("SS_UserProfileFromDB");
		UsersDiffRolesPOM.clickAddSubmit();
		
	}

			
	}
	
	
	
	


