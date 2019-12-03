package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "https://www.humanity.com";
	public static final String tURL = "https://www.humanity.com/app/";
	private static final String LOGIN_BTN_XPATH = "//div[@class='nav-trial']//a[2]";
	private static final String EMAIL_XPATH = "//input[@id='email']";
	private static final String PASS_XPATH = "//input[@id='password']";
	private static final String LOGIN2_XPATH = "//button[@name='login'][contains(text(),'Log in')]";
	private static final String LOGINWRONG_XPATH = "//div[@class='threeparty']";

	// Login btn
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BTN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	// Email input
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void fillEmail(WebDriver driver, String inputText) {
		getEmail(driver).sendKeys(inputText);
	}

	// Pass input
	public static WebElement getPass(WebDriver driver) {
		return driver.findElement(By.xpath(PASS_XPATH));
	}

	public static void fillPass(WebDriver driver, String inputText) {
		getPass(driver).sendKeys(inputText);
	}

	// Login2 btn
	public static WebElement getLogin2(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN2_XPATH));
	}

	public static void clickLogin2(WebDriver driver) {
		getLogin2(driver).click();
	}

	// LoginWrongXpath
	public static WebElement getLoginWrong(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINWRONG_XPATH));
	}

	public static void clickLoginWrong(WebDriver driver) {
		getLoginWrong(driver).click();
	}

}
