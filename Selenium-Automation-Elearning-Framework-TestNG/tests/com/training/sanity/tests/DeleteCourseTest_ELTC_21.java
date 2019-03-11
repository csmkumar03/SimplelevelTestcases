package com.training.sanity.tests;

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
import com.training.pom.DeleteCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DeleteCourseTest_ELTC_21 {

	private WebDriver driver;
	private String baseUrl;
	private DeleteCoursePOM DeleteCoursePOM;
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
		DeleteCoursePOM = new DeleteCoursePOM(driver); 
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
	public void CourseDeletionTest() {
		DeleteCoursePOM.sendUserName("admin");
		DeleteCoursePOM.sendPassword("admin@1234");
		DeleteCoursePOM.clickLoginBtn(); 
		DeleteCoursePOM.clickAdminTab();
		DeleteCoursePOM.clickCourseList();
		DeleteCoursePOM.clickSelectCourse();
		screenShot.captureScreenShot("First1_deletecourse");
		DeleteCoursePOM.clickDeleteCourse();
		//driver.switchTo().alert().accept();
	
		System.out.println("Course got deleted");
				
	}
				
}

