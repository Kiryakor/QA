package newTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHistoryServiceTests {

    WebDriver driver = new ChromeDriver();

    @Test
    public void simpleTest() {
        driver.navigate().to("http://localhost:8080");

        driver.findElement(By.name("href")).sendKeys("5+6");
        driver.findElement(By.name("button")).click();
        (new WebDriverWait(driver,10)).until((ExpectedCondition<Boolean>) (WebDriver d) ->
                d.getPageSource().contains("Ответ: 11"));
    }

}
