package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;

public class HumanityLogin {
	public static boolean testLogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogin(driver);

		// Method for checking url
		if (driver.getCurrentUrl().contains(HumanityHome.tURL) == false) { //tURL https://www.humanity.com/app/ stranice za login
			return false;
		}

		String email, pass;
		email = "xejisa2872@exserver.top";
		pass = "test123";

		HumanityHome.fillEmail(driver, email);
		HumanityHome.fillPass(driver, pass);
		HumanityHome.clickLogin2(driver);

		Thread.sleep(6000);
		driver.quit();

		return true;

	}
	
	public static void LoginAction(WebDriver driver) throws InterruptedException {
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogin(driver);

		String email, pass;
		email = "xejisa2872@exserver.top";
		pass = "test123";

		HumanityHome.fillEmail(driver, email);
		HumanityHome.fillPass(driver, pass);
		HumanityHome.clickLogin2(driver);
	}
	
	public static void LoginAction2(WebDriver driver) throws InterruptedException {
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogin(driver);

		String username, pass;
		username = "MilicaMilic";
		pass = "test123";

		HumanityHome.fillEmail(driver, username);
		HumanityHome.fillPass(driver, pass);
		HumanityHome.clickLogin2(driver);
	}
}
