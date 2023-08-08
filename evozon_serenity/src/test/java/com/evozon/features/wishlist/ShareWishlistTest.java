package com.evozon.features.wishlist;

import com.evozon.features.BaseTest;
import com.evozon.utils.Constants;
import org.junit.Before;
import org.junit.Test;

public class ShareWishlistTest extends BaseTest {
    @Before
    public void navigateToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.clickOnProduct(Constants.SIMPLE_PRODUCT);
        wishlistSteps.addToWishlist();
    }

    @Test
    public void validShare() {
        wishlistSteps.shareWishlist();
        wishlistSteps.setEmailTextArea("fake@gmail.com");
        wishlistSteps.submitShare();
        wishlistSteps.verifyWishlistIsShared();
    }
}
