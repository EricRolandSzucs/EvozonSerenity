package com.evozon.pages.Admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ManageCustomersPage extends BasePage
{
    @FindBy(css = "#customerGrid_table tbody tr")
    private List<WebElementFacade> customersTableRows;


    @FindBy(css =".middle button[title=\"Add New Customer\"]")
    private WebElementFacade addNewCustomerButton;

    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessage;

    public List<WebElementFacade> getAllCustomers()
    {
        return customersTableRows;
    }

    public void clickAddNewCustomerButton()
    {
        clickOn(addNewCustomerButton);
    }

    public String getSuccessMessage()
    {
        return successMessage.getText();
    }

    public void clickEditUser(WebElementFacade user)
    {
        clickOn(user);
    }

}
