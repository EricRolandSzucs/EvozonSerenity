package com.evozon.features;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;
import java.io.IOException;


@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest
{
    @Test
    public void ddSearchResultsTest() throws IOException
    {
        withTestDataFrom("src/test/resources/csv/Search.csv").run(searchSteps).doSearch();
        loginAdminSteps.doLogin(Constants.ADMIN_USERNAME,Constants.USER_PASSWORD);
    }

}
