package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ShippingInformationPage extends BasePage {

    Faker faker = new Faker();

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

    public boolean isShippingInfoUndefined() {
        waitFor(shippingInformationContinueButton);
        return firstNameShippingField.isCurrentlyVisible();
    }

    public void clickShippingInformationContinueButton() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(shippingInformationContinueButton);
        clickOn(shippingInformationContinueButton);
    }

    public void setFirstNameShippingField() {
        waitFor(firstNameShippingField);
        String randomFirstname = faker.name().firstName();
        typeInto(firstNameShippingField, randomFirstname);
    }

    public void setLastNameShippingField() {
        String randomLastname = faker.name().lastName();
        typeInto(lastNameShippingField, randomLastname);
    }

    public void setAddressShippingField() {
        String randomAddress = faker.address().streetAddress();
        typeInto(addressShippingField, randomAddress);
    }

    public void setCityShippingField() {
        String randomCity = faker.address().city();
        typeInto(cityShippingField, randomCity);
    }

    public void setPostcodeShippingField() {
        String randomPostcode = faker.address().zipCode();
        typeInto(postcodeShippingField, randomPostcode);
    }

    public void setCountryShippingDropDown() {
        clickOn(countryShippingDropDown);
    }

    public void setTelephoneShippingField() {
        String randomTelephone = faker.phoneNumber().cellPhone();
        typeInto(telephoneShippingField, randomTelephone);
    }
}
