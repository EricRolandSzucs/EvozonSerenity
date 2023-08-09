package com.evozon.steps;

import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;

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
    public void selectSizeOption(String size){
        productPage.clickParameterSizeOptionButton(size);
    }

    @Step
    public void selectColorOption(String color){
        productPage.clickParameterColorOptionButton(color);
    }

    @Step
    public void selectDropdownOption(String option) {
        productPage.clickParameterOption(option);
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
    public void doAddToCartSimpleProduct(){
        addProduct(Constants.SIMPLE_PRODUCT);
        verifyProductWasAdded(Constants.SIMPLE_PRODUCT);
    }

    @Step
    public void doAddToCartConfigurableProduct(){
        clickOnProduct(Constants.CONFIGURABLE_PRODUCT);
        selectProductOptions();
        addProductFromPage();
        verifyProductWasAdded(Constants.CONFIGURABLE_PRODUCT);
    }

    @Step
    public void doAddToCartVirtualProduct(){
        addProduct(Constants.VIRTUAL_PRODUCT);
        verifyProductWasAdded(Constants.VIRTUAL_PRODUCT);
    }

}