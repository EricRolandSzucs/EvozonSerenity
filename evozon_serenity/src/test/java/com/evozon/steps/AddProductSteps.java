package com.evozon.steps;

import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AddProductSteps extends BaseSteps {

    @Step
    public void addProduct(String product) {
        productGridPage.clickAddToCartButton(product);
    }

    @Step
    public void clickOnProduct(String product) {
        productGridPage.clickProductPageLink(product);
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
        addProduct(Constants.SIMPLE_PRODUCT);
        verifyProductWasAdded(Constants.SIMPLE_PRODUCT);
    }

    @Step
    public void doValidAddToCartConfigurableProduct(){
        clickOnProduct(Constants.CONFIGURABLE_PRODUCT);
        selectProductOptions();
        addProductFromPage();
        verifyProductWasAdded(Constants.CONFIGURABLE_PRODUCT);
    }

    @Step
    public void doValidAddToCartVirtualProduct(){
        addProduct(Constants.VIRTUAL_PRODUCT);
        verifyProductWasAdded(Constants.VIRTUAL_PRODUCT);
    }

}