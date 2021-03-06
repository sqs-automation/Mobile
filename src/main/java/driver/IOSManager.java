package driver;

import base.Test;
import constants.Keys;
import helper.PropertyReader;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
public class IOSManager extends DriverManager {

    @Override
    public void createDriver() throws Exception {
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("automationName","XCUITest");
        //capabilities.setCapability("autoDismissAlerts","true");
        //capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        //capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        setAppCapabilities();
        Test.attributes.put(Keys.ObjectRepository,"src/test/resources/object-repository/Locators-IOS.properties");
        driver = new IOSDriver(new URL(PropertyReader.valueOf("Driver.ServerAddress").trim()), capabilities);
    }

    private void setAppCapabilities()
    {
        if(PropertyReader.valueOf("Driver.InstallMobileAppForEveryRun").trim().equalsIgnoreCase("yes")){
            //capabilities.setCapability("app","src/test/resources/apps/"+PropertyReader.valueOf("Application.Name").trim()+".ipa");
           capabilities.setCapability("app", "/Users/ubp/Documents/GetGopayCode/Mobile/src/test/resources/apps/Getgo.ipa");

        }else{
            capabilities.setCapability("bundleId",PropertyReader.valueOf("Application.IOS.BundleID").trim());
        }
    }
}