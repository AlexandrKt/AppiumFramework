package utils;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-html/results.html",
                "json:target/cucumber-html/cucumber-report.json"},
        features = {"src/test/resources/features/"},
        glue = {"steps"}
)

public class RunnerTest {
/*    private static final String APP = System.getProperty("user.dir")+"\\src\\test\\resources\\app\\" + "appiumChallenge.apk";
    //private static final String APP ="https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.apk";
    private static final String APPIUM = "http://localhost:4723/wd/hub";

    private AndroidDriver driver;

    @Before
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", APP);
        try {
            driver = new AndroidDriver(new URL(APPIUM), caps);
        } catch (MalformedURLException e) {
            throw new UncheckedIOException("Can't parse URL", e);
        }

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
    @Test
    public void test() {
        System.out.println("elements.size()");
    }
}
