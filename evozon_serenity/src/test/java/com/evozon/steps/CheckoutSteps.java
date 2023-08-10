package com.evozon.steps;

import com.evozon.utils.Constants;
import com.github.javafaker.Faker;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {

    String orderNumber;

    @Step
    public void clickOnCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @Step
    public void completeBilling() {
        if(billingPage.isBillingInfoUndefined()) {
            billingPage.setFirstNameField();
            billingPage.setLastNameField();
            billingPage.setAddressField();
            billingPage.setCityField();
            billingPage.setPostcodeField();
            billingPage.setCountryDropDown();
            billingPage.setTelephoneField();
        }
        checkoutPage.setDifferentAddressRadioButton();
        checkoutPage.clickBillingContinueButton();
    }

    @Step
    public void completeShippingInformation() {
        if(shippingInformationPage.isShippingInfoUndefined()) {
            shippingInformationPage.setFirstNameShippingField();
            shippingInformationPage.setLastNameShippingField();
            shippingInformationPage.setAddressShippingField();
            shippingInformationPage.setCityShippingField();
            shippingInformationPage.setPostcodeShippingField();
            shippingInformationPage.setCountryShippingDropDown();
            shippingInformationPage.setTelephoneShippingField();
        }
        shippingInformationPage.clickShippingInformationContinueButton();
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
        orderNumber = checkoutPage.setOrderNumber();
    }

    @Step
    public void navigateToAdminPage() {
        getDriver().get(Constants.ADMIN_URL);
    }

    @Step
    public void navigateToOrdersInAdmin() {
        homeAdminPage.clickSalesDropdown();
        homeAdminPage.clickOrderLink();
    }

    @Step
    public void verifyOrderIsPresent(String user) throws InterruptedException {
        ordersAdminPage.setOrderIdField(orderNumber);
        ordersAdminPage.clickSearchButton();
        ordersAdminPage.verifyIfOrderIsPresent(orderNumber);
    }

    @Step
    public void verifyOrderIsPlaced(){
        Assert.assertTrue(checkoutPage.isOrderPlaced());
    }
}
