package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class ManageCartTest extends BaseTest {

    @Test
    public void validUpdateQty(){
        int quantity = 3;
        addProductSteps.doValidAddToCartSimpleProduct();
        addProductSteps.doValidAddToCartConfigurableProduct();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity);
        cartSteps.clickUpdate();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.checkQuantityIsUpdated(quantity);
    }

    @Test
    public void validRemoveFromCart(){
        addProductSteps.doValidAddToCartVirtualProduct();
        addProductSteps.doValidAddToCartSimpleProduct();
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.removeProductFromCart();
        cartSteps.checkProductIsDeleted();
    }
}
