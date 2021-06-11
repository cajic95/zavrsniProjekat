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
import resources.Constants;



public class TestsHomepage {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\eclipse_Zavrsni_Projekat\\zavrsniProjekat\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	@Test
	public void testAboutUs() {
		Homepage.clickOnAboutUs(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Homepage.takeScreenshot(driver);
		Assert.assertEquals(driver.getCurrentUrl(), Constants.ABOUT_US_PAGE);
		
	}
	@Test
	public void testLogin() {
		driver.navigate().refresh();
		driver.navigate().to(Constants.URL_HUMANITY);
		Homepage.LoginToSite(driver, Constants.USERNAME, Constants.PASSWORD);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Constants.HUMANITY_LOGO_XPATH))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.HUMANITY_LOGO_XPATH))));
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, Constants.EXPECTED_LOGIN);
		driver.close();
	}
}
