package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;

public class HumanityAddEmployee {
	public static boolean testAddEmployee() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogin(driver);

		// Method for checking url
		if (driver.getCurrentUrl().contains(HumanityHome.tURL) == false) {
			return false;
		}

		HumanityLogin.LoginAction(driver);

		HumanityMenu.clickStaff(driver);

		HumanityStaff.clickAddEmloyee(driver);
		Thread.sleep(4000);
		HumanityStaff.setFirstNameInput(driver, "Petar", 1);
		HumanityStaff.setLastNameInput(driver, "Pekic", 1);
		HumanityStaff.setEmailInput(driver, "peca@gmail.com", 1);
		Thread.sleep(3000);
		HumanityStaff.clickSaveEmployees(driver);

		Thread.sleep(3000);
		driver.quit();
		return true;

	}
}
