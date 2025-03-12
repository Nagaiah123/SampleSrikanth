package locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Page1Objects {

    public static WebDriver driver;

    public Page1Objects(WebDriver driver) {
        Page1Objects.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name ='username']")
    public WebElement userName; 

    @FindBy(name = "password")
    public WebElement password; 
    @FindBy(css = "[type=\"submit\"]")
    public WebElement loginbutton;
}
