package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageAddress extends CheckoutPageSignIn {
    public CheckoutPageAddress(WebDriver navegador) {
        super(navegador);
    }

    public String getNomeCompleto() {

        return navegador.findElement(By.cssSelector("#address_delivery .address_firstname")).getText();
    }

    public String getEndereco() {

        return navegador.findElement(By.cssSelector("#address_delivery .address_address1")).getText();
    }

    public String getCidadeEstado() {

        return navegador.findElement(By.cssSelector("#address_delivery .address_city")).getText();
    }

    public String getPhoneMobile() {

        return navegador.findElement(By.cssSelector("#address_delivery .address_phone_mobile")).getText();
    }

    public CheckoutPageShipping clickProceedCheckout(){

        navegador.findElement(By.name("processAddress")).click();

        return new CheckoutPageShipping(navegador);
    }
}
