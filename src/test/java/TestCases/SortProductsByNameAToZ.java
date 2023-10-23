package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortProductsByNameAToZ extends BasePage {

    @Test
    public void SortProductsByNameAToZ() throws InterruptedException {


        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2)")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Sort by name (A to Z)"));
    }
}