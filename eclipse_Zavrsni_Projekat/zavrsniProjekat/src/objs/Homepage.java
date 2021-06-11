package objs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import resources.Constants;

public class Homepage {

	
	public static void clickOnAboutUs(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get(Constants.URL_HUMANITY);
		driver.findElement(By.xpath(Constants.OK_SPAM_XPATH)).click();
		driver.findElement(By.xpath(Constants.X_BTN_XPATH)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(Constants.ABOUTBTN_XPATH))));
	//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.ABOUTBTN_XPATH))));
		
		driver.findElement(By.xpath(Constants.ABOUTBTN_XPATH)).click();
	}
	public static void takeScreenshot(WebDriver driver) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:/Users/MrCajic/Desktop/screenshot/test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void LoginToSite(WebDriver driver, String email, String password) {
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.xpath(Constants.LOGIN_XPATH)).click();
		WebElement username = driver.findElement(By.xpath(Constants.USERNAME_XPATH));
		username.click();
		username.sendKeys(email);
		WebElement passwordd = driver.findElement(By.xpath(Constants.PASSWORD_XPATH));
		passwordd.sendKeys(password);
		driver.findElement(By.xpath(Constants.LOG_IN_BTN_XPATH)).click();

	}
}
