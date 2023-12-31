package com.evozon.pages.admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomeAdminPage extends BasePage
{
    @FindBy(css = ".logo")
    private WebElementFacade logoImg;

    @FindBy(css = "a[title=\"close\"]")
    private WebElementFacade popupCloseButton;

    @FindBy(css = ".parent.level0:nth-child(4)")
    private WebElementFacade navbarCustomersDropdown;

    @FindBy(css = ".parent.level0:nth-child(4) .level1:first-child a")
    private WebElementFacade manageCustomersLink;


    @FindBy(css = ".parent.level0:nth-child(3)")
    private WebElementFacade navbarCatalogDropdown;


    @FindBy(css = ".parent.level0:nth-child(2)")
    private WebElementFacade navbarSalesDropdown;


    @FindBy(css = ".parent.level0:nth-child(3) .level1:first-child a")
    private WebElementFacade manageProductsLink;

    @FindBy(css = ".parent.level0:nth-child(2) .level1:first-child a")
    private WebElementFacade ordersLink;

    @FindBy(css = ".link-logout")
    private WebElementFacade logoutLink;



    public String getLogoText()
    {
        return logoImg.getAttribute("alt");
    }

    public void clickPopupCloseButton()
    {
        clickOn(popupCloseButton);
    }

    public void clickCustomersDropdown()
    {
        clickOn(navbarCustomersDropdown);
    }

    public void clickManageCustomersLink()
    {
        clickOn(manageCustomersLink);
    }

    public void clickCatalogDropdown() {clickOn(navbarCatalogDropdown);}

    public void clickSalesDropdown() {clickOn(navbarSalesDropdown);}

    public void clickManageProductsLink(){clickOn(manageProductsLink);}

    public void clickOrderLink() {clickOn(ordersLink);}


    public void clickLogoutLink()
    {
        clickOn(logoutLink);
    }
}
