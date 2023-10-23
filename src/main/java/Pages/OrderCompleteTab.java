package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderCompleteTab extends BasePage{

    public OrderCompleteTab(WebDriver driver) { super(driver);}

    By ContinueShoppingButton2 = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a");
    public void ClickOnContinueShoppingButton2() {driver.findElement(ContinueShoppingButton2).click();}
}