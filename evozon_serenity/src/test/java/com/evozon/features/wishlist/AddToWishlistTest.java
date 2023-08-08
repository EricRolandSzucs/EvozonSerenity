package com.evozon.features.wishlist;


import com.evozon.features.BaseTest;
import com.evozon.steps.AddProductSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToWishlistTest extends BaseTest {

    @Before
    public void navigateToProduct() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.clickOnProduct(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void validAddToWishlistTest(){
        wishlistSteps.addToWishlist();
        wishlistSteps.verifyProductIsAddedToWishlist(Constants.SIMPLE_PRODUCT);
    }
}
