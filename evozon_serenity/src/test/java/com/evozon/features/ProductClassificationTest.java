package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/ProductCategoryPlacement.csv")
public class ProductClassificationTest extends BaseTest{

    private String name, category, subcategory;

    @Test
    public void validClassifyProductTest(){
        navigationSteps.clickOnCategory(category);
        navigationSteps.clickOnSubcategory(subcategory);
        navigationSteps.verifyProductIsPresent(name);
    }

}
