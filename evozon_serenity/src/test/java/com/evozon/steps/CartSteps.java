package com.evozon.steps;

import net.thucydides.core.annotations.Step;

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
    public void verifyQuantityWasUpdated(int quantity){
        cartPage.verifyQuantityWasUpdated(quantity);
    }
}