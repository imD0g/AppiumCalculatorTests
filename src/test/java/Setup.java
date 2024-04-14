import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Here we will set the Desired Capabilities and create the driver
 */
public class Setup {
    AndroidDriver driver;
    public  static final String PACKAGE_ID="com.google.android.calculator";

    /**
     * This method will set the Desired Capabilities and create the driver
     * @return AndroidDriver
     * @throws MalformedURLException if the URL is wrong
     */
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","Nothing Phone (1)");
        caps.setCapability("udid", "P2127I002942");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","14");
        caps.setCapability("automationName", "UiAutomator2"); // Changed from "Appium"
        caps.setCapability("appPackage","com.google.android.calculator");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");

        // Create the URL
        URL url = new URL("http://192.168.1.137:4723/");

        // Create the driver
        driver = new AndroidDriver(url,caps);

        // Set the timeout
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Return the driver
        return driver;
    }

    /**
     * This method will quit the driver
     */
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}