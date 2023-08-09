package com.evozon.features.addToCartDataDriven;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/AddToCartConfigurable.csv")
public class AddToCartConfigurableTest extends BaseTest {

    private String name, color, size, material, luggageSize, accessoriesSize;

    @Test
    public void validAddToCartTest() {
        searchSteps.searchForProduct(name);

        addProductSteps.clickOnProduct(name);
        addProductSteps.selectColorOption(color);
        addProductSteps.selectSizeOption(size);
        addProductSteps.selectDropdownOption(material);
        addProductSteps.selectDropdownOption(luggageSize);
        addProductSteps.selectDropdownOption(accessoriesSize);

        addProductSteps.addProductFromPage();
        addProductSteps.verifyProductWasAdded(name);
    }
}
