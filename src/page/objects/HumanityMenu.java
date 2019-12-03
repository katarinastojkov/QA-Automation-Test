package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL = "https://mica.humanity.com/app/dashboard/";
	private static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";

	// Staff btn
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
}
