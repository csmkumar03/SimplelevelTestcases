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

public class CareerPromotionTest_ELTC_55 {

	private static final WebElement WebElement = null;
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.CareerPromotionPOM CareerPromotionPOM;
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
		CareerPromotionPOM = new com.training.pom.CareerPromotionPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void CreateTrainingSessionTest() throws InterruptedException {
		CareerPromotionPOM.sendUserName("admin");
		CareerPromotionPOM.sendPassword("admin@123");
		CareerPromotionPOM.clickLoginBtn(); 
		CareerPromotionPOM.clickAdminTab();
		CareerPromotionPOM.clickCareersPromoLnk();
		CareerPromotionPOM.clickCareersIcon();
		CareerPromotionPOM.clickCareersAddIcon();
		CareerPromotionPOM.enterCareerName("QA121"); //enter QA12
		CareerPromotionPOM.clickAddSubmitBtn();
		CareerPromotionPOM.clickCareersAndPromoLnk();
		CareerPromotionPOM.clickPromotionLnk();
		CareerPromotionPOM.clickAddPromoIcon();
		CareerPromotionPOM.enterTitle("QA121 for tester");
		screenShot.captureScreenShot("SS_CareersandPromotion");
		CareerPromotionPOM.clickSubmitPromo();
		CareerPromotionPOM.clickSubscribeLnk();
		CareerPromotionPOM.clickSelectSession();
		CareerPromotionPOM.clickRightArrow();
		screenShot.captureScreenShot("SS_Careers and Promotion");
		CareerPromotionPOM.clickFinishBtn();
	}
}

		
		

	


