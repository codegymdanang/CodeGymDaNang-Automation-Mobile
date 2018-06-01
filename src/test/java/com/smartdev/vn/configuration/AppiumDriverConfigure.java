package com.smartdev.vn.configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverConfigure {

	public static AppiumDriverConfigure instance = null;
	public String reportDirectory = "reports";
	public String reportFormat = "xml";
	public String testName = "Untitled";
	public AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();

	public static AppiumDriverConfigure getInstance()  {
		if (instance == null) {
			instance = new AppiumDriverConfigure();
			try {
				instance.setDriver(instance.createAndroidDriver());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instance;
	}

	public AndroidDriver<AndroidElement> createAndroidDriver() throws MalformedURLException {
		dc.setCapability("reportDirectory", reportDirectory);
		dc.setCapability("reportFormat", reportFormat);
		dc.setCapability("testName", testName);
		dc.setCapability(MobileCapabilityType.UDID, "4T5ST8R8UKN77PBA");
		driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.setLogLevel(Level.INFO);
		return driver;
	}
	
	public void setDriver(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	
	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}
	
	public static void tearDown() {
		System.out.println("END  END");
	//	driver.quit();
	}

}
