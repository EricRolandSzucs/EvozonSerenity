package com.evozon.features;

import com.evozon.steps.AddProductSteps;
import com.evozon.steps.CheckoutSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.SearchSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.addProduct(Constants.SIMPLE_PRODUCT);
        checkoutSteps.clickOnCheckoutButton();

        checkoutSteps.completeBilling();
        checkoutSteps.completeShippingInformation();
        checkoutSteps.completeShippingMethod();
        checkoutSteps.completePayment();
        checkoutSteps.completeOrder();

        checkoutSteps.verifyOrderIsPlaced();
    }
}

