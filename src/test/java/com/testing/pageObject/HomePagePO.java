package com.testing.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
    //Stage 1 - Element locator
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    //Stage 2 - Initialize Web Element using Selenium WebDriver
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    //Write Method to Perform Web Element Action
    public void clickCreateAccountLink(){
        CreateAccountLink.click();

    }

    public void clickSignInLink(){
        SignInLink.click();
    }



}
