package com.evozon.pages.admin;

import com.evozon.pages.BasePage;
import com.evozon.utils.ScrollToTopAction;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;


import java.util.List;

public class AddProductPage extends BasePage
{
    @FindBy(css = "#attribute_set_id.select option")
    private List<WebElementFacade> attributeSetOptions;


    @FindBy(css = "#product_type option")
    private List<WebElementFacade> productTypeOptions;

    @FindBy(id = "continue_button")
    private WebElementFacade continueButton;

    @FindBy(css = "[name=\"product[name]\"]")
    private WebElementFacade prodNameInputField;

    @FindBy(id  = "description")
    private WebElementFacade prodDescriptionField;

    @FindBy(id = "short_description")
    private WebElementFacade prodShortDescrField;

    @FindBy(id = "sku")
    private WebElementFacade prodSkuField;

    @FindBy(id = "weight")
    private WebElementFacade prodWightField;

    @FindBy(css = "#status option")
    private List<WebElementFacade> statusOptions;

    @FindBy(css = "button[title=\"Save\"]")
    private WebElementFacade saveButton;

    @FindBy (css = "[title=\"Prices\"]")
    private WebElementFacade pricesSideLink;


    @FindBy(id = "price")
    private WebElementFacade priceInputField;


    @FindBy(css = "#tax_class_id option")
    private List<WebElementFacade> taxOptions;

    @FindBy(css = "input[name=\"attribute\"]")
    private List<WebElementFacade> configurableAttributesList;


    @FindBy(css = "#product_info_tabs li")
    private List<WebElementFacade> sideNavLinks;

    @FindBy(css = "label[for=\"apparel_type\"]")
    private WebElementFacade typeExtraField;

    @FindBy(css = "#apparel_type option")
    private List<WebElementFacade> extraRequiredTypeOptions;


    public List<WebElementFacade> getAttributeSetOptions(){return attributeSetOptions;}

    public List<WebElementFacade> getProductTypeOptions(){return productTypeOptions;}

    public void clickAttributeSetOption(WebElementFacade chosenOption)
    {
        clickOn(chosenOption);
    }

    public void clickProductTypeOption(WebElementFacade chosenOption)
    {
        clickOn(chosenOption);
    }

    public void clickContinueButton(){clickOn(continueButton);}

    public void setProdNameInputField(String name)
    {
        typeInto(prodNameInputField,name);
    }

    public void setProdDescriptionField(String descr)
    {
        typeInto(prodDescriptionField,descr);
    }

    public void setProdShortDescrField(String shortDescr)
    {
        typeInto(prodShortDescrField,shortDescr);
    }

    public void setProdSkuField(String sku)
    {
        typeInto(prodSkuField,sku);
    }

    public void setProdWightField(String weight)
    {
        if(prodWightField.isCurrentlyEnabled())
            typeInto(prodWightField,weight);
    }

    public List<WebElementFacade> getStatusOptions(){return statusOptions;}

    public void clickStatusOption(WebElementFacade chosenOption)
    {
        clickOn(chosenOption);
    }

    public void clickPricesSideLink()
    {
        ScrollToTopAction scroll = new ScrollToTopAction();
        scroll.scrollToBeginning();
        clickOn(pricesSideLink);
    }

    public void setPriceField(String price)
    {
        typeInto(priceInputField,price);
    }

    public List<WebElementFacade> getTaxOptions(){return taxOptions;}


    public void selectTaxOption(WebElementFacade chosenOption)
    {
        clickOn(chosenOption);
    }

    public void clickSaveButton(){clickOn(saveButton);}

    public List<WebElementFacade> getConfigurableAttributesList(){return configurableAttributesList;}

    public void checkConfigurableAttribute(WebElementFacade attribute)
    {
        clickOn(attribute);
    }

    public List<WebElementFacade> getSideNavLinks(){return sideNavLinks;}

    public void clickOnExtraLink(WebElementFacade link){clickOn(link);}

    public List<WebElementFacade> getAllExtraRequiredTypeOptions()
    {
        if(typeExtraField.isCurrentlyEnabled())
        {
            return extraRequiredTypeOptions;
        }
        else
            return null;
    }

}
