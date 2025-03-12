package testCaseDemo;

import browser.Browser;
import pages.Page1;
import pages.Page2;
import screenshot.Capture;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		Browser.openBrowser();
		Browser.navigateToUrl();
		Thread.sleep(5000);
		Page1.enterusername("Admin");
		Capture.screenShot("username");
		Page1.enterpassword("admin123");

		if(Page1.Title().equals("OrangeHRM"))
		{
			System.out.println("Title matched with expected");
		}
		else
		{
			System.out.println("Title is not matched with expected");
			
		}
		Page1.click();
		
		if(Page2.Username().equals("manda user"))
		{
			System.out.println("user matched with expected");
		}
		else
		{
			System.out.println("login user namepage2: "+Page2.Username());
			
		}
		Capture.screenShot("page2");
		Page2.optionclick("time");
		
		Browser.closeBrowser();
		

	}

}