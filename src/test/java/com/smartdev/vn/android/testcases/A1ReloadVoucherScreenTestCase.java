package com.smartdev.vn.android.testcases;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/reloadvoucher/reloadvoucher.feature",
					glue="com.smartdev.vn")
public class A1ReloadVoucherScreenTestCase {

}
