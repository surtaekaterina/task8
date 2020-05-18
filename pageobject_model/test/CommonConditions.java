package pageobject_model.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageobject_model.driver.DriverSingleton;

public class CommonConditions {

    protected WebDriver driver;


    @Parameters({"browserName"})
    @BeforeClass(alwaysRun = true)
    public void browserSetup(@Optional String browserName) throws Exception {
        driver = DriverSingleton.getDriver(browserName);
    }


    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();
        driver = null;

    }
}
