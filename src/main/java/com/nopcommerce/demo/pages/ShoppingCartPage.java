package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By clearQty = By.xpath("//input[@id='itemquantity11267']");
    By addQty = By.xpath("//input[@id='itemquantity11267']");
    By verifyQty = By.xpath("//input[@id='itemquantity11240']");
    By updateCart = By.xpath("//button[@id='updatecart']");
    By totalPrice = By.xpath("//span[@class='value-summary']//strong");
    By termOfService = By.xpath("//input[@id='termsofservice']");

    By checkOut = By.xpath("//button[@id='checkout']");

    public String verifyShoppingCartText (){
        return getTextFromElement(shoppingCartText);
    }
    public void clearQuantity (){
        clearText(clearQty);
    }
    public void addQuantity (){
        sendTextToElement(addQty,"2");
    }
    public void updateShoppingCart (){
        clickOnElement(updateCart);
    }
    public String verifyTotalPrice (){
        return getTextFromElement(totalPrice);
    }
    public void termOfService(){
        clickOnElement(termOfService);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }
    public void verifyQuantity (){
        sendTextToElement(verifyQty,"2");
    }

}
