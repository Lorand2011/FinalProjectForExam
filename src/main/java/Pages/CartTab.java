package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartTab extends BasePage{

    public CartTab(WebDriver driver) { super(driver);}

    By IncreaseTheQuantityButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(1) > div > button:nth-child(2) > svg");
    public void ClickOnIncreaseTheQuantityButton() {driver.findElement(IncreaseTheQuantityButton).click();}

    By DecreaseTheQuantityButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(1) > div > button:nth-child(1) > svg");
    public void ClickOnDecreaseTheQuantityButton() {driver.findElement(DecreaseTheQuantityButton).click();}

    By RemoveFromCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(5) > button > svg > path");
    public void ClickRemoveFromCartButton() {driver.findElement(RemoveFromCartButton).click();}

    By ContinueToShoppingButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > a.btn.btn-danger");
    public void ContinueToShoppingButton() {driver.findElement(ContinueToShoppingButton).click();}

    By CheckoutButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > a.btn.btn-success");
    public void CheckoutButton() {driver.findElement(CheckoutButton).click();}
}