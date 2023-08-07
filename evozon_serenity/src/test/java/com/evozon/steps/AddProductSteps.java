package com.evozon.steps;

import com.evozon.pages.*;
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


}