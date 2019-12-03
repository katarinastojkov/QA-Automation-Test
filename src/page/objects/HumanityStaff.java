package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL = "https://mica.humanity.com/app/dashboard/";

	private static final String ADD_EMPLOYEE_XPATH = "//button[@id='act_primary']";

	public static final String FIRST_NAME_XPATH = "//input[@id='_asf";
	public static final String LAST_NAME_XPATH = "//input[@id='_asl";
	public static final String EMAIL_XPATH = "//input[@id='_ase";
	public static final String ENDING_XPATH = "']";

	public static final String SAVE_EMPLOYEES_XPATH = "//button[@id='_as_save_multiple']";
	

	// AddEmloyees
	public static WebElement getAddEmloyee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH));
	}

	public static void clickAddEmloyee(WebDriver driver) {
		getAddEmloyee(driver).click();
	}

	// FirstName Box
	public static WebElement getFirstNameInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH + poRedu + ENDING_XPATH));
	}

	public static void setFirstNameInput(WebDriver driver, String data, int poRedu) {
		getFirstNameInput(driver, poRedu).sendKeys(data);
	}

	// LastName Box
	public static WebElement getLastNameInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH + poRedu + ENDING_XPATH));
	}

	public static void setLastNameInput(WebDriver driver, String data, int poRedu) {
		getLastNameInput(driver, poRedu).sendKeys(data);
	}

	// Email Box
	public static WebElement getEmailInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(EMAIL_XPATH + poRedu + ENDING_XPATH));
	}

	public static void setEmailInput(WebDriver driver, String data, int poRedu) {
		getEmailInput(driver, poRedu).sendKeys(data);
	}

	// Click SaveEmployees
	public static WebElement getSaveEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES_XPATH));
	}

	public static void clickSaveEmployees(WebDriver driver) {
		getSaveEmployees(driver).click();
	}


}
