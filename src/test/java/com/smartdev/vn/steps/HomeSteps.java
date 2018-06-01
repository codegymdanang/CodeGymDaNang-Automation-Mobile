package com.smartdev.vn.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.smartdev.vn.configuration.AppiumDriverConfigure;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {

	public AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	protected AndroidDriver<AndroidElement> driver;

	public void openEnterPinScreen() {
		driver = appiumDriver.getDriver();
		driver.findElement(By.xpath("//*[@text='MyPCSMobile']")).click();
	}

	public void enterPins() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Enter PIN']")));
		driver.findElement(By.xpath("//*[@text='0']")).click();
		driver.findElement(By.xpath("//*[@id='key0']")).click();
		driver.findElement(By.xpath("//*[@text='0']")).click();
		driver.findElement(By.xpath("//*[@text='0']")).click();
	}

	public void waitForAllTransactionLoaded() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='RELOAD']")));
		driver.swipe(556, 1579, 575, 1209, 410);
		driver.getKeyboard().sendKeys("");
		driver.swipe(493, 1379, 493, 1052, 349);
	}

	public String seeAllTransactionList() {
		String firstTransactionname = driver.findElement(By.xpath("//*[@id='tvTransactionName']")).getText();
		return firstTransactionname;
	}
}


/*
driver.findElement(By.xpath("//*[@text='MyPCSMobile']")).click();
driver.findElement(By.xpath("//*[@text='0']")).click();
driver.findElement(By.xpath("//*[@id='key0']")).click();
driver.findElement(By.xpath("//*[@text='0']")).click();
driver.findElement(By.xpath("//*[@text='0']")).click();
new WebDriverWait(driver, 50).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='RELOAD']")));
new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='N/A' and (./preceding-sibling::* | ./following-sibling::*)[@text='0.00€'] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@id='headerLine']]]")));
driver.swipe(556, 1579, 575, 1209, 410);
driver.getKeyboard().sendKeys("");
driver.swipe(493, 1379, 493, 1052, 349);
*/