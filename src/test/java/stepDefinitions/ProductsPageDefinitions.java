package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ProductsPage;
import utils.DriverFactory;

public class ProductsPageDefinitions {

    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    @When("select on {string} Marke on Products Page")
    public void selectOnMarkeOnProductsPage(String marke) {
        productsPage.clickFilter("Marke");
        productsPage.sendKeysFilterTextBox(marke);
        productsPage.selectFilter(marke);

    }

    @When("select on {string} Producart on Products Page")
    public void selectOnProducartOnProductsPage(String producart) {
        productsPage.clickFilter("Producart");
        productsPage.sendKeysFilterTextBox(producart);
        productsPage.selectFilter(producart);
    }

    @When("select on {string} Geschenk fur on Products Page")
    public void selectOnGeschenkFurOnProductsPage(String geschenkFur) {
        productsPage.clickFilter("Geschenk fur");
        productsPage.sendKeysFilterTextBox(geschenkFur);
        productsPage.selectFilter(geschenkFur);
    }

    @When("select on {string} Fur Wen on Products Page")
    public void selectOnFurWenOnProductsPage(String furWen) {
        productsPage.clickFilter("Fur Web");
        productsPage.sendKeysFilterTextBox(furWen);
        productsPage.selectFilter(furWen);
    }
}
