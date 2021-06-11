package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class SettingsPage {

	public static void clickEmail(WebDriver driver) {
		driver.findElement(By.xpath(Constants.NOTIFICATIONS_EMAIL_XPATH)).click();
	}
	public static void clickSms(WebDriver driver) {
		driver.findElement(By.xpath(Constants.NOTIFICATIONS_SMS_XPATH)).click();
	}
	public static void clickMobilePush(WebDriver driver) {
		driver.findElement(By.xpath(Constants.NOTIFICATIONS_MOBILE_PUSH_XPATH)).click();
	}
}
