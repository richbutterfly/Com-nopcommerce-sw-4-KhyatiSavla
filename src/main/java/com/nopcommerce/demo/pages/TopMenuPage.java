package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {

public void selectMenu(String menu) {
    List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
    try {
        for (WebElement element : topMenuList) {
            if (element.getText().equalsIgnoreCase(menu)) {
                element.click();
            }
        }
    } catch (StaleElementReferenceException e) {
        topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
    }
}
}
