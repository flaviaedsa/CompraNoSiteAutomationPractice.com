package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageShipping extends CheckoutPageAddress {
    public CheckoutPageShipping(WebDriver navegador) {
        super(navegador);
    }

    public CheckoutPageShipping clickAceptTermsOfService(){

        navegador.findElement(By.cssSelector("#cgv")).click();

        return new CheckoutPagePayment(navegador);
    }

    public CheckoutPagePayment clickProceedToCheckout(){

        navegador.findElement(By.cssSelector("form > p > button > span")).click();

        return new CheckoutPagePayment(navegador);
    }
}
