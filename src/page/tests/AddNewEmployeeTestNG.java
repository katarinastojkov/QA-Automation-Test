package page.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HumanityMenu;
import page.objects.HumanityStaff;

public class AddNewEmployeeTestNG {

	@Test
	public void FirstNameEmailPASS() throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			HumanityLogin.LoginAction(driver);

			HumanityMenu.clickStaff(driver);
			Thread.sleep(2000);
			HumanityStaff.clickAddEmloyee(driver);
			Thread.sleep(4000);
			HumanityStaff.setFirstNameInput(driver, "Radovan", 1);
			HumanityStaff.setLastNameInput(driver, "Treci", 1);
			HumanityStaff.setEmailInput(driver, "biblioteka@gmail.com", 1);
			Thread.sleep(3000);
			HumanityStaff.clickSaveEmployees(driver);
			Thread.sleep(3000);

			// Makes a list of all elements that have xpath containing the name of the new
			// employee
			List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Radovan Treci')]"));

			// Checks if the list has any items, if it does, the employee was successfully
			// added
			Assert.assertTrue(list.size() > 0, "Text not found!");
			System.out.println("Test successful!");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}

	}

	@Test
	public void FirsNameBoxLeftBlankFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			HumanityLogin.LoginAction(driver);

			HumanityMenu.clickStaff(driver);
			Thread.sleep(2000);
			HumanityStaff.clickAddEmloyee(driver);
			Thread.sleep(4000);
			HumanityStaff.setFirstNameInput(driver, "", 1);
			HumanityStaff.setLastNameInput(driver, "Radonjic", 1);
			HumanityStaff.setEmailInput(driver, "rado@gmail.com", 1);
			Thread.sleep(3000);
			HumanityStaff.clickSaveEmployees(driver);
			Thread.sleep(3000);

			// Makes a list of all elements that have xpath containing the name of the new
			// employee
			List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Radnik Radonjic')]"));

			// Checks if the list has any items, if it does, the employee was successfully
			// added
			Assert.assertTrue(list.size() > 0, "Text not found!");
			System.out.println("Test successful!");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}

	}

	@Test
	public void EmailWrongFormFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			HumanityLogin.LoginAction(driver);

			HumanityMenu.clickStaff(driver);
			Thread.sleep(2000);
			HumanityStaff.clickAddEmloyee(driver);
			Thread.sleep(4000);
			HumanityStaff.setFirstNameInput(driver, "Radonjic", 1);
			HumanityStaff.setLastNameInput(driver, "Radonjic", 1);
			HumanityStaff.setEmailInput(driver, "radogmail.com", 1);
			Thread.sleep(3000);
			HumanityStaff.clickSaveEmployees(driver);
			Thread.sleep(3000);

			// Makes a list of all elements that have xpath containing the name of the new
			// employee
			List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Radnik Radonjic')]"));

			// Checks if the list has any items, if it does, the employee was successfully
			// added
			Assert.assertTrue(list.size() > 0, "Text not found!");
			System.out.println("Test successful!");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}

	}

	@Test
	public void AnEmployeeAlreadyExistsFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			HumanityLogin.LoginAction(driver);

			HumanityMenu.clickStaff(driver);
			Thread.sleep(2000);
			HumanityStaff.clickAddEmloyee(driver);
			Thread.sleep(4000);
			HumanityStaff.setFirstNameInput(driver, "Laza", 1);
			HumanityStaff.setLastNameInput(driver, "Lazic", 1);
			HumanityStaff.setEmailInput(driver, "rado@gmail.com", 1);
			Thread.sleep(3000);
			HumanityStaff.clickSaveEmployees(driver);
			Thread.sleep(3000);

			// Makes a list of all elements that have xpath containing the name of the new
			// employee
			List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Laza Lazic')]"));

			// Checks if the list has any items, if it does, the employee was successfully
			// added
			Assert.assertTrue(list.size() > 0, "Text not found!");
			System.out.println("Test successful!");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}

	}

	@Test
	public void SaveEmployeesButtonFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			HumanityLogin.LoginAction(driver);

			HumanityMenu.clickStaff(driver);
			Thread.sleep(2000);
			HumanityStaff.clickAddEmloyee(driver);
			Thread.sleep(4000);
			HumanityStaff.setFirstNameInput(driver, "Laza", 1);
			HumanityStaff.setLastNameInput(driver, "Lazic", 1);
			HumanityStaff.setEmailInput(driver, "rado@gmail.com", 1);
			Thread.sleep(3000);

			// Makes a list of all elements that have xpath containing the name of the new
			// employee
			List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Laza Lazic')]"));

			// Checks if the list has any items, if it does, the employee was successfully
			// added
			Assert.assertTrue(list.size() > 0, "Text not found!");
			System.out.println("Test successful!");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}

	}
}
