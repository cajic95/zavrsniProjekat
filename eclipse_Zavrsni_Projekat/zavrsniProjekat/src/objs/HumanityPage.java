package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class HumanityPage {
	

	public static void clickOnShiftPlanning(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_SP_XPATH)).click();
	}
	public static void clickOnTimeClock(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_TC_XPATH)).click();
	}
	public static void clickOnLeave(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_LEAVE)).click();
	}
	public static void clickOnTraining(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_TRAINING)).click();
	}
	public static void clickOnStaff(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_STAFF)).click();
	}
	public static void clickOnAvailability(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_AVAILABILITY)).click();
	}
	public static void clickOnPayroll(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_PAYROLL)).click();
	}
	public static void clickOnReports(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_REPORTS)).click();
	}
	public static void clickOnSettings(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_SETTINGS)).click();
	}
	public static void clickOnLogo(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_LOGO)).click();
	}
}
