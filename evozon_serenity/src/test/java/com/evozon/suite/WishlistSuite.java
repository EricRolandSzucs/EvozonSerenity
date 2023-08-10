package com.evozon.suite;

import com.evozon.features.wishlist.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddToWishlistTest.class,
        AllItemsToCartFromWishlistTest.class,
        QuantityChangeWishlistTest.class,
        RemoveFromWishlistTest.class,
        ShareWishlistTest.class

})
public class WishlistSuite {
}