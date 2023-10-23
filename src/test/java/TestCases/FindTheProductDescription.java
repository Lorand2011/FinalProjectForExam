package TestCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindTheProductDescription extends BasePage {

    @Test
    public void FindTheProductDescription() throws InterruptedException {


        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-center.card-body > a")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > p")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Vero quia nesciunt laborum velit. Et in ipsum quia harum nihil aliquid officiis. Porro ea officia corporis."));
    }
}