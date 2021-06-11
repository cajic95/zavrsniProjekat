package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Homepage;
import objs.ProfilePage;
import resources.Constants;

public class TestProfilePage {
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
	public void testGoToProfilePage() {
		ProfilePage.clickProfileSettings(driver);
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, Constants.URL_EDIT_PROFILE);
	}

	@Test(priority = 2)
	public void testInputNickname() {
		String nick = "MC";
		ProfilePage.inputNickname(driver, nick);
		driver.navigate().refresh();
		String getNickname = driver.findElement(By.id("nick_name")).getAttribute("value");
				
		
		Assert.assertEquals(getNickname, nick);
	}
}
