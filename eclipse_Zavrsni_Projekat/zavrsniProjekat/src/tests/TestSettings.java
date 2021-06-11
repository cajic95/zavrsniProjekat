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
import objs.HumanityPage;
import objs.SettingsPage;
import objs.StaffPage;
import resources.Constants;

public class TestSettings {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\eclipse_Zavrsni_Projekat\\zavrsniProjekat\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.URL_HUMANITY);
		Homepage.LoginToSite(driver, Constants.USERNAME, Constants.PASSWORD);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	 @Test
	public void testChangeLanguage() {
		HumanityPage.clickOnSettings(driver);
		driver.findElement(By.xpath(Constants.LANGUAGE_XPATH)).click();
		driver.findElement(By.xpath(Constants.SERBIAN_LANGUAGE_XPATH)).click();
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS2)).click();
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS)).click();
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		String title = driver.findElement(By.xpath("//*[@id=\"sn_dashboard\"]/span/p")).getText();
		String expectedTitle = "Командна табла";
		boolean a = false;
		if (title.equals(expectedTitle)) {
			a = true;
		}
		Assert.assertTrue(a);
	}

	@Test
	public void testNotifications() {
		HumanityPage.clickOnSettings(driver);

		boolean isEmailTrue = false;
		WebElement email = driver.findElement(By.xpath(Constants.NOTIFICATIONS_EMAIL_XPATH));
		if (email.isSelected() == true) {
			SettingsPage.clickEmail(driver);
			isEmailTrue = true;
		}
		boolean isMobilePushTrue = false;
		System.out.println(isEmailTrue);
		WebElement mobilePush = driver.findElement(By.xpath(Constants.NOTIFICATIONS_MOBILE_PUSH_XPATH));
		if (mobilePush.isSelected() == true) {
			SettingsPage.clickMobilePush(driver);
			isMobilePushTrue = true;
		}
		boolean isSmsTrue = false;
		WebElement sms = driver.findElement(By.xpath(Constants.NOTIFICATIONS_SMS_XPATH));
		if (sms.isSelected() == true) {
			SettingsPage.clickSms(driver);
			isSmsTrue = true;
		}
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS2)).click();
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS)).click();
		driver.navigate().refresh();

		Assert.assertTrue(isEmailTrue);
		Assert.assertTrue(isSmsTrue);
		Assert.assertTrue(isMobilePushTrue);

	}
}
