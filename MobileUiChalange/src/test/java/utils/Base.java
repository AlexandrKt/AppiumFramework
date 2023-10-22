package utils;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public String scenarioName;
    private static AndroidDriver driver;
    private static final String APP = System.getProperty("user.dir")+"\\src\\test\\resources\\app\\";
    private static final String APPIUM = "http://localhost:4723/wd/hub";

    public Base(){
        this.scenarioName="";
    }

    public void setUp(String appName) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", APP + appName);
        try {
            this.driver = new AndroidDriver(new URL(APPIUM), caps);
        } catch (MalformedURLException e) {
            throw new UncheckedIOException("Can't parse URL", e);
        }

        this.driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
    public AndroidDriver getDriver(){
        return this.driver;
    }

}
