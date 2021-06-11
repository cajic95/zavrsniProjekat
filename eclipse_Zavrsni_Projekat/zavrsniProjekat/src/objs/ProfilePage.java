package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Constants;

public class ProfilePage {

	
	public static void clickProfileSettings(WebDriver driver) {
		driver.findElement(By.xpath(Constants.PROFILE_XPATH)).click();
		driver.findElement(By.xpath(Constants.EDIT_PROFILE_XPATH)).click();
	}
	
	public static void inputNickname(WebDriver driver, String nickname) {
		WebElement nick = driver.findElement(By.xpath(Constants.INPUT_NICKNAME_XPATH));
		nick.clear();
		nick.sendKeys(nickname);
		saveEmployee(driver);
	}
	
	public static void inputID(WebDriver driver, String id) {
		WebElement idd = driver.findElement(By.xpath(Constants.INPUT_ID_XPATH));
		idd.clear();
		idd.sendKeys(id);
		saveEmployee(driver);
	}
	public static void chooseGender(WebDriver driver, String gender) {
		WebElement gen = driver.findElement(By.xpath(Constants.CHOOSE_GENDER_XPATH));
		gen.click();
		gen.sendKeys(gender);
		saveEmployee(driver);
	}
	public static void saveEmployee(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SAVE_EMPLOYEE_XPATH)).click();
	}
}
