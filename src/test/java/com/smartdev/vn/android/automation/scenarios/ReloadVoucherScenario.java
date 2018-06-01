package com.smartdev.vn.android.automation.scenarios;

import static org.junit.Assert.assertEquals;

import com.smartdev.vn.steps.ReloadVoucherSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ReloadVoucherScenario {

	@Steps
	private ReloadVoucherSteps step;
	
	
	@Given("^I am on the reload voucher screen$")
	public void reloadVoucherScreen() {
		step.reloadVoucherScreen();
	}
	
	@When("^I enter my voucher number as \"([^\"]*)\"$")
	public void enterVoucherNumber(String voucherNumber) {
		step.enterVoucherNumber(voucherNumber);
	}
	
	@And("^I click reload button$")
	public void clickReloadButton() {
		step.clickReloadButton();
	}
	
	@Then("^I should see \\\"([^\\\"]*)\\\"$")
	public void checkReloadVoucherResult(String expectedResult) {
		String actualResult = step.getReloadVoucherResult();
		assertEquals(expectedResult,actualResult);
	}
	
}
