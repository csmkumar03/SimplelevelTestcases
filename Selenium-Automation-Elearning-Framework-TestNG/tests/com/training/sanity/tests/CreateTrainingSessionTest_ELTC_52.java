package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreateCoursePOM;
import com.training.pom.CreateTrainingSessionPOM;
import com.training.pom.DeleteCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateTrainingSessionTest_ELTC_52 {

	private static final WebElement WebElement = null;
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.CreateTrainingSessionPOM CreateTrainingSessionPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	//private drpCoach drpCoach;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		CreateTrainingSessionPOM = new com.training.pom.CreateTrainingSessionPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

	@Test
	public void CreateTrainingSessionTest() throws InterruptedException {
		CreateTrainingSessionPOM.sendUserName("admin");
		CreateTrainingSessionPOM.sendPassword("admin@123");
		CreateTrainingSessionPOM.clickLoginBtn(); 
		CreateTrainingSessionPOM.clickAdminTab();
		screenShot.captureScreenShot("SS_TraningSession");
		CreateTrainingSessionPOM.clickSessionsCategories();
		CreateTrainingSessionPOM.clickAddCategory();
		CreateTrainingSessionPOM.enterCategoryName("Testing Category2"); // Enter CategoryName
		CreateTrainingSessionPOM.clickAddBtn();
		CreateTrainingSessionPOM.clickTrainingSessionsList();
		CreateTrainingSessionPOM.clickAddTrainingSession();
		CreateTrainingSessionPOM.typeSessionName("Selenium Training Session14");
		//CreateTrainingSessionPOM.clickDropDwn();
		//CreateTrainingSessionPOM.enterCoachName("manzoor"); //Enter CoachName
		//CreateTrainingSessionPOM.clickSelectCoach();
		//CreateTrainingSessionPOM.DrpDwnSelectCoach(WebElement);
		CreateTrainingSessionPOM.clickAdvanceTab();
		CreateTrainingSessionPOM.clickDropDown();
		CreateTrainingSessionPOM.searchSessionName("TestCategory1");
		Thread.sleep(2000);
		CreateTrainingSessionPOM.clickNextStep();
		CreateTrainingSessionPOM.clickSelectedCourse();
		CreateTrainingSessionPOM.clickArrowBtn();
		CreateTrainingSessionPOM.clickNextBtn();
		CreateTrainingSessionPOM.enterStudentname("Muthu");
		CreateTrainingSessionPOM.clickStudentlink();
		CreateTrainingSessionPOM.enterFinishBtn();
		screenShot.captureScreenShot("SS_TraningSession_final");
	}
}

		
		

	


