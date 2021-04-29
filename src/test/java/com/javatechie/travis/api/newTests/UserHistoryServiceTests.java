package com.javatechie.travis.api.newTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserHistoryServiceTests {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test5() {
        driver.get("http://localhost:8080/userhistory");
    }

    @Test
    public void test4() {
        driver.get("http://localhost:8080/userhistory");
    }

    @Test
    public void test3() {
        driver.get("http://localhost:8080/userhistory");
    }
    @Test
    public void test2() {
        driver.get("http://localhost:8080/userhistory");
    }

    @Test
    public void test1() {
        driver.get("http://localhost:8080/userhistory");
    }
}