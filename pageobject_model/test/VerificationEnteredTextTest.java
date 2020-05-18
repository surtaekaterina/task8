package pageobject_model.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject_model.page.SeleniumBeginnersGuideHomePage;

public class VerificationEnteredTextTest extends CommonConditions {

    private String enteredText = "Test text";
    private String resultText;


    @Test(description = "Jira ticket Task7")
    public void verifyEnteredText() {
        resultText = new SeleniumBeginnersGuideHomePage(driver)
                .openPage()
                .goToChapterFourPage()
                .inputTextToTheElement(enteredText)
                .getTextFromTheElement();

        Assert.assertEquals(resultText, enteredText);
    }
}
