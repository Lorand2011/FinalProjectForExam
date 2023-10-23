package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductFromWishlistToCart extends BasePage {

    @Test
    public void AddProductFromWishlistToCart() throws InterruptedException {


        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg > path")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path")).click();

        String element;
        element = driver.findElement(By.id("item_3_title_link")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Awesome Metal Chair"));
    }
}