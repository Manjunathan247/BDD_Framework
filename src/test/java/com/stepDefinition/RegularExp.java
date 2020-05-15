package com.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegularExp {
	@Given("^I am in amazon Signin page$")
    public void i_am_in_amazon_signin_page() throws Throwable {
        
    }

    @When("^I mouse hover on Contact&List$")
    public void i_mouse_hover_on_contactlist() throws Throwable {
        
    }

    @Then("^I should see home page$")
    public void i_should_see_home_page() throws Throwable {
        
    }

    @And("^I click on Signin button$")
    public void i_click_on_signin_button() throws Throwable {
        
    }

    @And("^I enter (.+) in username field and (.+) in password field$")
    public void i_enter_in_username_field_and_in_password_field(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @And("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        
    }
}
