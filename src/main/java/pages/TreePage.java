package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage extends BasePage{
    @FindBy(xpath = ".//p[@align='center']/input[@name='reserveFlights']")
    WebElement continue1;

    public TreePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Вторая страница
    public void flightfingder3() {
        waitClickable(continue1);
        continue1.click();
    }
}
