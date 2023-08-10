package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends BasePage {

    Faker faker = new Faker();

    @FindBy(id ="billing:firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "billing:lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "billing:street1")
    private WebElementFacade addressField;

    @FindBy(id = "billing:city")
    private WebElementFacade cityField;

    @FindBy(id = "billing:postcode")
    private WebElementFacade postcodeField;

    @FindBy(css = "#billing\\:country_id > option:nth-child(2)")
    private WebElementFacade countryDropDown;

    @FindBy(id = "billing:telephone")
    private WebElementFacade telephoneField;

    public void setFirstNameField() {
        String randomFirstname = faker.name().firstName();
        typeInto(firstNameField, randomFirstname);
    }

    public boolean isBillingInfoUndefined() {
        return firstNameField.isCurrentlyVisible();
    }

    public void setLastNameField() {
        String randomLastname = faker.name().lastName();
        typeInto(lastNameField, randomLastname);
    }

    public void setAddressField() {
        String randomAddress = faker.address().streetAddress();
        typeInto(addressField, randomAddress);
    }

    public void setCityField() {
        String randomCity = faker.address().city();
        typeInto(cityField, randomCity);
    }

    public void setPostcodeField() {
        String randomPostcode = faker.address().zipCode();
        typeInto(postcodeField, randomPostcode);
    }

    public void setCountryDropDown() {
        clickOn(countryDropDown);
    }

    public void setTelephoneField() {
        String randomTelephone = faker.phoneNumber().cellPhone();
        typeInto(telephoneField, randomTelephone);
    }
}
