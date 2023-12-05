package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {
    By welcomeToOurStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By logOut = By.xpath("//a[normalize-space()='Log out']");
    By topMenu = By.xpath("//ul[@class = 'top-menu notmobile']");

    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktops = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void clickOnLoginLink (){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void mouseHooverOnComputers(){
        mouseHoverToElement(computerLink);
    }
    public void clickOnDesktops (){
        clickOnElement(desktops);
    }
    public void mouseHooverOnElectronics(){
        mouseHoverToElement(electronicsLink);
    }
    public void clickOnCellPhones (){
        clickOnElement(cellPhones);
    }
    public String verifyWelcomeToOurStoreText (){
        return getTextFromElement(welcomeToOurStoreText);
    }
    public void clickOnLogOutLink (){
        clickOnElement(logOut);
    }

    public String findAllTabsFromTOpMenu (){
        List<WebElement> findResults = driver.findElements(topMenu);
        ArrayList<String> findResult = new ArrayList<>();
        for (WebElement e : findResults){
            findResult.add(e.getText());
        }
        for (String result : findResult){
            System.out.print(result);
            return result;
        }
        return null;
    }

}
