package ru.defiveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.FourPage;
import pages.NewPage;
import pages.TreePage;
import pages.TwoPage;

public class First {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/наталья/Desktop/123/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    @Test
    public void firsttest() {
        driver.get("http://newtours.demoaut.com/");
        NewPage login = new NewPage(driver);
        login.login("test1", "test1");
        //Thread.sleep(20000);
        TwoPage Flight2 = new TwoPage(driver);
        Flight2.flightfingder2();
        TreePage Flight3 = new TreePage(driver);
        Flight3.flightfingder3();
        FourPage Flight4 = new FourPage(driver);
        Flight4.flightfingder4("Ivanov", "Ivan","Ivanova", "Irina", "5479540454132487","Ivan", "Ivanovich", "Ivanov", "1085 BorregasAve.", "1085 BorregasAve", "1085 BorregasAve", "94089", "1225 Borregas Ave.", "Boston", "Massachusetts", "91089");




        /*String y = "xpath = \".//input[@value='oneway']\"";
        String z = TreePage.selectflight2();
        //String y = Flight2.(String y);
        String x = "Paris to Seattle";
        Assert.assertArrayEquals(z, x);
        Assert.assertArrayEquals(z, x);*/

    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("test close");
        driver.quit();
    }
}