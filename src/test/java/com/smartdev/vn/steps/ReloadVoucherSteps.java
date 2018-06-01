package com.smartdev.vn.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.smartdev.vn.configuration.AppiumDriverConfigure;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

public class ReloadVoucherSteps extends ScenarioSteps {

	public AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	protected AndroidDriver<AndroidElement> driver;
	
	public void reloadVoucherScreen() {
		driver = appiumDriver.getDriver();
		driver.findElement(By.xpath("//*[@text='RELOAD']")).click();
	}

	public void enterVoucherNumber(String voucherNumber) {
		//*[@id='edtVoucher']
		driver.findElement(By.xpath("//*[@id='edtVoucher']")).sendKeys(voucherNumber);
	}

	public void clickReloadButton() {
		driver.hideKeyboard();
		new WebDriverWait(driver, 50).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='RELOAD']")));
		driver.findElement(By.xpath("//*[@text='RELOAD']")).click();
	}

	public String getReloadVoucherResult() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Reload failed']")));
		return driver.findElement(By.xpath("//*[@text='Reload failed']")).getText();
	}
}
