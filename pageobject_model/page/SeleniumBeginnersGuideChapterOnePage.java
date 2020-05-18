package pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumBeginnersGuideChapterOnePage extends AbstractPage {


    @FindBy(xpath = "//div[@class = 'loadajax']")
    private WebElement pageWithAjaxLink;

    @FindBy(id = "ajaxdiv")
    private WebElement textFromAjaxLinl;

    protected AbstractPage openPage() {
        throw new RuntimeException("Any text");
    }

    public SeleniumBeginnersGuideChapterOnePage(WebDriver driver) {
        super(driver);

    }


    public SeleniumBeginnersGuideChapterOnePage goToLinkWithAjax() {

        pageWithAjaxLink.click();
        return this;

    }

    public String getAjaxText() {
        //new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='ajaxdiv']/p")));
        //new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(textFromAjaxLinl));

        //new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(textFromAjaxLinl, textToAppear));
        //Thread.sleep(5000);


        new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(By.id("ajaxdiv")).getText().length() != 0;
            }
        });
            return textFromAjaxLinl.getText().trim();

    }
}
