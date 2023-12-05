package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1. Create the class ElectronicsTest
 * Write the following test
 * 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 * 1.1 Mouse Hover on “Electronics” Tab
 * 1.2 Mouse Hover on “Cell phones” and click
 * 1.3 Verify the text “Cell phones”
 * 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 * 2.1 Mouse Hover on “Electronics” Tab
 * 2.2 Mouse Hover on “Cell phones” and click
 * 2.3 Verify the text “Cell phones”
 * 2.4 Click on List View Tab
 * 2.5 Click on product name “Nokia Lumia 1020” link
 * 2.6 Verify the text “Nokia Lumia 1020”
 * 2.7 Verify the price “$349.00”
 * 2.8 Change quantity to 2
 * 2.9 Click on “ADD TO CART” tab
 * 2.10 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.12 Verify the message "Shopping cart"
 * 2.13 Verify the quantity is 2
 * 2.14 Verify the Total $698.00
 * 2.15 click on checkbox “I agree with the terms of service”
 * 2.16 Click on “CHECKOUT”
 * 2.17 Verify the Text “Welcome, Please Sign In!”
 * 2.18 Click on “REGISTER” tab
 * 2.19 Verify the text “Register”
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “REGISTER” Button
 * 2.22 Verify the message “Your registration completed”
 * 2.23 Click on “CONTINUE” tab
 * 2.24 Verify the text “Shopping card”
 * 2.25 click on checkbox “I agree with the terms of service”
 * 2.26 Click on “CHECKOUT”
 * 2.27 Fill the Mandatory fields
 * 2.28 Click on “CONTINUE”
 * 2.29 Click on Radio Button “2nd Day Air ($0.00)”
 * 2.30 Click on “CONTINUE”
 * 2.31 Select Radio Button “Credit Card”
 * 2.32 Select “Visa” From Select credit card dropdown
 * 2.33 Fill all the details
 * 2.34 Click on “CONTINUE”
 * 2.35 Verify “Payment Method” is “Credit Card”
 * 2.36 Verify “Shipping Method” is “2nd Day Air”
 * 2.37 Verify Total is “$698.00”
 * 2.38 Click on “CONFIRM”
 * 2.39 Verify the Text “Thank You”
 * 2.40 Verify the message “Your order has been successfully processed!”
 * 2.41 Click on “CONTINUE”
 * 2.42 Verify the text “Welcome to our store
 * 2.43 Click on “Logout” link
 * 2.44 Verify the URL is “https://demo.nopcommerce.com/
 */
public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellphonePage cellphonePage = new CellphonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHooverOnElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhones();
        //1.3 Verify the text “Cell phones"
        String actualText = cellphonePage.verifyCellPhoneText();
        Assert.assertEquals(actualText, "Nokia Lumia 1020” link");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        // 2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHooverOnElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhones();
        //2.3 Verify the text “Cell phones”
        String actualText1 = cellphonePage.verifyCellPhoneText();
        Assert.assertEquals(actualText1, "Nokia Lumia 1020” link");
        //2.4 Click on List View Tab
        cellphonePage.clickOnListView();
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellphonePage.clickOnNokiaLumia1020Link();
        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(nokiaLumiaPage.verifyTextNokiaLumia1020(), "Nokia Lumia 1020");
        //2.7 Verify the price “$349.00”
        Assert.assertEquals(nokiaLumiaPage.verifyNokiaPriceText(), "$349.00");
        //2.8 Change quantity to 2
        nokiaLumiaPage.changeQuantity();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.clickOnAddToCartButton();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = nokiaLumiaPage.getTextFromProductAddedToCart();
        Assert.assertEquals(actualMessage, expectedMessage);
        // After that close the bar clicking on the cross button.
        nokiaLumiaPage.closeTheBarByCrossButton();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnShoppingCart();
        //2.12 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartText();
        //2.13 Verify the quantity is 2
        shoppingCartPage.verifyQuantity();
        //2.14 Verify the Total $698.00
        Assert.assertEquals(shoppingCartPage.verifyTotalPrice(), "$698.00");
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.termOfService();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        loginPage.getWelcomeText();
        //2.18 Click on “REGISTER” tab
        homePage.clickOnRegisterLink();
        //2.19 Verify the text “Register”
        Assert.assertEquals(registerPage.verifyRegisterText(), "Register");
        //2.20 Fill the mandatory fields
        registerPage.enterFirstName("Spider");
        registerPage.enterLastName("Black");
        registerPage.enterEmailId("Spiderman01@gmail.com");
        registerPage.enterPassword("455445");
        registerPage.enterConfirmPassword("455445");
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        String expectedMsg = "Your registration completed";
        String actualMsg = registerPage.verifyTextRegistrationComplete();
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueButton();
        //2.24 Verify the text “Shopping card”
        shoppingCartPage.verifyShoppingCartText();
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.termOfService();
        // 2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //2.27 Fill the Mandatory fields
        checkOutPage.enterFirstName("Spider");
        checkOutPage.enterLastName("Black");
        checkOutPage.enterEmailId("Spiderman01@gmail.com");
        checkOutPage.enterCountryName("India");
        checkOutPage.enterCityName("Ahmedabad");
        checkOutPage.enterAddress1("123 Satellite");
        checkOutPage.enterPostcode("123456");
        checkOutPage.enterPhoneNumber("4545455454");
        //2.28 Click on “CONTINUE”
        checkOutPage.clickOnContinue();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.clickOnSecondDayAir();
        //2.30 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton1();
        //2.31 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCard();
        //2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.selectVisaCard("Visa");
        //2.33 Fill all the details
        checkOutPage.enterCardHolderName("Spider");
        checkOutPage.enterCardNumber("4111 1111 1111 1111");
        checkOutPage.selectExpireMonth("10");
        checkOutPage.selectExpireYear("2030");
        checkOutPage.enterCardCode("777");
        //2.34 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton2();
        //2.35 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkOutPage.getCreditCardText(), "Credit Card", "Error");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(checkOutPage.getSecondDayAirText(), "2nd Day Air", "Error");
        //2.37 Verify Total is “$698.00”
        Assert.assertEquals(checkOutPage.getTotalAmountNokiaText(), "$698.00");
        //2.38 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();
        //2.39 Verify the Text “Thank You”
        Assert.assertEquals(checkOutPage.getThankYouText(), "Thank You");
        //2.40 Verify the message “Your order has been successfully processed!”
        checkOutPage.verifyTextYourOrderProcessed();
        //2.41 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton3();
        //2.42 Verify the text “Welcome to our store”
        homePage.verifyWelcomeToOurStoreText();
        //2.43 Click on “Logout” link
        homePage.clickOnLogOutLink();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/"
        String expectedURL = "https://demo.nopcommerce.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

}


