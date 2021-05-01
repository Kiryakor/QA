package com.javatechie.travis.api.newTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialTest {

    private WebDriver driver;

    @Test ()
    public void test() {
        driver = new ChromeDriver();
        if (driver != null) {
            driver.quit();
        }
    }
}

