package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ShippingInformationPage extends BasePage {
    @FindBy(id ="shipping:firstname")
    protected WebElementFacade firstNameShippingField;

    @FindBy(id = "shipping:lastname")
    private WebElementFacade lastNameShippingField;

    @FindBy(id = "shipping:street1")
    private WebElementFacade addressShippingField;

    @FindBy(id = "shipping:city")
    private WebElementFacade cityShippingField;

    @FindBy(id = "shipping:postcode")
    private WebElementFacade postcodeShippingField;

    @FindBy(css = "#shipping\\:country_id > option:nth-child(2)")
    private WebElementFacade countryShippingDropDown;

    @FindBy(id = "shipping:telephone")
    private WebElementFacade telephoneShippingField;

    @FindBy(css = "#shipping-buttons-container button")
    private WebElementFacade shippingInformationContinueButton;

    public boolean isShippingInfoNotDefined() {
        waitFor(shippingInformationContinueButton);
        return firstNameShippingField.isCurrentlyVisible();
    }

    public void clickShippingInformationContinueButton() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(shippingInformationContinueButton);
        clickOn(shippingInformationContinueButton);
    }

    public void setFirstNameShippingField(String firstName) {
        waitFor(firstNameShippingField);
        typeInto(firstNameShippingField, firstName);
    }

    public void setLastNameShippingField(String lastName) {

        typeInto(lastNameShippingField, lastName);
    }

    public void setAddressShippingField(String address) {

        typeInto(addressShippingField,address);
    }

    public void setCityShippingField(String city) {

        typeInto(cityShippingField,city);
    }

    public void setPostcodeShippingField(String postcode) {
        typeInto(postcodeShippingField, postcode);
    }

    public void setCountryShippingDropDown() {
        clickOn(countryShippingDropDown);
    }

    public void setTelephoneShippingField(String telephone) {
        typeInto(telephoneShippingField, telephone);
    }
}
