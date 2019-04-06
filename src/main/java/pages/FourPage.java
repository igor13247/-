package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourPage extends BasePage{
    @FindBy(xpath = ".//input[@name='passFirst0']")
    WebElement firstName0;
    @FindBy(xpath = ".//input[@name='passLast0']")
    WebElement lastName0;
    @FindBy(xpath = ".//select[@name='pass.0.meal']/option[@value='HNML']")
    WebElement meal0;
    @FindBy(xpath = ".//input[@name='passFirst1']")
    WebElement firstName1;
    @FindBy(xpath = ".//input[@name='passLast1']")
    WebElement lastName1;
    @FindBy(xpath = ".//select[@name='pass.1.meal']/option[@value='BLML']")
    WebElement meal1;
    @FindBy(xpath = ".//select[@name='creditCard']/option[@value='BA']")
    WebElement cardType;
    @FindBy(xpath = ".//input[@name='creditnumber']")
    WebElement number;
    @FindBy(xpath = ".//select[@name='cc_exp_dt_mn']/select.selectByVisibleText('05')")
    WebElement expiration1;
    @FindBy(xpath = ".//select[@name='cc_exp_dt_yr']/select.selectByVisibleText('2009')")
    WebElement expiration2;
    @FindBy(xpath = ".//input[@name='cc_frst_name']")
    WebElement firstName ;
    @FindBy(xpath = ".//input[@name='cc_mid_name']")
    WebElement middle0;
    @FindBy(xpath = ".//input[@name='cc_last_name']")
    WebElement last0;

    @FindBy(xpath = ".//input[@name='billAddress1']")
    WebElement address1;
    @FindBy(xpath = ".//input[@name='billCity']")
    WebElement city1;
    @FindBy(xpath = ".//input[@name='billState']")
    WebElement state1;
    @FindBy(xpath = ".//input[@name='billZip']")
    WebElement province1;
    @FindBy(xpath = ".//input[@value='215']")
    WebElement country1;
    @FindBy(xpath = ".//input[@value='checkbox']")
    WebElement checkbox;

    @FindBy(xpath = ".//input[@name='delAddress1']")
    WebElement address2;
    @FindBy(xpath = ".//input[@name='delCity']")
    WebElement city2;
    @FindBy(xpath = ".//input[@name='delState']")
    WebElement state2;
    @FindBy(xpath = ".//input[@name='delZip']")
    WebElement province2;
    @FindBy(xpath = ".//input[@value='215']")
    WebElement country2;
    @FindBy(xpath = ".//input[@name='buyFlights']")
    WebElement securePurchase;

    public FourPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Вторая страница
    public void flightfingder4(String login1, String login2,
                               String login3, String login4,
                               String creditnumber, String firstname,
                               String middle, String last, String address11,
                               String city11, String state11, String province11,
                               String address22, String city22,
                               String state22, String province22) {
        waitClickable(securePurchase);
        firstName0.sendKeys(login1);
        lastName0.sendKeys(login2);
        meal0.click();
        firstName1.sendKeys(login3);
        lastName1.sendKeys(login4);
        meal1.click();
        cardType.click();
        number.sendKeys(creditnumber);
        //expiration1.click();
        //expiration2.click();
        firstName.sendKeys(firstname);
        middle0.sendKeys(middle);
        last0.sendKeys(last);
        address1.sendKeys(address11);
        city1.sendKeys(city11);
        state1.sendKeys(state11);
        province1.sendKeys(province11);
        //country1.click();
        checkbox.click();
        address2.sendKeys(address22);
        city2.sendKeys(city22);
        state2.sendKeys(state22);
        province2.sendKeys(province22);
        //country2.click();
        securePurchase.click();

    }
}
