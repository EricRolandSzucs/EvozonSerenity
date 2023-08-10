package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SortSteps extends BaseSteps {

    @Step
    public void navigateToCategoryPage(){
        homePage.clickOnRandomCategory();
    }

    @Step
    public void navigateToSubcategoryPage(){
        subcategoryPage.clickSubcategory();
    }

    @Step
    public void selectSortingOption(String option){
        productGridPage.selectSortDropDownOption(option);
    }

    @Step
    public void setOrder(String order){
        if (order.equals("ascending"))
            productGridPage.setAscSwitcherOn();
        else if (order.equals("descending"))
            productGridPage.setDescSwitcherOn();
    }

    @Step
    public void verifyProductsAreCorrectlySortedBy(String option, String order){
        Assert.assertTrue(productGridPage.verifyIsSortedBy(option, order));
    }
}
