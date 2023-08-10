package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void emptyQuantityField(){
        cartPage.clearQuantityField();
    }

    @Step
    public void enterQuantity(int quantity){
        cartPage.setQuantityField(quantity);
    }

    @Step
    public void clickUpdate(){
        cartPage.clickUpdateButton();
    }

    @Step
    public void verifyQuantityIsUpdated(int quantity){
        cartPage.verifyQuantityIsUpdated(quantity);
    }

    @Step
    public void identifyProduct(String name){
        cartPage.identifyProduct(name);
    }

    @Step
    public void removeProductFromCart(){
        cartPage.clickRemoveButton();
    }

    @Step
    public void verifyProductIsDeleted(){
        Assert.assertTrue(cartPage.productIsDeleted());
    }

    @Step
    public void clickEmptyCartLink(){
        cartPage.clickEmptyCartLink();
    }

    @Step
    public void verifyCartIsEmpty(){
        Assert.assertTrue(cartPage.verifyCartIsEmpty());
    }

    @Step
    public void clickUpdateShoppingCartLink(){
        cartPage.clickUpdateShoppingCartLink();
    }

    @Step
    public void clickContinueShoppingLink(){
        cartPage.clickContinueShoppingLink();
    }

    @Step
    public void verifyUrlsAreIdentical(String currentUrl){
        homePage.verifyUrlsAreIdentical(currentUrl);
    }
}