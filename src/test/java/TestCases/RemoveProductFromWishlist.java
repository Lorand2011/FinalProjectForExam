package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProductFromWishlist extends BasePage {

    @Test
    public void RemoveProductFromWishlist() throws InterruptedException {


        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-center.card-body > a")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(5) > button > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("How about adding some products in your cart?"));
    }
}