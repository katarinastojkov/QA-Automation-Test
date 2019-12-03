package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;

public class HumanityLoginTestNG {
	@Test
	public void EmailPasswordPASS() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			HumanityLogin.LoginAction(driver);
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL); // app/dashboard, ulogovao se
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}
	
	@Test
	public void UsernamePasswordPASS() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			HumanityLogin.LoginAction2(driver);
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}

	@Test
	public void EmailDoesNotMatchFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(4000);

			HumanityHome.clickLogin(driver);
			String email, pass;
			email = "ejisa2872@exserver.top";
			pass = "test123";

			HumanityHome.fillEmail(driver, email);
			HumanityHome.fillPass(driver, pass);
			HumanityHome.clickLogin2(driver);
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}

	@Test
	public void PasswordDoesNotMatchFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(4000);

			HumanityHome.clickLogin(driver);
			String email, pass;
			email = "xejisa2872@exserver.top";
			pass = "test122";

			HumanityHome.fillEmail(driver, email);
			HumanityHome.fillPass(driver, pass);
			HumanityHome.clickLogin2(driver);
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}

	@Test
	public void EmailLeftBlankFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(4000);

			HumanityHome.clickLogin(driver);
			String email, pass;
			email = "";
			pass = "test122";

			HumanityHome.fillEmail(driver, email);
			HumanityHome.fillPass(driver, pass);
			HumanityHome.clickLogin2(driver);
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}

	@Test
	public void PasswordLeftBlankFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {

			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(4000);

			HumanityHome.clickLogin(driver);
			String email, pass;
			email = "xejisa2872@exserver.top";
			pass = "";

			HumanityHome.fillEmail(driver, email);
			HumanityHome.fillPass(driver, pass);
			HumanityHome.clickLogin2(driver);
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}
	
	@Test
	public void InvalidUsernameFAIL() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			HumanityHome.clickLogin(driver);

			String username, pass;
			username = "MilicaMilicc";
			pass = "test123";

			HumanityHome.fillEmail(driver, username);
			HumanityHome.fillPass(driver, pass);
			HumanityHome.clickLogin2(driver);
			Thread.sleep(4000); 

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}
	
	@Test
	public void LoginButtonDoesNotWorkPASS() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			HumanityHome.clickLogin(driver);

			String email, pass;
			email = "xejisa2872@exserver.top";
			pass = "test123";

			HumanityHome.fillEmail(driver, email);
			HumanityHome.fillPass(driver, pass);
			HumanityHome.clickLoginWrong(driver);
			
			Thread.sleep(4000);

			System.out.println(driver.getCurrentUrl());

			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL); // app/dashboard, ulogovao se
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Test did not pass!");
		} finally {
			driver.quit();
		}
	}
}
