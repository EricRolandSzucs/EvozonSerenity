package com.evozon.features.Admin;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CreateProductTest extends BaseAdminTest
{
    @Before
    public void navigateToManageProducts()
    {
        loginSteps.doLogin(Constants.ADMIN_USERNAME, Constants.USER_PASSWORD);
        createNewProductSteps.navigateToManageProducts();
    }

    @Test
    public void createSimpleProduct()
    {
        createNewProductSteps.clickAddNewProduct();
        createNewProductSteps.chooseAttributeSet();
        createNewProductSteps.chooseProductType("simple");
        createNewProductSteps.clickContinue();
        createNewProductSteps.enterProductName();
        createNewProductSteps.enterProductDescription();
        createNewProductSteps.enterProductShortDescription();
        createNewProductSteps.enterProductSku();
        createNewProductSteps.enterProductWeight();
        createNewProductSteps.chooseStatusOption("1");
        createNewProductSteps.clickPricesLink();
        createNewProductSteps.enterProductPrice();
        createNewProductSteps.choseTaxOption();
        createNewProductSteps.clickSave();

        createNewProductSteps.checkProductIsSaved();
    }

    @Test
    public void createConfigurableProduct()
    {
        createNewProductSteps.clickAddNewProduct();
        createNewProductSteps.chooseAttributeSet();
        createNewProductSteps.chooseProductType("configurable");
        createNewProductSteps.clickContinue();
        if(createNewProductSteps.checkAllConfigurableAttributes())
        {
            createNewProductSteps.clickContinue();

            createNewProductSteps.enterProductName();
            createNewProductSteps.enterProductDescription();
            createNewProductSteps.enterProductShortDescription();
            createNewProductSteps.enterProductSku();
            createNewProductSteps.enterProductWeight();
            createNewProductSteps.chooseStatusOption("1");
            createNewProductSteps.clickPricesLink();
            createNewProductSteps.enterProductPrice();
            createNewProductSteps.choseTaxOption();
            createNewProductSteps.clickSideNavExtraLink();
            createNewProductSteps.chooseType();
            createNewProductSteps.clickSave();

            createNewProductSteps.checkProductIsSaved();
        }
    }
}
