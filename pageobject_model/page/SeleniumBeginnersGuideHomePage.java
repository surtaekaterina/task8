package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SeleniumBeginnersGuideHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "http://book.theautomatedtester.co.uk";

    @FindBy(xpath = "//a[@href='/chapter1']")
    private WebElement chapterOneLink;

    @FindBy(xpath = "//a[@href='/chapter4']")
    private WebElement chapterFourLink;



    public SeleniumBeginnersGuideHomePage(WebDriver driver) {
        super(driver);

    }

    public SeleniumBeginnersGuideHomePage openPage() {
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.get(HOMEPAGE_URL);
        return this;

    }

    public SeleniumBeginnersGuideChapterOnePage goToChapterOnePage() {
        chapterOneLink.click();
        return new SeleniumBeginnersGuideChapterOnePage(driver);
    }

    public SeleniumBeginnersGuideChapterFourPage goToChapterFourPage() {
        chapterFourLink.click();
        return new SeleniumBeginnersGuideChapterFourPage(driver);
    }


}
