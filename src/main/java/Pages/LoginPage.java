package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) { super(driver);}

    By UsernameBar = By.id("user-name");
    public void ClickOnUsernameBar() {driver.findElement(UsernameBar).click();}

    By PasswordBar = By.id("password");
    public void ClickOnPasswordBar() {driver.findElement(PasswordBar).click();}

    By EnterInAccountButton = By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button");
    public void ClickOnEnterInAccountButton() {driver.findElement(EnterInAccountButton).click();}

    By CloseTheLoginPageButton = By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > button > span:nth-child(1)");
    public void ClickOnCloseTheLoginPageButton() {driver.findElement(CloseTheLoginPageButton).click();}
}