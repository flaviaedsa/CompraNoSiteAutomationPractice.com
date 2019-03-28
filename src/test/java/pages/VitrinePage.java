package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VitrinePage extends BasePage {

    public VitrinePage(WebDriver navegador) {
        super(navegador);
    }

    public VitrinePage clickProduto(){
        navegador.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")).click();

        return this;
    }

    public VitrinePage clickAddToCart(){
        navegador.findElement(By.id("add_to_cart")).click();

        return this;
    }

    public String getTextoCarrinho(){
        waitElemetCSS("#layer_cart .button-container a");
        return navegador.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")).getText();

    }

    public CheckoutPageSummary clickProceedToCheckout(){
        navegador.findElement(By.cssSelector("#layer_cart .button-container a")).click();

        return new CheckoutPageSummary(navegador);
    }

 }


