package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class AddReviewSteps extends BaseSteps{

    @Step
    public void clickAddReviewButton() {
        productPage.clickProductReviewTabButton();
        if(productPage.verifyReviewExistence())
            productPage.clickAddProductReviewButton();
        else
            productPage.clickAddFirstProductReviewButton();
    }

    @Step
    public void setPriceRadioButton(int rating) {
        productReviewPage.setPriceRadioButton(rating);
    }

    @Step
    public void setQualityRadioButton(int rating) {
        productReviewPage.setQualityRadioButton(rating);
    }

    @Step
    public void setValueRadioButton(int rating) {
        productReviewPage.setValueRadioButton(rating);
    }

    @Step
    public void setReviewField(String review) {
        productReviewPage.setReviewField(review);
    }

    @Step
    public void setSummaryField(String summary) {
        productReviewPage.setSummaryField(summary);
    }

    @Step
    public void setNicknameField(String nickname) {
        productReviewPage.setNicknameField(nickname);
    }

    @Step
    public void postReview() {
        productReviewPage.clickPostReviewButton();
    }

    @Step
    public void verifyReview(String message) {
        productReviewPage.validReviewAddMessageIsShown(message);
    }
}
