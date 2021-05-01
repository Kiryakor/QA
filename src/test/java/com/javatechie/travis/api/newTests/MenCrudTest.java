package com.javatechie.travis.api.newTests;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenCrudTest {

    public static String URL;
    public static WebDriver driver;

    public MenCrudTest() {
        System.out.println("\n\n          Contructor del test\n\n");
    }

    @BeforeClass
    public static void setUpClass() {
    }


    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }

    @Before
    public void setUp() {
        URL = "https://mern-crud.herokuapp.com/";

        //travis
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();

        /*
        System.out.println("\n\n ------- before ------- ");
        System.out.println(" ------- "+this.yaInicie+" ------- \n\n");

        if(this.yaInicie == false){
            driver.get(URL);

            WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/button"));
            button.click();
            this.settingUpTestAddFail();
            this.settingUpTestEdit();
            this.settingUpTestDelete();
            this.settingUpTestDelete2();
            this.waitMoment();
            driver.close();
        }
        */
    }

    @After
    public void tearDown() {
        driver.close();

    }

    @Test
    public void testA_addSuccesss() {
        System.out.print("\n \n\n --------      add success     ------- \n\n\n");
        driver.get(URL);
    }
}