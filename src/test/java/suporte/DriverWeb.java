package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DriverWeb {

    public static WebDriver createChrome() {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("http://www.automationpractice.com");
        navegador.manage().window().maximize();

        return navegador;
    }
}
