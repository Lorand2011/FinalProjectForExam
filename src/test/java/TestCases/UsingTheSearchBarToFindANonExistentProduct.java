package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingTheSearchBarToFindANonExistentProduct extends BasePage {

    @Test
    public void UsingTheSearchBarToFindANonExistentProduct() throws InterruptedException {


        driver.findElement(By.id("input-search")).click();
        driver.findElement(By.id("input-search")).sendKeys("book");
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(1) > button")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(1) > div > div")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains(""));
    }
}