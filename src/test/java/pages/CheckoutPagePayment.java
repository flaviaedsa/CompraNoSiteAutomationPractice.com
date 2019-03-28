package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPagePayment extends CheckoutPageShipping {
    public CheckoutPagePayment(WebDriver navegador) {
        super(navegador);
    }

    public String getvalorTotal() {

        return navegador.findElement(By.cssSelector("#total_price")).getText();
    }

    public CheckoutPagePayment clickPayByBankWire(){

        navegador.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a")).click();

        return this;
    }

    public CheckoutPagePayment clickIConfirMyOrder(){

        navegador.findElement(By.cssSelector("#cart_navigation > button > span")).click();

        return this;
    }

    public String getcompraFinalizada(){

        return  navegador.findElement(By.cssSelector("#center_column > div > p > strong")).getText();

    }
}
