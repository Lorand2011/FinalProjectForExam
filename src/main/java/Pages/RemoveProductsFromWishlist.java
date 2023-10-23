package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveProductsFromWishlist extends BasePage{

    public RemoveProductsFromWishlist(WebDriver driver) { super(driver);}

    By FirstProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnFirstProductRemoveButtonFromWishlist() {driver.findElement(FirstProductRemoveButtonFromWishlist).click();}

    By SecondProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnSecondProductRemoveButtonFromWishlist() {driver.findElement(SecondProductRemoveButtonFromWishlist).click();}

    By ThirdProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnThirdProductRemoveButtonFromWishlist() {driver.findElement(ThirdProductRemoveButtonFromWishlist).click();}

    By FourthProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnFourthProductRemoveButtonFromWishlist() {driver.findElement(FourthProductRemoveButtonFromWishlist).click();}

    By FifthProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnFifthProductRemoveButtonFromWishlist() {driver.findElement(FifthProductRemoveButtonFromWishlist).click();}

    By SixthProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnSixthProductRemoveButtonFromWishlist() {driver.findElement(SixthProductRemoveButtonFromWishlist).click();}

    By SeventhProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnSeventhProductRemoveButtonFromWishlist() {driver.findElement(SeventhProductRemoveButtonFromWishlist).click();}

    By EightProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(8) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnEightProductRemoveButtonFromWishlist() {driver.findElement(EightProductRemoveButtonFromWishlist).click();}

    By NinthProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnNinthProductRemoveButtonFromWishlist() {driver.findElement(NinthProductRemoveButtonFromWishlist).click();}

    By TenthProductRemoveButtonFromWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg");
    public void ClickOnTenthProductRemoveButtonFromWishlist() {driver.findElement(TenthProductRemoveButtonFromWishlist).click();}
}