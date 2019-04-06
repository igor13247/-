package ru.defiveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NewPage;
import pages.TwoPage;

public class First extends WebDriverSettings{

    @Test
    public void firsttest() {
        driver.get("http://newtours.demoaut.com/");
    }

    @Test
    public void loginFromMainPage() throws InterruptedException {
        NewPage login = new NewPage(driver);
        System.out.println("Я тут");
        login.login("test1", "test1");
        System.out.println("Я тут2");
        Thread.sleep(20000);
    }

    @Test
    public void FlightFinder() {
        TwoPage Flight = new TwoPage(driver);
        //Flight.
    }
}