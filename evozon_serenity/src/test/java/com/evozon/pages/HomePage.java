package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Log Out']")
    private WebElementFacade logoutLink;

    @FindBy(css = "#header-account a[title='My Account']")
    private WebElementFacade myAccountLink;
  
    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    private WebElementFacade category;

    @FindBy(css = ".logo")
    private WebElementFacade homeLogoLink;

    @FindBy(css = ".welcome-msg")
    private WebElementFacade welcomeMessage;

    @FindBy(css = ".nav-primary>.level0")
    private List<WebElementFacade> categories;

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickLoginLink(){
        waitFor(loginLink);
        clickOn(loginLink);
    }


    public void clickLogoutLink(){
        waitFor(logoutLink);
        clickOn(logoutLink);
    }


    public void setSearchField(String search) {
        typeInto(searchField, search);
    }

    public void submitSearchField(){
        searchField.submit();
    }

    public void clickRegisterLink(){
        waitFor(registerLink);
        clickOn(registerLink);
    }

    public boolean checkMatchedUrl(String currentUrl){
        return currentUrl.equals(Constants.BASE_URL);
    }

    public void clickCategory(){
        Random random = new Random();
        int randomIndex = random.nextInt(categories.size());

        WebElementFacade randomMenuItem = categories.get(randomIndex);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(randomMenuItem).click().perform();
    }


    public void clickOnCategory(String categoryName) {
        category = element(By.xpath("//li[contains(@class, 'level0')]/a[contains(text(),'" + categoryName + "')]"));
        new Actions(getDriver()).moveToElement(category).perform();
    }

    public void clickOnSubcategory(String subcategoryName) {
        System.out.println(By.xpath("//li[contains(@class, 'level1')]/a[contains(text(),'" + subcategoryName + "')]"));
        WebElementFacade subcategory = category.find(By.xpath("//li[contains(@class, 'level1')]/a[contains(text(),'" + subcategoryName + "')]"));
        if(subcategory.isCurrentlyVisible()) {
            clickOn(subcategory);
        }
        else
            clickOn(category);
    }

    public void clickHomeLogo()
    {
        clickOn(homeLogoLink);
    }

    public String getWelcomeMessage()
    {
        return welcomeMessage.getText();
    }

}