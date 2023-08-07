package com.evozon.features;

import org.junit.Test;

public class ManageCartTest extends BaseTest {

    @Test
    public void validUpdateQty(){
        int quantity = 3;
        addProductSteps.doValidAddToCartSimpleProduct();
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity);
        cartSteps.clickUpdate();
        cartSteps.verifyQuantityWasUpdated(quantity);
    }
}
