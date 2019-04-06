package ru.defiveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NewPage;

public class WebDriverSettings {
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
    }

    @Test
    public void loginFromMainPage() throws InterruptedException {
        NewPage login = new NewPage(driver);
        System.out.println("Я тут");
        login.login("test1", "test1");
        Thread.sleep(20000);
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("test close");
        driver.quit();
    }
}
