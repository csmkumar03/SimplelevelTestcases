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
import com.training.pom.CreateCategoryPOM;
import com.training.pom.CreateCoursePOM;
import com.training.pom.DeleteCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateCategoryTest_ELTC_24 {

	private WebDriver driver;
	private String baseUrl;
	private CreateCategoryPOM CreateCategoryPOM;
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
		CreateCategoryPOM = new CreateCategoryPOM(driver); 
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
		CreateCategoryPOM.sendUserName("admin");
		CreateCategoryPOM.sendPassword("admin@1234");
		CreateCategoryPOM.clickLoginBtn(); 
		CreateCategoryPOM.clickAdminTab();
		//DeleteCoursePOM.clickCourseList();
		//CreateCoursePOM.clickCreateACourse();
		//CreateCoursePOM.enterTitle("DataStructure_Muthu123");
		//CreateCoursePOM.clickSubmit();
		//DeleteCoursePOM.clickDeleteCourse();
		CreateCategoryPOM.clickCourseCategory();
		CreateCategoryPOM.clickCreateCategory();
		CreateCategoryPOM.enterCategoryCode("CSE004");
		CreateCategoryPOM.enterCategoryName("Communications Category1");
		screenShot.captureScreenShot("First_create category");
		CreateCategoryPOM.clickSubmitCategory();
		
	}
	
	
	/*public void clickAdministrationTab(WebElement Administration) {
		Actions action = new Actions(driver);
        //WebElement we_Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        action.moveToElement(Administration).perform();
        Administration.click();
	*/
	
	
}

