package com.evozon.features.Wishlist;

import com.evozon.features.BaseTest;
import com.evozon.utils.Constants;
import org.junit.Before;
import org.junit.Test;

public class QuantityChangeWishlistTest extends BaseTest {
    @Before
    public void navigateToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.clickOnProduct(Constants.SIMPLE_PRODUCT);
        wishlistSteps.addToWishlist();
    }

    @Test
    public void validQuantityChange() {
        wishlistSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        String quantity = String.valueOf(wishlistSteps.getQuantityField() + 1);
        wishlistSteps.changeProductQuantity(quantity);
        wishlistSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        wishlistSteps.verifyQuantityChange(quantity);
    }

}
