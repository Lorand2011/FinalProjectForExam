package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingSearchBarToFindAProduct extends BasePage {

    @Test
    public void UsingSearchBarToFindAProduct() throws InterruptedException {


        driver.findElement(By.id("input-search")).click();
        driver.findElement(By.id("input-search")).sendKeys("Incredible Concrete Hat");
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(1) > button")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div > div > div.text-center.card-body > a")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Incredible Concrete Hat"));
    }
}