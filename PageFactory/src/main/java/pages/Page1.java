package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import browser.Browser;
import locaters.Page1Objects;

public class Page1 extends Browser {

	public static Page1Objects obj; // ✅ Made public and static
	public static WebDriverWait wait;

	// Static block to initialize objects
	static {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
			obj = new Page1Objects(driver); 
		} catch (Exception e) {
			System.out.println("Error initializing Page1: " + e);
		}
	}

	public static String Title() {
		return driver.getTitle();
	}

	public static void enterusername(String str) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj.userName));
			obj.userName.sendKeys(str);
		} catch (Exception e) {
			System.out.println("Username Error: " + e);
		}
	}

	public static void enterpassword(String str) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj.password));
			obj.password.sendKeys(str);
		} catch (Exception e) {
			System.out.println("Password Error: " + e);
		}
	}

	public static void click() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(obj.loginbutton));
			obj.loginbutton.click();
		} catch (Exception e) {
			System.out.println("Click Error: " + e);
		}
	}
}
