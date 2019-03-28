package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Date;

public class CheckoutPageSignIn extends BasePage {
    public CheckoutPageSignIn(WebDriver navegador) {
        super(navegador);
    }

    public CheckoutPageSignIn clickEmailParaCriarConta() throws InterruptedException {

        String email = "flavia" + new Date().getTime() + "@teste.com.br";
        navegador.findElement(By.cssSelector("#email_create")).sendKeys(email);

        return this;
    }

    public CheckoutPageSignIn clickCreatecreateAnAccount() {

        navegador.findElement(By.cssSelector("#SubmitCreate > span")).click();

        return this;
    }

    public CheckoutPageSignIn preencherYourPersonalInformation() {

        navegador.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Flavia");
        navegador.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Batista");
        navegador.findElement(By.cssSelector("#passwd")).sendKeys("123456");

        return this;
    }

    public CheckoutPageSignIn preencherYourAddress() {

        navegador.findElement(By.id("address1")).sendKeys("Rua Teste da Silva");
        navegador.findElement(By.cssSelector("#city")).sendKeys("Cidade Teste");
        navegador.findElement(By.cssSelector("#postcode")).sendKeys("00000");
        navegador.findElement(By.cssSelector("#phone_mobile")).sendKeys("+551199998888");

        return this;
    }

    public CheckoutPageSignIn preencherYourAddressEscolherState() {

        navegador.findElement(By.xpath("//*[@id=\"id_state\"]/option[2]")).click();

        return this;
    }

    public CheckoutPageAddress clickRegister() {

        navegador.findElement(By.id("submitAccount")).click();

        return new CheckoutPageAddress(navegador);
    }

}
