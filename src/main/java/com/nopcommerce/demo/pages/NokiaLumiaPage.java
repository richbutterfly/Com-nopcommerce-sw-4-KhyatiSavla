package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {
    By textNokiaLumia1020 = By.xpath("//h1");
    By price =  By.id("price-value-20");
    By cartQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.id("add-to-cart-button-20");
    By textProductAddedToCart =  By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeTheBarMsg = By.xpath("//span[@title='Close']");
    By shoppingCartElement = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartElement = By.xpath("//button[contains(text(),'Go to cart')]");

    public String verifyTextNokiaLumia1020 (){
        return getTextFromElement(textNokiaLumia1020);
    }
    public String verifyNokiaPriceText() {
        return getTextFromElement(price);
    }

    public void changeQuantity() {
        sendTextToElement(cartQuantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String getTextFromProductAddedToCart() {
        return getTextFromElement(textProductAddedToCart);
    }

    public void closeTheBarByCrossButton() {
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartElement);
    }

    public void clickOnShoppingCart() {
        clickOnElement(goToCartElement);
    }
}
