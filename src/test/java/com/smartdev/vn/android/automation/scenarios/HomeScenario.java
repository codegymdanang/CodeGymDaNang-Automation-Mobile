package com.smartdev.vn.android.automation.scenarios;

import static org.junit.Assert.assertEquals;

import com.smartdev.vn.steps.HomeSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomeScenario {
	
	@Steps
	HomeSteps homeStep;
	
	@Given("^I am on the enter pin$")
	public void openEnterPinScreen() {
		homeStep.openEnterPinScreen();
	}
	
	@And("^I enter pin numbers$")
	public void enterPins() {
		homeStep.enterPins();
	}
	
	@And("^I wait for all transaction list to be loaded$")
	public void waitForAllTransactionLoaded() {
		homeStep.waitForAllTransactionLoaded();
	}
	
	@Then("^I should see the transaction list$")
	public void seeAllTransactionList() {
		String expectedResult = "N/A";
		String actualResult = homeStep.seeAllTransactionList();
		assertEquals(expectedResult,actualResult);
	}

}
