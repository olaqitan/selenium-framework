package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {
    //Stage 1 - Element locator
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement PasswordConfirmationField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;

    //Stage 2 - Initialize Web Element using Selenium WebDriver
    public CreateAccountPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    //Stage 3 - Write Method to Perform Element Action
    public void enterFirstName(String FirstName){
        FirstNameField.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        LastNameField.sendKeys(LastName);
    }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        PasswordConfirmationField.sendKeys(ConfirmPassword);
    }
    public void clickCreateAnAccountButton(){
        CreateAccountButton.click();
    }


}




