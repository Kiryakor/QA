package com.javatechie.travis.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class New {

    @org.junit.jupiter.api.Test
    void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

    @org.junit.jupiter.api.Test
    void test2() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

    @org.junit.jupiter.api.Test
    void test3() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
