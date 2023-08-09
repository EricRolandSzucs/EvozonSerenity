package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class CheckoutPage extends BasePage {
    @FindBy(id = "billing:use_for_shipping_no")
    private WebElementFacade differentAddressRadioButton;

    @FindBy(css = "#billing-buttons-container button")
    private WebElementFacade billingContinueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade shippingRadioButton;

    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElementFacade shippingMethodContinueButton;

    @FindBy(css = "#payment-buttons-container button")
    private WebElementFacade paymentContinueButton;

    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade placeOrderButton;

    @FindBy(xpath = "//h1[text() = 'Your order has been received.']")
    private WebElementFacade orderConfirmationText;

    public void setDifferentAddressRadioButton() {
        clickOn(differentAddressRadioButton);
    }
    public void clickBillingContinueButton() {
        clickOn(billingContinueButton);
    }

    public void clickShippingMethodContinueButton() {
        clickOn(shippingMethodContinueButton);
    }

    public void setShippingRadioButton() {
        withTimeoutOf(Duration.ofSeconds(60)).waitFor(shippingRadioButton);
        clickOn(shippingRadioButton);
    }

    public void clickPaymentContinueButton() {
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(paymentContinueButton);
        clickOn(paymentContinueButton);
    }

    public void clickPlaceOrderButton() {
        withTimeoutOf(Duration.ofSeconds(100)).waitFor(placeOrderButton);
        clickOn(placeOrderButton);
    }

    public String setOrderNumber() {
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(orderConfirmationText);
        return element(By.cssSelector(".col-main  p:first-of-type a")).getText();
    }
    public boolean isOrderPlaced() {
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(orderConfirmationText);
        return orderConfirmationText.containsOnlyText("YOUR ORDER HAS BEEN RECEIVED.");
    }
}