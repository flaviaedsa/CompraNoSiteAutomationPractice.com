package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageSummary extends BasePage {
    public CheckoutPageSummary(WebDriver navegador) {
        super(navegador);
    }

    public CheckoutPageSignIn clickProceedToCheckout(){

        navegador.findElement(By.cssSelector(".cart_navigation a.standard-checkout")).click();

        return new CheckoutPageSignIn(navegador);
    }
}
