package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TryToLoginWithFalseAccount extends BasePage {

    @Test
    public void TryToLoginWithFalseAccount() throws InterruptedException {


        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg > path")).click();
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("false-username");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("false-password");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();

        String element;
        element = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Incorrect username or password!"));
    }
}