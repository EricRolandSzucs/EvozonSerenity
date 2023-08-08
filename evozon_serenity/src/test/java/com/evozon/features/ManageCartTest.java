package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class ManageCartTest extends BaseTest {

    @Test
    public void validUpdateQtyTest(){
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
    public void updateShoppingCartLinkTest(){
        int quantity1 = 3, quantity2 = 4;
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doValidAddToCartSimpleProduct();
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.doValidAddToCartConfigurableProduct();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity1);
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity2);
        cartSteps.clickUpdateShoppingCartLink();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.checkQuantityIsUpdated(quantity1);
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.checkQuantityIsUpdated(quantity2);
    }

    @Test
    public void validRemoveFromCartTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doValidAddToCartVirtualProduct();
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doValidAddToCartSimpleProduct();
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.removeProductFromCart();
        cartSteps.checkProductIsDeleted();
    }

    @Test
    public void validEmptyCartLinkTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doValidAddToCartVirtualProduct();
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doValidAddToCartSimpleProduct();
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.doValidAddToCartConfigurableProduct();
        cartSteps.clickEmptyCartLink();
        cartSteps.checkCartIsEmpty();
    }

    @Test
    public void validContinueShoppingLinkTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doValidAddToCartVirtualProduct();
        cartSteps.clickContinueShoppingLink();
        String currentUrl = driver.getCurrentUrl();
        cartSteps.checkUrlIsMatched(currentUrl);
    }
}
