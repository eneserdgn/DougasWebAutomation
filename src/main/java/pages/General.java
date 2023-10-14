package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class General {
    ElementHelper elementHelper;

    public General(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By btn_AcceptOnCookie = By.cssSelector(".button.button__primary.uc-list-button__accept-all");
    private By list_tabsOnNavigationBar = By.cssSelector(".link.link--nav-heading.navigation-main-entry__link>font>font");

    public void clickTabOnNavigationBar(String tab) {
        elementHelper.clickElementWithText(list_tabsOnNavigationBar, tab);
    }

    public void clickAcceptOnCookies() {
        elementHelper.click(btn_AcceptOnCookie);
    }
}
