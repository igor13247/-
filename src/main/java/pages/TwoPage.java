package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwoPage extends BasePage{
    @FindBy(xpath = ".//input[@value='oneway']")
    WebElement tripType;
    @FindBy(xpath = ".//select[@name='passCount']/option[@value='2']")
    WebElement passengers;
    @FindBy(xpath = ".//option[@value='Paris']")
    WebElement departingFrom;
    @FindBy(xpath = ".//select[@name='fromMonth']/option[@value='11']")
    WebElement on;
    @FindBy(xpath = ".//select[@name='fromDay']/option[@value='20']")
    WebElement on2;
    @FindBy(xpath = ".//select[@name='toPort']/option[@value='Seattle']")
    WebElement arrivingIn;
    @FindBy(xpath = ".//select[@name='toMonth']/option[@value='12']")
    WebElement returning;
    @FindBy(xpath = ".//select[@name='toDay']/option[@value='19']")
    WebElement returning2;
    @FindBy(xpath = ".//input[@value='Business']")
    WebElement serviceClass;
    @FindBy(xpath = ".//select[@name='airline']/select.selectbyvisibletext(Pangea Airlines)")
    WebElement airline;
    @FindBy(xpath = ".//input[@name='findFlights']")
    WebElement continue1;

    public TwoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Вторая страница
    public void flightfingder2() {
        waitClickable(continue1);
        tripType.click();
        passengers.click();
        departingFrom.click();
        on.click();
        on2.click();
        arrivingIn.click();
        returning.click();
        returning2.click();
        serviceClass.click();
        //airline.click();
        continue1.click();
    }
}
