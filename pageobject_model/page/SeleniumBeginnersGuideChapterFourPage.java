package pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBeginnersGuideChapterFourPage extends  AbstractPage {


    @FindBy(xpath = "//div[@class = 'secondajax']")
    private WebElement mouseOverThisElement;

    @FindBy(id = "dateInput")
    private WebElement dateInputElement;

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement textFieldElement;


    protected SeleniumBeginnersGuideChapterFourPage(WebDriver driver) {
        super(driver);
    }

    protected AbstractPage openPage() {
        return null;
    }

    public SeleniumBeginnersGuideChapterFourPage hoverMouseToElement(){
        new  Actions(driver).moveToElement(mouseOverThisElement).build().perform();
        return this;

    }
    public SeleniumBeginnersGuideChapterFourPage closeMouseOverThisAlert() {
       // Thread.sleep(5000);
        driver.switchTo().alert().accept();
        return this;

    }

    public SeleniumBeginnersGuideChapterFourPage inputTextToTheElement(String text) {
        new Actions(driver).sendKeys(dateInputElement, text).build().perform();
        return this;
    }

    public String getTextFromTheElement() {
        new WebDriverWait(driver, 5).until(new ExpectedCondition<Boolean>() {
        public Boolean apply(WebDriver d) {
            return d.findElement(By.id("dateInput")).getText().length() != 0;
        }
    });
        return dateInputElement.getText();
    }
}
