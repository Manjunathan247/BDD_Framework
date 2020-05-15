package com.stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTablePractice {
	@Given("^I am in flipkart Signup page$")
    public void i_am_flipkart_in_signup_page() throws Throwable {
       System.out.println("I am flipkart in Signup page");
    }

    @When("^I enter my details in respectice field$")
    public void i_enter_my_details_in_respectice_field(DataTable data) throws Throwable {
       List<List<String>> details = data.raw();
       String name = details.get(0).get(0);
       int age = Integer.parseInt(details.get(0).get(1));
       Long mobileNumber = Long.parseLong(details.get(0).get(2));
       System.out.println(name);
       System.out.println(age);
       System.out.println(mobileNumber);
    }

    @And("^I click on signup button$")
    public void i_click_on_signup_button() throws Throwable {
       System.out.println("I click on signup button");
    }
    
    @Then("^I should see successful message$")
    public void i_should_see_successful_message() throws Throwable {
       System.out.println("I should see successful message");
    }
}
