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
import com.training.pom.CreateCoursePOM;
import com.training.pom.DeleteCoursePOM;
import com.training.pom.LoginPOM;
import com.training.pom.UsertoCoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UsertoCourse_ELTC_23 {

	private WebDriver driver;
	private String baseUrl;
	private UsertoCoursePOM UserToCoursePOM;
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
		UserToCoursePOM = new UsertoCoursePOM(driver); 
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
	public void validLoginTest() {
		UserToCoursePOM.sendUserName("admin");
		UserToCoursePOM.sendPassword("admin@1234");
		UserToCoursePOM.clickLoginBtn(); 
		UserToCoursePOM.clickAdminTab();
		UserToCoursePOM.clickUsertoCourse();
		UserToCoursePOM.clickSelectUser();
		UserToCoursePOM.clickSelectCourse();
		screenShot.captureScreenShot("Add course to User");
		UserToCoursePOM.clickAddtoCourse();
		
		System.out.println("The selected users are subscribed to the selected course");

	}

}

