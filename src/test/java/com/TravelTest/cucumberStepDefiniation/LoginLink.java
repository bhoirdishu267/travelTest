package com.TravelTest.cucumberStepDefiniation;

import org.testng.asserts.SoftAssert;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.LoginRepo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLink {
	BrowserOption op;
	LoginRepo Login;
	

		@Given("user launch an chrome browser")
		public void user_launch_an_chrome_browser() {
			op = new BrowserOption();
			Login = new LoginRepo(op.launchBrowser("chrome"));
			
		    
		}

		@Given("user navigate to travel test website")
		public void user_navigate_to_travel_test_website() throws Exception {
			op.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
			Thread.sleep(2000);
			
		    
		}

		@When("user click on login link")
		public void user_click_on_login_link() throws Exception{
			Login.loginLink();
			Thread.sleep(2000);

			
		   
		}

		@When("verfiy login page has been open or not")
		public void verfiy_login_page_has_been_open_or_not() {
			SoftAssert soft = new SoftAssert();
			try {
				soft.assertEquals(op.currentURL(),"https://travel-test-bug.vercel.app/login");
				soft.assertAll();
				
			} catch (AssertionError e) {
				op.quit();
				soft.assertAll();
				
			}
		    
		}

		@Then("user close chrome browser")
		public void user_close_chrome_browser() throws Exception {
			Thread.sleep(2000);
op.quit();
		   
		}



}
