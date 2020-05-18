package pageobject_model.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject_model.page.SeleniumBeginnersGuideHomePage;

public class WebDriverSeleniumBegginersGuideTest extends CommonConditions {

   private String expectedTextFromAjaxLink = "The following text has been loaded from another page on this site. It has been loaded in an asynchronous fashion so that we can work through the AJAX section of this chapter";
    private String textfromAjaxLink;


    @Test(description = "Jira ticket Task7")
    public void verifyTextWithAjaxLink() {
         textfromAjaxLink = new SeleniumBeginnersGuideHomePage(driver)
                .openPage()
                .goToChapterOnePage()
                .goToLinkWithAjax()
                .getAjaxText();
        System.out.println(textfromAjaxLink);
        System.out.println(expectedTextFromAjaxLink);
        Assert.assertEquals(textfromAjaxLink, expectedTextFromAjaxLink);


    }

}
