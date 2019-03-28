package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected WebDriver navegador;


    public BasePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public void waitElemetCSS(String parCss) {
        WebDriverWait wait = new WebDriverWait(navegador, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector((parCss))));
        navegador.getWindowHandles();
    }
}
