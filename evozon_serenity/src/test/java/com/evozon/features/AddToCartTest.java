package com.evozon.features;

import com.evozon.steps.AddProductSteps;
import com.evozon.steps.SearchSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends BaseTest{
    @Test
    public void validAddSimpleProductTest(){
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.addProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.verifyProductWasAdded(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void validAddConfigurableProductTest(){
        searchSteps.searchForProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.clickOnProduct(Constants.CONFIGURABLE_PRODUCT);
        addProductSteps.selectProductOptions();
        addProductSteps.addProductFromPage();
        addProductSteps.verifyProductWasAdded(Constants.CONFIGURABLE_PRODUCT);
    }

    @Test
    public void validAddVirtualProductTest(){
        searchSteps.searchForProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.addProduct(Constants.VIRTUAL_PRODUCT);
        addProductSteps.verifyProductWasAdded(Constants.VIRTUAL_PRODUCT);
    }
}