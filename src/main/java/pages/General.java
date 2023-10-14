package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class General {
    ElementHelper elementHelper;

    public General(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By element = By.cssSelector("");

    public void method(){

    }
}
