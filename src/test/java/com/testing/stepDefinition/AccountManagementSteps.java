package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;

    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);


    }

    @And("I click on Create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAnAccountButton();

    }

    @Then("My Account Page is displayed")
    public void myAccountPageIsDisplayed() {
        String ExpectedResult = "My Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }


    @Then("Error message should display showing account already exist")
    public void errorMessageShouldDisplayShowingAccountAlreadyExist() {
        String ExpectedResult = "Create New Customer Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Given("I am on Account login page")
    public void iAmOnAccountLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("I enter  {string} {string}")
    public void iEnter(String Email, String Password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEmail(Email);
        signInPagePO.enterPassword(Password);

    }

    @And("I click on SignInButton")
    public void iClickSignInButton() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.ClickSignInButton();
    }

    @Then("Account is login successfully")
    public void accountIsLoginSuccessfully() {
        String ExpectedResult = "Customer SignIn";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }


    @Then("Error should display showing Unregistered customer cannot login")
    public void errorShouldDisplayShowingUnregisteredCustomerCannotLogin() {
        String ExpectedResult = "Customer SignIn";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }
}
