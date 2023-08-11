package com.evozon.features;


import com.evozon.steps.AddProductSteps;
import com.evozon.steps.admin.CreateProductSteps;
import com.evozon.steps.admin.LoginAdminSteps;
import com.evozon.steps.CartSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.RegisterSteps;
import com.evozon.steps.*;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected LogoutSteps logoutSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected AddProductSteps addProductSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @Steps
    protected WishlistSteps wishlistSteps;

    @Steps
    protected ChangePasswordSteps passwordChangeSteps;

    @Steps
    protected SortSteps sortSteps;

    @Steps
    protected NavigationSteps navigationSteps;

    @Steps
    protected LoginAdminSteps loginAdminSteps;

    @Steps
    protected CreateProductSteps createProductSteps;

    @Steps
    protected AddReviewSteps addReviewSteps;

    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

}