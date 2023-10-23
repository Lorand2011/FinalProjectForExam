package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortOptions extends BasePage{

    public SortOptions(WebDriver driver) { super(driver);}

    By SortByNameAToZ = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(1)");
    public void ClickOnSortByNameAToZ() {driver.findElement(SortByNameAToZ).click();}

    By SortByNameZToA = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(2)");
    public void ClickOnSortByNameZToA() {driver.findElement(SortByNameZToA).click();}

    By SortByPriceLowToHigh = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(3)");
    public void ClickOnSortByPriceLowToHigh() {driver.findElement(SortByPriceLowToHigh).click();}

    By SortByPriceHighToLow = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select > option:nth-child(4)");
    public void ClickOnSortByPriceHighToLow() {driver.findElement(SortByPriceHighToLow).click();}
}