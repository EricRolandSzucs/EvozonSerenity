package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class NavigationSteps extends BaseSteps{

    @Step
    public void clickOnCategory(String category) {
        homePage.clickOnCategory(category);
    }

    @Step
    public void clickOnSubcategory(String subcategory) {
        homePage.clickOnSubcategory(subcategory);
    }

    @Step
    public void verifyProductIsPresent(String product) {
        Assert.assertTrue(productGridPage.isProductPresent(product));
    }

}
