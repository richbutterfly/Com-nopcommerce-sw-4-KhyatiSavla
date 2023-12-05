package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {

    By sortBy = By.xpath("//select[@id='products-orderby']");
    By productPath = By.xpath("//h2/a");
    By addToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");

    public void selectSortByZToA (){
       selectByVisibleTextFromDropDown(sortBy,"Name: Z to A");
    }
    public void selectSortByAToZ (){
        selectByVisibleTextFromDropDown(sortBy,"Name: A to Z");
    }

    public void clickOnAddToCart (){
        clickOnElement(addToCart);
    }
}
