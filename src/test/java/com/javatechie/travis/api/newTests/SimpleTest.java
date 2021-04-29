package com.javatechie.travis.api.newTests;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimpleTest {

    public static String URL;
    public static WebDriver driver;

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
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testA_addSuccesss(){
    }
}