package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By textBuildYourOwnComputer = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processorLink = By.id("product_attribute_1");
    By ramLink = By.id("product_attribute_2");
    By hddLink = By.xpath("//input[@id='product_attribute_3_7']");
    By osLink = By.xpath("By.id(product_attribute_4_9);");
    By softwareLink = By.xpath("//input[@id='product_attribute_5_12']");
    By priceText = By.xpath("//span[@id='price-value-1']");
    By add2CartLink = By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By price = By.xpath("//span[@id='price-value-1']");
    By closeButton = By.xpath("//span[@title='Close']");

    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public String verifyBuildYourOwnComputer() {
        return getTextFromElement(textBuildYourOwnComputer);
    }
    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorLink, processor);
    }
    public void selectRAM(String ram) {
        selectByVisibleTextFromDropDown(ramLink, ram);
    }
    public void selectHDD() {
        clickOnElement(hddLink);
    }
    public void selectOS() {
        clickOnElement(osLink);
    }
    public void clickOnCheckBox1() {
        clickOnElement(softwareLink);
    }
    public String verifyTextProductAdded (){
        return getTextFromElement(productAddedText);
    }
    public void clickOnAddToCart(){
        clickOnElement(add2CartLink);
    }
public String verifyProductAddedText (){
        return getTextFromElement(productAddedText);
}
    public String verifyPrice() {
        return getTextFromElement(price);
    }
    public void clickOnCloseButton (){
        clickOnElement(closeButton);
    }
    public void clickOnShoppingCart (){
        mouseHoverToElementAndClick(shoppingCart);
    }

}