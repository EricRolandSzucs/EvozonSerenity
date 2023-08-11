package com.evozon.pages.admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsAdminPage extends BasePage
{
    @FindBy(css = "#product_info_tabs li a")
    private List<WebElementFacade> productInformationPagesLinksList;

    @FindBy(css = ".main-col-inner")
    private WebElementFacade productInformationBox;

    public List<WebElementFacade> getProductInformationPagesLinksList()
    {
        return productInformationPagesLinksList;
    }


    public void clickOnProductInformationPage(WebElementFacade page)
    {
        clickOn(page);
    }


    public String getProductInformationBoxText()
    {
        return productInformationBox.getText().toLowerCase();
    }
}
