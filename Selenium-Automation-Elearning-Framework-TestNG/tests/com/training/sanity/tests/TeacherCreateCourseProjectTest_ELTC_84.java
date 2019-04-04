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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherCreateCourseProjectTest_ELTC_84 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TeacherCreateCourseProjectPOM TeacherCreateCourseProjectPOM;
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
		TeacherCreateCourseProjectPOM = new com.training.pom.TeacherCreateCourseProjectPOM(driver); 
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
	@Test(priority=0)
	public void TeacherCreateCourse() throws InterruptedException {
		TeacherCreateCourseProjectPOM.sendUserName("Trainer123"); //loged with admin since trainer1(csmkumar) id doesnot have access to click course link"
		TeacherCreateCourseProjectPOM.sendPassword("trainer@123");
		TeacherCreateCourseProjectPOM.clickLoginBtn(); 
		TeacherCreateCourseProjectPOM.clickCreateACourse();
		//Type Course name "SeleniumCourse"
		TeacherCreateCourseProjectPOM.typeTitleName("GK6");
		TeacherCreateCourseProjectPOM.clickAdvanceTab();
		TeacherCreateCourseProjectPOM.clickCategoryDropDwn();
		TeacherCreateCourseProjectPOM.typeProject("Project");
		TeacherCreateCourseProjectPOM.typeCourseCode("gk6");
		screenShot.captureScreenShot("SS_TeacherCreateACourse");
		TeacherCreateCourseProjectPOM.clickSubmitCourseBtn();
		//TeacherCreateCourseProjectPOM.clickAddIntroBtn();
		//TeacherCreateCourseProjectPOM.typeIntroContent("This is an Selenium Course");
		//TeacherCreateCourseProjectPOM.clickCourseDecrip();
		//TeacherCreateCourseProjectPOM.clickDescriptionIcon();
		TeacherCreateCourseProjectPOM.clickProjectIcon();
		//TeacherCreateCourseProjectPOM.typeDescripTitle("Selenium course for beginners");
		//TeacherCreateCourseProjectPOM.typeContent("This course Selenium for beginners only");
				
		//TeacherAuthorTestPOM.clickAdminTab();
		//CreateCoursePOM.clickCreateACourse();
		//CreateCoursePOM.enterTitle("DataStructure_Muthu1245");
		//CreateCoursePOM.clickSubmit();
		screenShot.captureScreenShot("SS_TeacherAuthCourse");
		TeacherCreateCourseProjectPOM.clickLogoutDropdwn();
		TeacherCreateCourseProjectPOM.clickLogOut();
		driver.close();
		
}
	
	@Test(priority=1)
	public void StudentLoginTest() {
	
	TeacherCreateCourseProjectPOM.sendUserName("csmkumar03"); //login as Student named "csmkumar03"
	TeacherCreateCourseProjectPOM.sendPassword("student123");
	TeacherCreateCourseProjectPOM.clickLoginBtn(); 
	//TeacherAuthorTestPOM.clickAdminTab();
	TeacherCreateCourseProjectPOM.clickCourseCatelog();
	TeacherCreateCourseProjectPOM.clickCourseGK();
	screenShot.captureScreenShot("SS_SubscribeCourse");
	TeacherCreateCourseProjectPOM.clickSubscribeGK();
	
	TeacherCreateCourseProjectPOM.clickLogoutDropdwn();
	TeacherCreateCourseProjectPOM.clickLogOut();
	driver.close();

	}
	
	@Test(priority=2)
	public void TeacherReportTest() {
	TeacherCreateCourseProjectPOM.sendUserName("Trainer123"); //Teacher login named "Trainer123" 
	TeacherCreateCourseProjectPOM.sendPassword("trainer@123");
	TeacherCreateCourseProjectPOM.clickLoginBtn(); 
	TeacherCreateCourseProjectPOM.clickTeacherReport();
	TeacherCreateCourseProjectPOM.typeSearchUser("Muthu");
	TeacherCreateCourseProjectPOM.clickSubmitBtn();
	TeacherCreateCourseProjectPOM.clickSelectStudent();
	//TeacherAuthorTestPOM.clickReporting();
	//TeacherAuthorTestPOM.searchStudentName("Muthu");
	//TeacherAuthorTestPOM.clickSearch();
	screenShot.captureScreenShot("SS_TeeacherReport");
	//TeacherAuthorTestPOM.selectParticularUser(); // click particular student(Muthu)
	//TeacherAuthorTestPOM.selectCourseIcon();
	//TeacherAuthorTestPOM.clickTesticon();
	//TeacherAuthorTestPOM.clickQuizIcon();
	//TeacherAuthorTestPOM.clickShowBtn();
	screenShot.captureScreenShot("SS_TeeacherReport");
	TeacherCreateCourseProjectPOM.clickLogoutDropdwn();
	TeacherCreateCourseProjectPOM.clickLogOut();
	driver.close();
	driver.quit();
	
	}

	
	}

