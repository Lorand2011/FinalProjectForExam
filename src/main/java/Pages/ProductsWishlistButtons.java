package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsWishlistButtons extends BasePage{

    public ProductsWishlistButtons(WebDriver driver) { super(driver);}

    By FirstProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnFirstProductWishlistButton() {driver.findElement(FirstProductWishlistButton).click();}

    By SecondProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnSecondProductWishlistButton() {driver.findElement(SecondProductWishlistButton).click();}

    By ThirdProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnThirdProductWishlistButton() {driver.findElement(ThirdProductWishlistButton).click();}

    By FourthProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnFourthProductWishlistButton() {driver.findElement(FourthProductWishlistButton).click();}

    By FifthProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnFifthProductWishlistButton() {driver.findElement(FifthProductWishlistButton).click();}

    By SixthProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnSixthProductWishlistButton() {driver.findElement(SixthProductWishlistButton).click();}

    By SeventhProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnSeventhProductWishlistButton() {driver.findElement(SeventhProductWishlistButton).click();}

    By EightProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(8) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnEightProductWishlistButton() {driver.findElement(EightProductWishlistButton).click();}

    By NinthProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnNinthProductWishlistButton() {driver.findElement(NinthProductWishlistButton).click();}

    By TenthProductWishlistButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");
    public void ClickOnTenthProductWishlistButton() {driver.findElement(TenthProductWishlistButton).click();}
}