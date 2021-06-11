package objs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class StaffPage {
	
	public static void clickAddEmployees(WebDriver driver){
			driver.findElement(By.xpath(Constants.BTN_ADD_EMPLOYEES)).click();
		}
	public static void inputFirstName(WebDriver driver, String firstName)  {
		
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}WebDriverWait wait = new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.INPUT_FIRST_NAME))));
		driver.findElement(By.xpath(Constants.INPUT_FIRST_NAME)).sendKeys(firstName);
	}
	public static void inputLastName(WebDriver driver, String lastName) {
		driver.findElement(By.xpath(Constants.INPUT_LAST_NAME)).sendKeys(lastName);
	}
	public static void inputEmail(WebDriver driver, String email){
		driver.findElement(By.xpath(Constants.INPUT_EMAIL)).sendKeys(email);
	}
	public static void clickSaveEmployees(WebDriver driver) {
		driver.findElement(By.xpath(Constants.BTN_SAVE_EMPLOYEES_XPATH)).click();
	}
	public static void clickAllStaff(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Constants.BTN_ALL_STAFF_XPATH))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.BTN_ALL_STAFF_XPATH))));
		driver.findElement(By.xpath(Constants.BTN_ALL_STAFF_XPATH)).click();
	}
	public static void addEmployees(WebDriver driver, String firstname, String lastname, String email) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Constants.INPUT_FIRST_NAME))));
		
		inputFirstName(driver, firstname);
		inputLastName(driver, lastname);
		inputEmail(driver, email);
	}
	//change name
	public static void changeName(WebDriver driver, String newName) {
		driver.findElement(By.xpath(Constants.FIRST_EMPL_XPATH)).click();
		driver.findElement(By.xpath(Constants.EDIT_DETAILS_XPATH)).click();
		WebElement name = driver.findElement(By.xpath(Constants.INPUT_EDITED_NAME_XPATH));
		name.clear();
		name.sendKeys(newName);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Constants.SUBMIT_NAME_CHANGE_XPATH)).click();
	}
	public static void clickToAddEmpl(WebDriver driver) {
		HumanityPage.clickOnStaff(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.BTN_ADD_EMPLOYEES))));
		StaffPage.clickAddEmployees(driver);
	}
	public static void writeArray(String []array) {
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
}
