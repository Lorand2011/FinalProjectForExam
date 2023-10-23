package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageButtons extends BasePage{

    public WebPageButtons(WebDriver driver) { super(driver);}

    By LogoButton = By.cssSelector("#root > div > div:nth-child(1) > nav > a > svg > path");
    public void ClickOnLogoButton() {driver.findElement(LogoButton).click();}

    By CartButton = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path");
    public void ClickOnCartButton() {driver.findElement(CartButton).click();}

    By WishlistButton = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg > path");
    public void ClickOnWishlistButton() {driver.findElement(WishlistButton).click();}

    By LoginButton = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg > path");
    public void ClickOnLoginButton() {driver.findElement(LoginButton).click();}

    By SearchBar = By.id("input-search");
    public void ClickOnSearchBar() {driver.findElement(SearchBar).click();}

    By SortBar = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(2) > select");
    public void ClickOnSortBar() {driver.findElement(SortBar).click();}

    By DemoShopText = By.cssSelector("#root > div > div:nth-child(3) > nav > nav > div > div > a");
    public void ClickOnDemoShopText() {driver.findElement(DemoShopText).click();}

    By QuestionMarkButton = By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(1) > button > svg");
    public void ClickOnQuestionMarkButton() {driver.findElement(QuestionMarkButton).click();}

    By CloseButtonFromHelpPage = By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > button > span:nth-child(1)");
    public void ClickOnCloseButtonFromHelpPage() {driver.findElement(CloseButtonFromHelpPage).click();}

    By ResetButton = By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(2) > button > svg");
    public void ClickOnResetButton() {driver.findElement(ResetButton).click();}
}