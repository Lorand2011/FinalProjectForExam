package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTab extends BasePage{

    public CheckoutTab(WebDriver driver) { super(driver);}

    By FirstNameBar = By.id("first-name");
    public void ClickOnFirstNameBar() {driver.findElement(FirstNameBar).click();}

    By LastNameBar = By.id("last-name");
    public void ClickOnLastNameBar() {driver.findElement(LastNameBar).click();}

    By AddressBar = By.id("address");
    public void ClickOnAddressBar() {driver.findElement(AddressBar).click();}

    By CancelButton = By.cssSelector("#root > div > div:nth-child(2) > form > div > div:nth-child(2) > a");
    public void ClickOnCancelButton() {driver.findElement(CancelButton).click();}

    By ContinueCheckoutButton = By.cssSelector("#root > div > div:nth-child(2) > form > div > div:nth-child(2) > button");
    public void ClickOnContinueCheckoutButton() {driver.findElement(ContinueCheckoutButton).click();}
}