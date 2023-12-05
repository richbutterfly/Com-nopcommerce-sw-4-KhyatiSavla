package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellphonePage extends Utility {

    By cellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");
    By listView = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public String verifyCellPhoneText (){
        return getTextFromElement(cellPhoneText);
    }
    public void clickOnListView (){
        clickOnElement(listView);
    }
    public void clickOnNokiaLumia1020Link (){
        clickOnElement(nokiaLumia1020);
    }

}
