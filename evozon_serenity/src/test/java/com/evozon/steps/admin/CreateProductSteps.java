package com.evozon.steps.admin;

import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CreateProductSteps extends BaseAdminSteps
{
    @Step
    public void clickCatalogMenuOption() {homePage.clickCatalogDropdown();}

    @Step void clickManageProductsSubcategory(){homePage.clickManageProductsLink();}

    @Step
    public void navigateToManageProducts()
    {
        clickCatalogMenuOption();
        clickManageProductsSubcategory();
    }

    @Step
    public void clickAddNewProduct()
    {
        manageProductsPage.clickAddNewProductButton();
    }

    @Step
    public void chooseAttributeSet()
    {
        Random random = new Random();
        WebElementFacade option = addProductPage.getAttributeSetOptions().get(random.nextInt(addProductPage.getAttributeSetOptions().size()));
        addProductPage.clickAttributeSetOption(option);
    }

    @Step
    public void chooseProductType(String prodType)
    {
        WebElementFacade chosenOption = addProductPage.getProductTypeOptions().stream().filter(option -> option.getAttribute("value").equals(prodType)).collect(Collectors.toList()).get(0);
        addProductPage.clickProductTypeOption(chosenOption);
    }

    @Step
    public void clickContinue()
    {
        addProductPage.clickContinueButton();
    }

    @Step
    public void enterProductName()
    {
        addProductPage.setProdNameInputField(faker.commerce().productName());
    }

    @Step
    public void enterProductDescription()
    {
        addProductPage.setProdDescriptionField(faker.lorem().paragraph());
    }

    @Step
    public void enterProductShortDescription()
    {
        addProductPage.setProdShortDescrField(faker.lorem().sentence());
    }

    @Step
    public void enterProductSku()
    {
        addProductPage.setProdSkuField(Integer.toString(random.nextInt(1000)));
    }

    @Step
    public void enterProductWeight()
    {
        addProductPage.setProdWightField(Float.toString(random.nextFloat()));
    }

    @Step
    public void chooseStatusOption(String status)
    {
        WebElementFacade chosenOption = addProductPage.getStatusOptions().stream().filter(option -> option.getAttribute("value").equals(status)).collect(Collectors.toList()).get(0);
        addProductPage.clickStatusOption(chosenOption);
    }

    @Step
    public void clickPricesLink()
    {
        addProductPage.clickPricesSideLink();
    }

    @Step
    public void enterProductPrice()
    {
        addProductPage.setPriceField(Float.toString(random.nextFloat()));
    }

    @Step
    public void choseTaxOption()
    {
        WebElementFacade option = addProductPage.getTaxOptions().stream().filter(opt -> opt.getAttribute("value").equals("2")).collect(Collectors.toList()).get(0);
        addProductPage.selectTaxOption(option);
    }

    @Step
    public void clickSave()
    {
        addProductPage.clickSaveButton();
    }


    @Step
    public void checkProductIsSaved()
    {
        Assert.assertEquals("The product has been saved.",manageProductsPage.getSuccessMessage());
    }


    @Step
    public boolean checkAllConfigurableAttributes()
    {
        List<WebElementFacade> attributes = addProductPage.getConfigurableAttributesList();
        if(!attributes.isEmpty())
        {
            for(WebElementFacade attribute: attributes)
                addProductPage.checkConfigurableAttribute(attribute);
            return true;
        }
        return false;
    }

    @Step
    public void clickSideNavExtraLink()
    {
        List<WebElementFacade> links = addProductPage.getSideNavLinks();
        if(links.size() > 14)
            addProductPage.clickOnExtraLink(links.get(6));
    }


    @Step
    public void chooseType()
    {
        List<WebElementFacade> types = addProductPage.getAllExtraRequiredTypeOptions();
        if(types != null)
        {
            types.set(0, types.get(types.size() - 1)); // overwrite first element (empty option)
            types.get(random.nextInt(types.size())).click();
        }
    }

}
