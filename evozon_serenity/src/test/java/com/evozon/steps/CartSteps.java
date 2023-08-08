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
    public void checkQuantityIsUpdated(int quantity){
        cartPage.checkQuantityIsUpdated(quantity);
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
    public void checkProductIsDeleted(){
        Assert.assertTrue(cartPage.productIsDeleted());
    }
}