package com.stepDefinition;

import com.objectRepo.LoginPage;
import com.testBase.Base;
import com.utility.Constant_Values;
import com.utility.Verification;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin extends Base {
	LoginPage login;
	Verification v;
	Constant_Values cv;
	@Given("^user in \"([^\"]*)\" page$")
    public void user_in_something_page(String url) throws Throwable {
		driver.get(url);
    }

    @When("^user click on sign in button it shoud display Amazon signin page$")
    public void user_click_on_sign_in_button_it_shoud_display_amazon_signin_page() throws Throwable {
        login = new LoginPage(driver);
        login.signIn();
        cv = new Constant_Values();
        v = new Verification(driver);
        v.verifyTitle(cv.signIn_Title);
    }

    @And("^user enter mail id then click on continue button$")
    public void user_enter_mail_id_then_click_on_continue_button() throws Throwable {
    	
        login.mailId(config.username());
    }

    @And("^user enter password then click on Login button$")
    public void user_enter_password_then_click_on_login_button() throws Throwable {
        login.password(config.password());
    }
    
    @Then("^user should be in home page$")
    public void user_should_be_in_home_page() throws Throwable {
        v.verifyTitle(expected);
    }
}
