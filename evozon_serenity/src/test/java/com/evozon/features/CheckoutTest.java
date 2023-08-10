package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest() throws InterruptedException {
        registerSteps.doRegisterWithRandomData();
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.addProduct(Constants.SIMPLE_PRODUCT);
        checkoutSteps.clickOnCheckoutButton();

        checkoutSteps.completeBilling();
        checkoutSteps.completeShippingInformation();
        checkoutSteps.completeShippingMethod();
        checkoutSteps.completePayment();
        checkoutSteps.completeOrder();

        checkoutSteps.navigateToAdminPage();
        loginAdminSteps.doLogin(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
        checkoutSteps.navigateToOrdersInAdmin();
        checkoutSteps.verifyOrderIsPresent(Constants.USER_NAME);
    }
}

