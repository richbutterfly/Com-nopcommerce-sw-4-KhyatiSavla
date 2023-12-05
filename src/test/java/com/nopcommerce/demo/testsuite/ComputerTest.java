package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 1. Create class “ComputerTest” into testsuite package
 Write the following Test:
 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 1.1 Click on Computer Menu.
 1.2 Click on Desktop
 1.3 Select Sort By position "Name: Z to A"
 1.4 Verify the Product will arrange in Descending order.
 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 2.1 Click on Computer Menu.
 2.2 Click on Desktop
 2.3 Select Sort By position "Name: A to Z"
 2.4 Click on "Add To Cart"
 2.5 Verify the Text "Build your own computer"
 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 2.7.Select "8GB [+$60.00]" using Select class.
 2.8 Select HDD radio "400 GB [+$100.00]"
 2.9 Select OS radio "Vista Premium [+$60.00]"
 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
 [+$5.00]"
 2.11 Verify the price "$1,475.00"
 2.12 Click on "ADD TO CARD" Button.
 2.13 Verify the Message "The product has been added to your shopping cart" on Top
 green Bar
 After that close the bar clicking on the cross button.
 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 2.15 Verify the message "Shopping cart"
 2.16 Change the Qty to "2" and Click on "Update shopping cart"
 2.17 Verify the Total"$2,950.00"
 2.18 click on checkbox “I agree with the terms of service”
 2.19 Click on “CHECKOUT”
 2.20 Verify the Text “Welcome, Please Sign In!”
 2.21Click on “CHECKOUT AS GUEST” Tab
 2.22 Fill the all mandatory field
 2.23 Click on “CONTINUE”
 2.24 Click on Radio Button “Next Day Air($0.00)”
 2.25 Click on “CONTINUE”
 2.26 Select Radio Button “Credit Card”
 2.27 Select “Master card” From Select credit card dropdown
 2.28 Fill all the details
 2.29 Click on “CONTINUE”
 2.30 Verify “Payment Method” is “Credit Card”
 2.32 Verify “Shipping Method” is “Next Day Air”
 2.33 Verify Total is “$2,950.00”
 2.34 Click on “CONFIRM”
 2.35 Verify the Text “Thank You”
 2.36 Verify the message “Your order has been successfully processed!”
 2.37 Click on “CONTINUE”
 2.37 Verify the text “Welcome to our store”
 *
 */
public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        // 1.1 Click on Computer Menu.
        homePage.mouseHooverOnComputers();
        //1.2 Click on Desktop
        homePage.clickOnDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectSortByZToA();
        //1.4 Verify the Product will arrange in Descending order.
        List<WebElement> products = driver.findElements(By.xpath("//h2/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h2/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName, "Product not sorted into Z to A order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Click on Computer Menu.
        homePage.mouseHooverOnComputers();
        //2.2 Click on Desktop
        homePage.clickOnDesktops();
        //2.3 Select Sort By position "Name: A to Z"
        desktopsPage.selectSortByAToZ();
        //2.4 Click on "Add To Cart"
        desktopsPage.clickOnAddToCart();
        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.verifyBuildYourOwnComputer();
        Assert.assertEquals(actualText, expectedText);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputerPage.selectRAM("8GB [+$60.00]");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.selectHDD();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectOS();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.clickOnCheckBox1();
        //2.11 Verify the price "$1,475.00"
        String expectedText1 = "$1,475.00";
        String actualText1 = buildYourOwnComputerPage.verifyPrice();
        Assert.assertEquals(actualText1, expectedText1);
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        buildYourOwnComputerPage.verifyTextProductAdded();
        //After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.clickOnCloseButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.clickOnShoppingCart();
        //2.15 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartText();
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.clearQuantity();
        shoppingCartPage.addQuantity();
        shoppingCartPage.updateShoppingCart();
        //2.17 Verify the Total"$2,950.00"
        shoppingCartPage.verifyTotalPrice();
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.termOfService();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        checkOutPage.verifyWelcomeText();
        //2.21Click on “CHECKOUT AS GUEST” Tab
        checkOutPage.clickOnCheckOutAsAGuest();
        //2.22 Fill the all mandatory field
        checkOutPage.enterFirstName("Spider");
        checkOutPage.enterLastName("Black");
        checkOutPage.enterEmailId("Spiderman01@gmail.com");
        checkOutPage.enterCountryName("India");
        checkOutPage.enterCityName("Ahmedabad");
        checkOutPage.enterAddress1("123 Satellite");
        checkOutPage.enterPostcode("123456");
        checkOutPage.enterPhoneNumber("4545455454");
        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinue();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnNextDayAirRadioButton();
        //2.25 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton1();
        //2.26 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCard();
        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectMasterCard("Master card");
        //2.28 Fill all the details
        checkOutPage.enterCardHolderName("Spider");
        checkOutPage.enterCardNumber("5555 5537 5304 8194");
        checkOutPage.selectExpireMonth("5");
        checkOutPage.selectExpireYear("2030");
        checkOutPage.enterCardCode("555");
        //2.29 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton2();
        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkOutPage.getCreditCardText(), "Credit Card", "Error");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkOutPage.getNextDayAirText(), "Next Day Air", "Error");
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(checkOutPage.getTotalAmountText(), "$2,950.00", "Error");
        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(checkOutPage.getThankYouText(), "Thank You", "Error");
        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedTxt = "Your order has been successfully processed!";
        String actualTxt = checkOutPage.getOrderSuccessProcessText();
        Assert.assertEquals(actualTxt, expectedTxt);
        //2.37 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton3();
        //2.37 Verify the text “Welcome to our store”
        String actualMessage = checkOutPage.getWelcomeOurStoreText();
        Assert.assertEquals(actualMessage,"Welcome to our store");
    }
}


