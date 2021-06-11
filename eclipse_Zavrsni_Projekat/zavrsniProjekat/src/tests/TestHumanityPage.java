package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Homepage;
import objs.HumanityPage;
import resources.Constants;

public class TestHumanityPage {
	
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\eclipse_Zavrsni_Projekat\\zavrsniProjekat\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.URL_HUMANITY);
		Homepage.LoginToSite(driver, Constants.USERNAME, Constants.PASSWORD);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
		@Test(priority = 1)
		public void testShiftPlanning() {
			HumanityPage.clickOnShiftPlanning(driver);
			String actualSP = driver.getCurrentUrl();
			Assert.assertEquals(actualSP, Constants.URL_SHIFT_PLANNING);
		}
		@Test(priority = 2)
		public void tesTimeClock() {
			HumanityPage.clickOnTimeClock(driver);
			String actualTC = driver.getCurrentUrl();
			Assert.assertEquals(actualTC, Constants.URL_TIME_CLOCK);
		}
		@Test(priority = 3)
		public void testLeave() {
			HumanityPage.clickOnLeave(driver);
			String actualLeave = driver.getCurrentUrl();
			Assert.assertEquals(actualLeave, Constants.URL_LEAVE);
		}
		@Test(priority = 4)
		public void testTraining() {
			HumanityPage.clickOnTraining(driver);
			String actualTraining = driver.getCurrentUrl();
			Assert.assertEquals(actualTraining, Constants.URL_TRAINING);
		}
		@Test(priority = 5)
		public void testStaff() {
			HumanityPage.clickOnStaff(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.urlToBe(Constants.URL_STAFF));
			String actualStaff = driver.getCurrentUrl();
			Assert.assertEquals(actualStaff, Constants.URL_STAFF);
		}
		@Test(priority = 6)
		public void testAvailability() {

			HumanityPage.clickOnAvailability(driver);
			String actualAvailability = driver.getCurrentUrl();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Assert.assertEquals(actualAvailability, Constants.URL_AVAILABILITY);
		}
		@Test(priority = 7)
		public void testPayroll() {
			HumanityPage.clickOnPayroll(driver);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.urlToBe(Constants.URL_PAYROLL));
			String actualPayroll = driver.getCurrentUrl();
			Assert.assertEquals(actualPayroll, Constants.URL_PAYROLL);
		}
		@Test(priority = 8)
		public void testReports() {
			HumanityPage.clickOnReports(driver);
			String actualReports = driver.getCurrentUrl();
			Assert.assertEquals(actualReports, Constants.URL_REPORTS);
		}
		@Test(priority = 9)
		public void testSettings() {
			HumanityPage.clickOnSettings(driver);
			String actualSettings = driver.getCurrentUrl();
			Assert.assertEquals(actualSettings, Constants.URL_SETTINGS);
		}
		@Test(priority = 10)
		public void testLogo() {
			HumanityPage.clickOnLogo(driver);
			String actualLogo = driver.getCurrentUrl();
			Assert.assertEquals(actualLogo, Constants.URL_LOGO);	
			driver.close();
		}

}
