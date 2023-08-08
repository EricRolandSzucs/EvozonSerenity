package com.evozon.features.wishlist;

import com.evozon.features.BaseTest;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RemoveFromWishlistTest extends BaseTest {

    @Before
    public void navigateToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.clickOnProduct(Constants.SIMPLE_PRODUCT);
        wishlistSteps.addToWishlist();
    }

    @Test
    public void validRemoveFromWishlistTest(){
        wishlistSteps.identifyProduct(Constants.SIMPLE_PRODUCT);
        wishlistSteps.deleteProductFromWishlist();
        wishlistSteps.verifyProductIsDeleted();
    }
}
