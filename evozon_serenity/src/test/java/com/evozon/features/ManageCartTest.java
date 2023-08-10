package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class ManageCartTest extends BaseTest {

    @Test
    public void validUpdateQtyTest(){
        int quantity = 3;
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doAddToCartSimpleProduct();
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.doAddToCartConfigurableProduct();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity);
        cartSteps.clickUpdate();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.verifyQuantityIsUpdated(quantity);
    }

    @Test
    public void updateShoppingCartLinkTest(){
        int quantity1 = 3, quantity2 = 4;
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doAddToCartSimpleProduct();
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.doAddToCartConfigurableProduct();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity1);
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.emptyQuantityField();
        cartSteps.enterQuantity(quantity2);
        cartSteps.clickUpdateShoppingCartLink();
        cartSteps.identifyProduct(Constants.CONFIGURABLE_PRODUCT);
        cartSteps.verifyQuantityIsUpdated(quantity1);
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.verifyQuantityIsUpdated(quantity2);
    }

    @Test
    public void validRemoveFromCartTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doAddToCartVirtualProduct();
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doAddToCartSimpleProduct();
        cartSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        cartSteps.removeProductFromCart();
        cartSteps.verifyProductIsDeleted();
    }

    @Test
    public void validEmptyCartLinkTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doAddToCartVirtualProduct();
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.doAddToCartSimpleProduct();
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.doAddToCartConfigurableProduct();
        cartSteps.clickEmptyCartLink();
        cartSteps.verifyCartIsEmpty();
    }

    @Test
    public void validContinueShoppingLinkTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.doAddToCartVirtualProduct();
        cartSteps.clickContinueShoppingLink();
        String currentUrl = driver.getCurrentUrl();
        cartSteps.verifyUrlsAreIdentical(currentUrl);
    }
}
