package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InspectTheResetButton extends BasePage {

    @Test
    public void InspectTheResetButton() throws InterruptedException {


        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(2) > button > svg")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains(""));
    }
}