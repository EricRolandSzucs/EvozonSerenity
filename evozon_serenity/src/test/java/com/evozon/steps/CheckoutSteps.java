package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void searchForProduct(String product) {
        homePage.setSearchField(product);
        homePage.submitSearchField();
    }

    @Step
    public void addProduct(String product) {
        productGridPage.clickAddToCartButton(product);
    }

    @Step
    public void clickOnCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @Step
    public void completeBilling() {
        checkoutPage.setDifferentAddressRadioButton();
        checkoutPage.clickBillingContinueButton();
    }

    @Step
    public void completeShippingInformation() {
        checkoutPage.clickShippingInformationContinueButton();
    }

    @Step
    public void completeShippingMethod() {
        checkoutPage.setShippingRadioButton();
        checkoutPage.clickShippingMethodContinueButton();
    }

    @Step
    public void completePayment() {
        checkoutPage.clickPaymentContinueButton();
    }

    @Step
    public void completeOrder() {
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void verifyOrderIsPlaced(){
        Assert.assertTrue(checkoutPage.isOrderPlaced());
    }

    @Step
    public void doCheckout() {
        checkoutPage.setDifferentAddressRadioButton();
        checkoutPage.clickBillingContinueButton();
        checkoutPage.clickShippingInformationContinueButton();
        checkoutPage.setShippingRadioButton();
        checkoutPage.clickShippingMethodContinueButton();
        checkoutPage.clickPaymentContinueButton();
        checkoutPage.clickPlaceOrderButton();
    }
}
