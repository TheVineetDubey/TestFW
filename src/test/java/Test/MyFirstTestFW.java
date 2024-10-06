package Test;

import Pages.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyFirstTestFW extends BaseTest {

    @Test
    public static void  LoginTest() throws InterruptedException {

        driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
        driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys("dubeyvineet058@gmail.com");
        driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("tester@123");
        Thread.sleep(4000);
        driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
        Thread.sleep(4000);

    }
}
