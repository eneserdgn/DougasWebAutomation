package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductsPage {
    ElementHelper elementHelper;

    public ProductsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By btn_Filter = By.cssSelector(".facet__title>font>font");
    private By txtbx_Filter = By.cssSelector(".facet__menu .input__input");
    private By list_Filter = By.cssSelector(".facet-option__checkbox--rating-stars>div>font>font");

    public void clickFilter(String filter) {
        elementHelper.clickElementWithText(btn_Filter, filter);
    }

    public void sendKeysFilterTextBox(String text) {
        elementHelper.sendKeys(txtbx_Filter, text);
    }

    public void selectFilter(String filter) {
        elementHelper.clickElementWithText(list_Filter, filter);
    }
}
