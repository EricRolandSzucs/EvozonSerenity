package com.evozon.steps;

import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AddProductSteps extends BaseSteps {

    @Step
    public void searchForProduct(String product) {
        homePage.setSearchField(product);
        homePage.submitSearchField();
    }

    @Step
    public void addProduct(String product) {
        productGridPage.clickAddToCartButton(product);
    }

    @Step
    public void clickOnProduct() {
        productGridPage.clickConfigurableProductPageLink();
    }

    @Step
    public void selectProductOptions() {
        productPage.clickColorOptionButton();
        productPage.clickSizeOptionButton();
    }

    @Step
    public void addProductFromPage() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void verifyProductWasAdded(String product) {
        cartPage.isProductAdded(product);
    }

    @Step
    public void doValidAddToCartSimpleProduct(){
        searchForProduct(Constants.SIMPLE_PRODUCT);
        addProduct(Constants.SIMPLE_PRODUCT);
        verifyProductWasAdded(Constants.SIMPLE_PRODUCT);
    }

    @Step
    public void doValidAddToCartConfigurableProduct(){
        searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        clickOnProduct();
        selectProductOptions();
        addProductFromPage();
        verifyProductWasAdded(Constants.CONFIGURABLE_PRODUCT);
    }

    @Step
    public void doValidAddToCartVirtualProduct(){
        searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProduct(Constants.VIRTUAL_PRODUCT);
        verifyProductWasAdded(Constants.VIRTUAL_PRODUCT);
    }

}