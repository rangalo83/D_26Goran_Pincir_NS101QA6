package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{
    private By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getAddToCart(){
        return getDriver().findElement(addToCart);
    }
    public WebElement getCart(){
        return getDriver().findElement(cart);
    }

    public void addToCart(){
        getAddToCart().click();
    }

    public void cartContent(){
        getCart().click();
    }
}
