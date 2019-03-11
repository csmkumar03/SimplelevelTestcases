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

public class CreateCourseTest_ELTC_22 {

	private WebDriver driver;
	private String baseUrl;
	private CreateCoursePOM CreateCoursePOM;
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
		CreateCoursePOM = new CreateCoursePOM(driver); 
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
		CreateCoursePOM.sendUserName("admin");
		CreateCoursePOM.sendPassword("admin@1234");
		CreateCoursePOM.clickLoginBtn(); 
		CreateCoursePOM.clickAdminTab();
		//DeleteCoursePOM.clickCourseList();
		CreateCoursePOM.clickCreateACourse();
		CreateCoursePOM.enterTitle("DataStructure_Muthu123");
		CreateCoursePOM.clickSubmit();
		//DeleteCoursePOM.clickDeleteCourse();
		screenShot.captureScreenShot("First");
		
		
	}
	
	
	/*public void clickAdministrationTab(WebElement Administration) {
		Actions action = new Actions(driver);
        //WebElement we_Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        action.moveToElement(Administration).perform();
        Administration.click();
	*/
	
	
}

