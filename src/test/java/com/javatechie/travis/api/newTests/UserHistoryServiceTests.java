package com.javatechie.travis.api.newTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHistoryServiceTests {

    WebDriver driver = new SafariDriver();

    @org.junit.jupiter.api.Test
    public void simpleTest() {
        driver.navigate().to("http://localhost:8080/userHistory");

//        driver.findElement(By.name("href")).sendKeys("5+6");
//        driver.findElement(By.name("button")).click();
//        (new WebDriverWait(driver,10)).until((ExpectedCondition<Boolean>) (WebDriver d) ->
//                d.getPageSource().contains("Ответ: 11"));
    }

}
