package browser;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	
	/* Necessary objects declared globally */
	public static WebDriver driver;
	public static WebElement element;
	public static WebDriverWait wait;
	public static Actions act;
	public static Select select;
	
	/**
	 * Open the browser based on the choice
	 */
	public static void openBrowser() {
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			act = new Actions(driver);
			
		} catch (Exception e) {
			System.out.println("Browser - openBrowser: " + e);
		}
	}
	public static void navigateToUrl() {
		try {
			String Url = Utility.properties("url");
			driver.get(Url);
			String title = driver.getTitle();
			wait.until(ExpectedConditions.titleIs(title));
			
		} catch (Exception e) {
			System.out.println("Browser - navigateToUrl: " + e);
		}
	}
	
	/**
	 * Close the browser
	 */
	public static void closeBrowser() {
		try {
			if (driver != null) {
				driver.quit();
				driver = null;  // ✅ Reset driver
			}
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser: " + e);
		}
	}
}
