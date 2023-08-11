package com.evozon.steps;

import com.evozon.pages.admin.LoginAdminPage;
import com.evozon.pages.admin.ManageProductsPage;
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
        setSearchField(product);
        submitSearchField();
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
    public boolean productsPageContainsSearchCategory(String productPageText)
    {
        return  productPageText.contains(category.toLowerCase()) || productPageText.contains(category.toLowerCase()+"s");
    }

    @Step
    public void enterProductName(String productTile)
    {
        manageProductsPage.setSearchByNameInputField(productTile);
    }

    @Step
    public List<WebElementFacade> getListOfResultedProducts()
    {
        return manageProductsPage.getProductsListLinks();
    }

    @Step
    public boolean checkIfProductContainsSearchKey(String productTitle)
    {
        List<WebElementFacade> infoPages = productDetailsAdminPage.getProductInformationPagesLinksList();
        for(WebElementFacade page: infoPages)
        {
            productDetailsAdminPage.clickOnProductInformationPage(page);
            if(productDetailsAdminPage.getProductInformationBoxText().contains(productTitle.toLowerCase()))
                return true;
        }
        return false;
    }


    @Step
    public List<WebElementFacade> searchProductByTitleInAdmin(String productTile)
    {
        enterProductName(productTile);
        return getListOfResultedProducts();
    }

    @Step
    public boolean verifyListOfProductsAdminContainsKey(String productTile)
    {
        List<WebElementFacade> products = searchProductByTitleInAdmin(productTile);
        for(WebElementFacade prod: products)
        {
            clickOnProduct(prod);
            if(checkIfProductContainsSearchKey(productTile))
                return true;
        }
        return false;
    }

    @Step
    public void verifyProductContainsSearchCategory()
    {
        Assert.assertTrue(productsPageContainsSearchCategory(getAllTextFromProductsPage()) || verifyListOfProductsAdminContainsKey(getProductTitle()));
    }

    @Step
    public String getProductTitle() {return productPage.getProductTitle();}

    @Step
    public String getAllTextFromProductsPage()
    {
        return productPage.getProductMainPageText();
    }

    @Step
    public void iterateEveryProductInSearchResult()
    {
        List<WebElementFacade> prodLinks = getAllProductsForSearch();
        for(int i = 0; i < prodLinks.size(); i++)
        {
            clickOnProduct(prodLinks.get(i));
            verifyProductContainsSearchCategory();
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
