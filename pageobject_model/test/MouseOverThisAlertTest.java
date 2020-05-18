package pageobject_model.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.page.SeleniumBeginnersGuideChapterFourPage;
import pageobject_model.page.SeleniumBeginnersGuideHomePage;

public class MouseOverThisAlertTest extends CommonConditions {

    //private WebDriver driver;

//    @BeforeMethod(alwaysRun = true)
//    public void browserSetup() {
//        driver = new ChromeDriver();
//    }

    @Test(description = "Jira ticket Task8")
    public void closeMouseOverThisAlert() {
        new SeleniumBeginnersGuideHomePage(driver).
                openPage()
                .goToChapterFourPage()
                .hoverMouseToElement()
                .closeMouseOverThisAlert();

    }




//    @AfterMethod(alwaysRun = true)
//    public void browserTearDown() {
//        driver.quit();
//
//
//    }
}
