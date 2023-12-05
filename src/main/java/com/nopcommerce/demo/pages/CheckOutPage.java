package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By checkOutAsAGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firstNameField = By.id("BillingNewAddress_FirstName");

    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By postcode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    By continueBtn = By.xpath("//button[@onclick='Billing.save()']");

    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");

    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By MasterCardDropDown = By.xpath("//option[contains(text(),'Master card')]");
    By visaFromDropdown = By.xpath("//option[contains(text(),'Visa')]");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropdown = By.id("ExpireMonth");
    By expireYearDropdown = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButton2 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By textCreditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By textNextDayAir = By.xpath("//span[contains(text(),'Next Day Air')]");
    By textSecondDayAir = By.xpath("//span[normalize-space()='2nd Day Air']");
    By totalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessProcessText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton1 = By.xpath("//button[contains(text(),'Continue')]");
    By radioBtn2ndDayAir = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//span[contains(.,'2nd Day Air')]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    By textYourOrderProcessed = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");


    public String verifyWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckOutAsAGuest() {
        clickOnElement(checkOutAsAGuest);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void enterEmailId(String emailId) {
        sendTextToElement(emailField, emailId);
    }

    public void enterCountryName(String countryName) {
        selectByVisibleTextFromDropDown(country, countryName);
    }

    public void enterCityName(String cityName) {
        sendTextToElement(city, cityName);
    }

    public void enterAddress1(String address) {
        sendTextToElement(address1, address);
    }

    public void enterPostcode(String postCode) {
        sendTextToElement(postcode, postCode);
    }

    public void enterPhoneNumber(String phoneNo) {
        sendTextToElement(phoneNumber, phoneNo);
    }

    public void clickOnContinue() {
        clickOnElement(continueBtn);
    }
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayAir);
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }
    public void clickOnPaymentContinueButton(){
        clickOnElement(paymentContinue);
    }
    public void selectMasterCard(String masterCard){
        selectByVisibleTextFromDropDown(MasterCardDropDown,masterCard);
    }
    public void enterCardHolderName(String holderName)
    {
        sendTextToElement(cardHolderName,holderName);
    }
    public void enterCardNumber(String card){
        sendTextToElement(cardNumber, card);

    }
    public void selectExpireMonth(String expiryMonth){
        selectByVisibleTextFromDropDown(expireMonthDropdown,expiryMonth);
    }
    public void selectExpireYear(String expiryYear){
        selectByVisibleTextFromDropDown(expireYearDropdown,expiryYear);
    }
    public void enterCardCode(String cvc){
        sendTextToElement(cardCode,cvc);
    }
    public void clickOnContinueButton2()
    {
        clickOnElement(continueButton2);
    }
    public String getCreditCardText(){
        return getTextFromElement(textCreditCard);
    }
    public String getNextDayAirText(){
        return getTextFromElement(textNextDayAir);
    }
    public String getTotalAmountText(){
        return getTextFromElement(totalAmountText);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }
    public String getOrderSuccessProcessText(){
        return getTextFromElement(orderSuccessProcessText);
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueButton1);
    }
    public String getWelcomeOurStoreText(){
        return getTextFromElement(welcomeOurStoreText);
    }
    public void clickOnSecondDayAir(){
        clickOnElement(radioBtn2ndDayAir);
    }
    public String getSecondDayAirText(){
        return getTextFromElement(secondDayAirText);
    }
    public String getTotalAmountNokiaText(){
        return getTextFromElement(totalAmountNokiaText);
    }
    public void selectVisaCard(String visa){
        selectByVisibleTextFromDropDown(visaFromDropdown,visa);
    }
    public String verifyTextYourOrderProcessed(){
        return getTextFromElement(textYourOrderProcessed);
    }

}




