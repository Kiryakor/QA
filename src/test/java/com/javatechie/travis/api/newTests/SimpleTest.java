package com.javatechie.travis.api.newTests;

import com.javatechie.travis.api.TravisCiCdApplication;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class SimpleTest extends TestBase {

    @BeforeClass
    public static void beforeTest() {
        try {
            initialize();
        } catch (IOException e) {
            System.out.println("Error while initializing the test");
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void afterTest() {
        driver.close();
    }

    @Test
    public void testEmptyFields() {
        navigateToRegistrationPage();

        getObject("register.submit").click();
        assertTrue(getObject("register.form").isDisplayed());
    }

    @Test
    public void testPasswordLessThanSixChar() {
        navigateToRegistrationPage();
    }


    @Test
    public void testRegistrationSuccess() {
        navigateToRegistrationPage();
    }
}