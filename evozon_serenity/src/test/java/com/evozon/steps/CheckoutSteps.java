package com.evozon.steps;

import com.evozon.utils.Constants;
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
        if(billingPage.isBillingInfoNotDefined()) {
            billingPage.setFirstNameField("First");
            billingPage.setLastNameField("Last");
            billingPage.setAddressField("Address");
            billingPage.setCityField("City");
            billingPage.setPostcodeField("12241");
            billingPage.setCountryDropDown();
            billingPage.setTelephoneField("2313121");
        }
        checkoutPage.setDifferentAddressRadioButton();
        checkoutPage.clickBillingContinueButton();
    }

    @Step
    public void completeShippingInformation() {
        if(shippingInformationPage.isShippingInfoNotDefined()) {
            shippingInformationPage.setFirstNameShippingField("First");
            shippingInformationPage.setLastNameShippingField("Last");
            shippingInformationPage.setAddressShippingField("Address");
            shippingInformationPage.setCityShippingField("City");
            shippingInformationPage.setPostcodeShippingField("12241");
            shippingInformationPage.setCountryShippingDropDown();
            shippingInformationPage.setTelephoneShippingField("2313121");
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
        ordersAdminPage.checkIfOrderIsPresent(orderNumber);
    }

    @Step
    public void verifyOrderIsPlaced(){
        Assert.assertTrue(checkoutPage.isOrderPlaced());
    }
}
