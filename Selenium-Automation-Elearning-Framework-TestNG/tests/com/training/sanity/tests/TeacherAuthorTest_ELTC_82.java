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

public class TeacherAuthorTest_ELTC_82 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TeacherAuthorTestPOM TeacherAuthorTestPOM;
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
		TeacherAuthorTestPOM = new com.training.pom.TeacherAuthorTestPOM(driver); 
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
	public void TeacherAuthorCourse() throws InterruptedException {
		TeacherAuthorTestPOM.sendUserName("admin"); //loged with admin since trainer1(csmkumar) id doesnot have access to click course link"
		TeacherAuthorTestPOM.sendPassword("admin@123");
		TeacherAuthorTestPOM.clickLoginBtn(); 
		TeacherAuthorTestPOM.clickAdminTab();
		//CreateCoursePOM.clickCreateACourse();
		//CreateCoursePOM.enterTitle("DataStructure_Muthu1245");
		//CreateCoursePOM.clickSubmit();
		TeacherAuthorTestPOM.clickCourseLnk();
		TeacherAuthorTestPOM.clickTestLnk();
		TeacherAuthorTestPOM.clickTestIcon();
		TeacherAuthorTestPOM.clickNewTest();
		TeacherAuthorTestPOM.enterTestName("Online Quiz1");
		TeacherAuthorTestPOM.clickAdvanceTab();
		//TeacherAuthorTestPOM.enterContextTest("quiz");
		TeacherAuthorTestPOM.enableStartTime();
		TeacherAuthorTestPOM.enterPercentage("50");
		screenShot.captureScreenShot("SS_TeacherAuthCourse");
		TeacherAuthorTestPOM.clickProceedBtn();
		//Thread.sleep(2000);
		//TeacherAuthorTestPOM.clickMultipleChoiceIcon();
		//enter test question name
		//TeacherAuthorTestPOM.enterQuestionName("which course you are learning?)");
		//enter "Selenium" in optionOne
		//TeacherAuthorTestPOM.enterOptionOne("Selenium");
		TeacherAuthorTestPOM.clickLogoutDropdwn();
		TeacherAuthorTestPOM.clickLogOut();
		driver.close();
		
}
	
	@Test(priority=1)
	public void StudentLoginTest() {
	
	TeacherAuthorTestPOM.sendUserName("csmkumar03"); //login as Student named "csmkumar03"
	TeacherAuthorTestPOM.sendPassword("student123");
	TeacherAuthorTestPOM.clickLoginBtn(); 
	//TeacherAuthorTestPOM.clickAdminTab();
	//TeacherAuthorTestPOM.clickCourseCatelog();
	TeacherAuthorTestPOM.clickCourse();
	TeacherAuthorTestPOM.clickTestFolderIcon();
	TeacherAuthorTestPOM.clickOnlineTest1();
	TeacherAuthorTestPOM.clickStartTest();
	TeacherAuthorTestPOM.selectSeleniumOption();
	TeacherAuthorTestPOM.clickEndTest();
	screenShot.captureScreenShot("SS_TestResult");
	//TeacherAuthorTestPOM.clickLogoutDropdwn();
	//TeacherAuthorTestPOM.clickLogOut();
	driver.close();

	}
	
	@Test(priority=2)
	public void TeacherReportTest() {
	
	TeacherAuthorTestPOM.sendUserName("admin"); //Teacher named "Trainer123" does not search particular Student to select report so logged in with admin
	TeacherAuthorTestPOM.sendPassword("admin@123");
	TeacherAuthorTestPOM.clickLoginBtn(); 
	TeacherAuthorTestPOM.clickReporting();
	TeacherAuthorTestPOM.searchStudentName("Muthu");
	TeacherAuthorTestPOM.clickSearch();
	screenShot.captureScreenShot("SS_TeeacherReport");
	TeacherAuthorTestPOM.selectParticularUser(); // click particular student(Muthu)
	TeacherAuthorTestPOM.selectCourseIcon();
	TeacherAuthorTestPOM.clickTesticon();
	TeacherAuthorTestPOM.clickQuizIcon();
	TeacherAuthorTestPOM.clickShowBtn();
	screenShot.captureScreenShot("SS_TeeacherReport");
	TeacherAuthorTestPOM.clickLogoutDropdwn();
	TeacherAuthorTestPOM.clickLogOut();
    driver.close();
	
	}

	
	}

