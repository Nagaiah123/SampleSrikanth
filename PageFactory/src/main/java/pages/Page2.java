package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import locaters.Page2Objects;
import browser.Browser;

public class Page2 extends Browser {
	
		public static Page2Objects obj;
		
		
		public static String Username()
		{
			obj = new Page2Objects();
			
			wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardelement));
			return obj.dashboardelement.getText();
		}
	
		//clicking method
	
		public static void optionclick(String str) 
		{
			
			try{
				for(WebElement e:obj.list)
				{
					if(e.getText().equalsIgnoreCase(str))
					{	e.click();
						break; }
				}
				}
			
			catch(Exception E)
			{
				System.out.println("Click :"+E);
			}
			
			
		}
			

}