package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreateCoursePOM;
import com.training.pom.DeleteCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UpdateUserTest_ELTC_51 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.UpdateUserPOM UpdateUserPOM;
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
		UpdateUserPOM = new com.training.pom.UpdateUserPOM(driver); 
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
	
	@Test
	public void UpdateUserTest() {
		UpdateUserPOM.sendUserName("admin");
		UpdateUserPOM.sendPassword("admin@1234");
		UpdateUserPOM.clickLoginBtn(); 
		UpdateUserPOM.clickAdminTab();
		UpdateUserPOM.clickUserList();
		UpdateUserPOM.enterSearchUser("Muthu");
		UpdateUserPOM.clickSearchBtn();
		UpdateUserPOM.clickSelectUserMuthu();
		UpdateUserPOM.clickEditUserMuthu();
		UpdateUserPOM.enterUpdateEmail("abhishek007@gmail.com");
		screenShot.captureScreenShot("Update user email id");
		UpdateUserPOM.clickSaveBtn();
		System.out.println(" email id got updated");
				
	}
	
	
}

