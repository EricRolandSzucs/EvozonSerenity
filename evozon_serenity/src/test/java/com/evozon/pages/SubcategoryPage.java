package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class SubcategoryPage extends BasePage {

    @FindBy(css = ".catblocks a")
    private List<WebElementFacade> subcategories;

    public void clickSubcategory(){
        Random random = new Random();

        if (!subcategories.isEmpty()) {
            int randomDropdownIndex = random.nextInt(subcategories.size());

            WebElementFacade randomDropdownItem = subcategories.get(randomDropdownIndex);
            clickOn(randomDropdownItem);
        }

    }
}
