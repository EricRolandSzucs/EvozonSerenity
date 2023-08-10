package com.evozon.pages.admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ManageProductsPage extends BasePage
{
    @FindBy(css = "button[title=\"Add Product\"]")
    private WebElementFacade addNewProductButton;

    @FindBy(css = ".success-msg span")
    private  WebElementFacade successMessage;

    @FindBy(id = "productGrid_product_filter_name")
    private WebElementFacade searchByNameInputField;

    @FindBy(css = ".even.pointer")
    private List<WebElementFacade> productsListLinks;

    public void clickAddNewProductButton()
    {
        clickOn(addNewProductButton);
    }

    public String getSuccessMessage()
    {
        return successMessage.getText();
    }

    public void setSearchByNameInputField(String prodName){typeInto(searchByNameInputField,prodName);}


    public List<WebElementFacade> getProductsListLinks()
    {
        return productsListLinks;
    }
}
