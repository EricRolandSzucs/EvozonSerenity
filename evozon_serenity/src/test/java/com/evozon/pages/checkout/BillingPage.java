package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends BasePage {
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

    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public boolean isBillingInfoNotDefined() {
        return firstNameField.isCurrentlyVisible();
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setAddressField(String address) {
        typeInto(addressField, address);
    }

    public void setCityField(String city) {
        typeInto(cityField, city);
    }

    public void setPostcodeField(String postcode) {
        typeInto(postcodeField,postcode);
    }

    public void setCountryDropDown() {
        clickOn(countryDropDown);
    }

    public void setTelephoneField(String telephone) {
        typeInto(telephoneField,telephone);
    }
}
