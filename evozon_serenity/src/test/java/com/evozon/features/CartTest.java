package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void validAddToCartSimpleProductTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
    }
}