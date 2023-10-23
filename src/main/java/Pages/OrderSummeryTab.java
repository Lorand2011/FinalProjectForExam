package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummeryTab extends BasePage{

    public OrderSummeryTab(WebDriver driver) { super(driver);}

    By CancelButton2 = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a.btn.btn-danger");
    public void ClickOnCancelButton2() {driver.findElement(CancelButton2).click();}

    By CompleteYourOrderButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a.btn.btn-success");
    public void ClickOnCompleteYourOrderButton() {driver.findElement(CompleteYourOrderButton).click();}
}