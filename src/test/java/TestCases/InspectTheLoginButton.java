package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InspectTheLoginButton extends BasePage {

    @Test
    public void InspectTheLoginButton() throws InterruptedException {


        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > div > small")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Login"));
    }
}