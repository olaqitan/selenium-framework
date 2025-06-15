package com.testing.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
    //Element locator
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "SignIn")
    public static WebElement SignInLink;

    //Initialize Web Element using Selenium WebDriver
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
