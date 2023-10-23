package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAsUserWithBugs extends BasePage {

    @Test
    public void LoginAsUserWithBugs() throws InterruptedException {


        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg > path")).click();
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("beetle");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("choochoo");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();

        String element;
        element = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > a")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("beetle"));
    }
}