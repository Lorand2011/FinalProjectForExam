package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsCartButtons extends BasePage{

    public ProductsCartButtons(WebDriver driver) { super(driver);}

    By FirstProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnFirstProductCartButton() {driver.findElement(FirstProductCartButton).click();}

    By SecondProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnSecondProductCartButton() {driver.findElement(SecondProductCartButton).click();}

    By ThirdProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnThirdProductButton() {driver.findElement(ThirdProductCartButton).click();}

    By FourthProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnFourthProductCartButton() {driver.findElement(FourthProductCartButton).click();}

    By FifthProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnFifthProductButton() {driver.findElement(FifthProductCartButton).click();}

    By SixthProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnSixthProductCartButton() {driver.findElement(SixthProductCartButton).click();}

    By SeventhProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnSeventhProductButton() {driver.findElement(SeventhProductCartButton).click();}

    By EightProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(8) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnEightProductCartButton() {driver.findElement(EightProductCartButton).click();}

    By NinthProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnNinthProductButton() {driver.findElement(NinthProductCartButton).click();}

    By TenthProductCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void ClickOnTenthProductButton() {driver.findElement(TenthProductCartButton).click();}
}