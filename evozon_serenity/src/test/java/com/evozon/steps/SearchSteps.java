package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class SearchSteps extends BaseSteps{

    @Step
    public void setSearchField(String product) {
        homePage.setSearchField(product);
    }

    @Step
    public void submitSearchField() {
        homePage.submitSearchField();
    }

    @Step
    public void searchForProduct(String product) {
        homePage.setSearchField(product);
        homePage.submitSearchField();
    }

}
