package com.evozon.features;

import com.evozon.steps.SearchSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest
{
    @Test
    public void ddSearchResultsTest()
    {
        try
        {
            withTestDataFrom("src/test/resources/csv/Search.csv").run(searchSteps).doSearch();
        }catch (Exception e){}
    }

}
