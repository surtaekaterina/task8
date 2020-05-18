package pageobject_model.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton() {
    }

    public static WebDriver getDriver(String browser) throws Exception {
        if (null == driver) {

           switch (browser) {
                case "firefox": {
                    DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
                    break;
                }
                case "chrome": {
                    DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
                    break;
                }

            }
            //driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;

    }


}
