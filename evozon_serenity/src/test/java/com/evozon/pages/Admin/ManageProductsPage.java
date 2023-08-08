package com.evozon.pages.Admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ManageProductsPage extends BasePage
{
    @FindBy(css = "button[title=\"Add Product\"]")
    private WebElementFacade addNewProductButton;

    @FindBy(css = ".success-msg span")
    private  WebElementFacade successMessage;

    public void clickAddNewProductButton()
    {
        clickOn(addNewProductButton);
    }

    public String getSuccessMessage()
    {
        return successMessage.getText();
    }
}
