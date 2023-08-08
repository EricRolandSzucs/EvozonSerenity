package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class ManageCartTest extends BaseTest {

    @Test
    public void validUpdateQty(){
        int quantity = 3;
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doValidAddToCartSimpleProduct();
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
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
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doValidAddToCartVirtualProduct();
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doValidAddToCartSimpleProduct();
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.removeProductFromCart();
        cartSteps.checkProductIsDeleted();
    }
}
