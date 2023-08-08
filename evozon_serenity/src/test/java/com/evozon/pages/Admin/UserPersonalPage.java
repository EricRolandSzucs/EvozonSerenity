package com.evozon.pages.Admin;


import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class UserPersonalPage extends BasePage
{

    @FindBy(css = "[title=\"Delete Customer\"]")
    private WebElementFacade deleteCustomerButton;

    public void clickDeleteCustomerButton()
    {
        clickOn(deleteCustomerButton);
        acceptPopup();
    }

    public void acceptPopup()
    {
        getAlert().accept();
    }
}
