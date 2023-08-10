package com.evozon.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

import java.util.List;

public class SearchSteps extends BaseSteps{

    private String category;

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

    @Step
    public void clickOnProduct(WebElementFacade product)
    {
        productGridPage.clickOnDetailsForProduct(product);
    }

    @Step
    public List<WebElementFacade> getAllProductsForSearch()
    {
        return productGridPage.getResultProductLinksList();
    }

    @Step
    public void clickOnAdditionalInformation()
    {
        productPage.clickAdditionalInformationTab();
    }

    @Step
    public void verifyProductsPageContainsSearchCategory(String productPageText)
    {
        Boolean singular = productPageText.contains(category.toLowerCase());
        Boolean plural = productPageText.contains(category.toLowerCase()+"s");
        Assert.assertTrue(singular || plural);
    }

    @Step
    public void iterateEveryProductInSearchResult()
    {
        List<WebElementFacade> prodLinks = getAllProductsForSearch();
        for(int i = 0; i < prodLinks.size(); i++)
        {
            clickOnProduct(prodLinks.get(i));
            String allTextOnProductPage = productPage.getProductMainPageText();

            verifyProductsPageContainsSearchCategory(allTextOnProductPage);

            getDriver().navigate().back();
            prodLinks = getAllProductsForSearch();
        }
    }


    @Step
    public void doSearch()
    {
        searchForProduct(category);
        iterateEveryProductInSearchResult();
    }

}
