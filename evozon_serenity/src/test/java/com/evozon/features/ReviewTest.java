package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ReviewTest extends BaseTest{

    @Test
    public void validReviewTest() {
        searchSteps.searchForProduct(Constants.SIMPLE_PRODUCT);
        addProductSteps.clickOnProduct(Constants.SIMPLE_PRODUCT);
        addReviewSteps.clickAddReviewButton();

        addReviewSteps.setPriceRadioButton(5);
        addReviewSteps.setQualityRadioButton(5);
        addReviewSteps.setValueRadioButton(5);

        addReviewSteps.setReviewField("Review");
        addReviewSteps.setSummaryField("Summary");
        addReviewSteps.setNicknameField("Nickname");
        addReviewSteps.postReview();

        addReviewSteps.verifyReview("Your review has been accepted for moderation.");
    }
}
