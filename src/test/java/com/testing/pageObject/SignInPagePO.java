package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {

    //Step 1 - Element locators

    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(name="login[password]")
    public static WebElement PasswordField;

    @FindBy(css = "send2 > span")
    public static WebElement ClickSignInButton;


    //Stage 2 - Initialize Web Element using Selenium WebDriver
    public SignInPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    //Stage 3 - Write Method to Perform Element Action
    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void ClickSignInButton(){
        ClickSignInButton.click();
    }









}
