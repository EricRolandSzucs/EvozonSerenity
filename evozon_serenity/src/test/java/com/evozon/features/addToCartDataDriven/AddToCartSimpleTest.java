package com.evozon.features.addToCartDataDriven;

import com.evozon.features.BaseTest;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/AddToCartSimple.csv")
public class AddToCartSimpleTest extends BaseTest {

    private String name;

    @Test
    public void validAddSimpleProductTest(){
        searchSteps.searchForProduct(name);
        addProductSteps.addProduct(name);
        addProductSteps.verifyProductWasAdded(name);
    }
}
