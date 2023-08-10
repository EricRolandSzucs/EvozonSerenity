package com.evozon.suite;

import com.evozon.features.AddToCartTest;
import com.evozon.features.CheckoutTest;
import com.evozon.features.RegisterTest;
import com.evozon.features.ValidLoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegisterTest.class,
        ValidLoginTest.class,
        AddToCartTest.class,
        CheckoutTest.class,
})
public class SmokeSuite {
}
