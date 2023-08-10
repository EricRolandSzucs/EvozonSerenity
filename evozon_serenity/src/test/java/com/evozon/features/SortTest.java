package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/SortingProducts.csv")
public class SortTest extends BaseTest {

    String sortOption, sortOrder;

    @Test
    public void sortTest(){
        sortSteps.navigateToCategoryPage();
        sortSteps.navigateToSubcategoryPage();
        sortSteps.selectSortingOption(sortOption);
        sortSteps.setOrder(sortOrder);
        sortSteps.verifyProductsAreCorrectlySortedBy(sortOption, sortOrder);
    }
}
