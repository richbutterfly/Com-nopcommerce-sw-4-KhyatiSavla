package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[normalize-space()='Register']");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.name("register-button");
    By textRegisterComplete = By.xpath("//div[@class='result']");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");


    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton (){
        clickOnElement(registerButton);
    }

    public String verifyRegisterText (){
        return getTextFromElement(registerText);
    }
    public String verifyTextRegistrationComplete (){
        return getTextFromElement(textRegisterComplete);
    }
    public void clickOnContinueButton (){
        clickOnElement(continueButton);
    }
}
