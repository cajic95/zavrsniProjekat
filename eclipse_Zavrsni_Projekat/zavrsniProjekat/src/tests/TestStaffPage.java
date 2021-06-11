package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Homepage;
import objs.HumanityPage;
import objs.StaffPage;
import resources.Constants;

public class TestStaffPage {
	private static WebDriver driver;
	int iterator = 5;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MrCajic\\eclipse_Zavrsni_Projekat\\zavrsniProjekat\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.URL_HUMANITY);
		Homepage.LoginToSite(driver, Constants.USERNAME, Constants.PASSWORD);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void testAddEmployees() {
		HumanityPage.clickOnStaff(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.BTN_ADD_EMPLOYEES))));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Constants.BTN_ADD_EMPLOYEES))));
		StaffPage.clickAddEmployees(driver);

		File f = new File("Employees.xlsx");

		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb;
			wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(0);
			Cell c0 = row.getCell(0);
			Cell c1 = row.getCell(1);
			Cell c2 = row.getCell(2);
			String firstname = c0.toString();
			String lastname = c1.toString();
			String email = c2.toString();

			StaffPage.addEmployees(driver, firstname, lastname, email);

			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath(Constants.BTN_SAVE_EMPLOYEES_XPATH))));
			StaffPage.clickSaveEmployees(driver);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			StaffPage.clickAllStaff(driver);
			wait.until(
					ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.TABLE_LIST_XPATH))));

			String allNames = "";
			List<String> names1 = new ArrayList<String>();
			List<WebElement> list1 = driver.findElements(By.xpath("//*[@id=\"7\"]"));
			for (int i = 0; i < list1.size(); i++) {
				String nam = list1.get(i).getText();
				names1.add(nam.toString());
				allNames = allNames + " " + nam.toString() + " ";
			}
			System.out.println(allNames);

			HumanityPage.clickOnStaff(driver);
			String name = firstname + " " + lastname;
			Assert.assertTrue(allNames.contains(name));

			wb.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void testChangeName() {
		String tempName = "Zoran";
		HumanityPage.clickOnStaff(driver);
		StaffPage.changeName(driver, tempName);
		HumanityPage.clickOnStaff(driver);

		String allNames = "";
		List<String> names1 = new ArrayList<String>();
		List<WebElement> list1 = driver.findElements(By.xpath(Constants.CELL_FIRST_NAME));
		for (int i = 0; i < list1.size(); i++) {
			String nam = list1.get(i).getText();
			names1.add(nam.toString());
			allNames = allNames + " " + nam.toString() + " ";
		}
		String name = tempName;
		Assert.assertTrue(allNames.contains(name));
	}

	@Test(priority = 3)
	public void testAdding5Emp() {
		File f = new File("Employees.xlsx");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb;
			wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);

			String[] arrayName = new String[5];
			for (int i = 0; i < arrayName.length; i++) {
				Row row = sheet.getRow(i + 1);
				String name = row.getCell(0).toString();
				arrayName[i] = name;
			}
			String[] arrayLastName = new String[5];
			for (int i = 0; i < arrayLastName.length; i++) {
				Row row = sheet.getRow(i + 1);
				String lastName = row.getCell(1).toString();
				arrayLastName[i] = lastName;
			}
			String[] arrayEmail = new String[5];
			for (int i = 0; i < arrayEmail.length; i++) {
				Row row = sheet.getRow(i + 1);
				String email = row.getCell(2).toString();
				arrayEmail[i] = email;
			}

			HumanityPage.clickOnStaff(driver);
			for (int i = 0; i < iterator; i++) {

				wait.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(By.xpath(Constants.BTN_ALL_STAFF_XPATH))));
				StaffPage.clickAddEmployees(driver);
				wait.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(By.xpath(Constants.INPUT_FIRST_NAME))));
				StaffPage.addEmployees(driver, arrayName[i], arrayLastName[i], arrayEmail[i]);
				wait.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(By.xpath(Constants.BTN_SAVE_EMPLOYEES_XPATH))));
				StaffPage.clickSaveEmployees(driver);
			}
			HumanityPage.clickOnStaff(driver);

			String email = "";
			List<String> emailActual = new ArrayList<String>();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Constants.CELL_EMAIL))));
			List<WebElement> list = driver.findElements(By.xpath(Constants.CELL_EMAIL));
			for (int i = 0; i < list.size(); i++) {
				String nam = list.get(i).getText();
				emailActual.add(nam.toString());
				email = email + " " + nam.toString() + " ";
			}
			HumanityPage.clickOnStaff(driver);

			Assert.assertTrue(email.contains(arrayEmail[0]));
			Assert.assertTrue(email.contains(arrayEmail[1]));
			Assert.assertTrue(email.contains(arrayEmail[2]));
			Assert.assertTrue(email.contains(arrayEmail[3]));
			Assert.assertTrue(email.contains(arrayEmail[4]));

			wb.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.close();
	}
}
