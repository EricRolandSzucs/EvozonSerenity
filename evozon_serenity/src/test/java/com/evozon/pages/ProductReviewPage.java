package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends BasePage {
    @FindBy(id = "review_field")
    private WebElementFacade reviewField;

    @FindBy(id = "summary_field")
    private WebElementFacade summaryField;

    @FindBy(id = "nickname_field")
    private WebElementFacade nicknameField;

    @FindBy(css = ".buttons-set button")
    private WebElementFacade postReviewButton;

    @FindBy(css = ".messages span")
    private WebElementFacade successfulReviewParagraph;

    public void setQualityRadioButton(int rating) {
        clickOn(element(By.id("Quality_" + rating)));
    }

    public void setPriceRadioButton(int rating) {
        clickOn(element(By.id("Price_" + rating)));
    }

    public void setValueRadioButton(int rating) {
        clickOn(element(By.id("Value_" + rating)));
    }

    public void setReviewField(String review) {
        typeInto(reviewField, review);
    }

    public void setSummaryField(String summary) {
        typeInto(summaryField, summary);
    }

    public void setNicknameField(String nickname) {
        typeInto(nicknameField, nickname);
    }

    public void clickPostReviewButton() {
        clickOn(postReviewButton);
    }

    public boolean validReviewAddMessageIsShown(String message){
        return successfulReviewParagraph.containsOnlyText(message);
    }



}
