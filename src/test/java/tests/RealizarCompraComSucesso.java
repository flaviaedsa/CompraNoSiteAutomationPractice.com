package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPageAddress;
import pages.CheckoutPagePayment;
import pages.VitrinePage;
import suporte.DriverWeb;
import suporte.Generator;
import suporte.Screenshot;

public class RealizarCompraComSucesso {
    private WebDriver navegador;


    @Before
    public void setUp() {
        navegador = DriverWeb.createChrome();

    }

    @Test
    public void testRealizarCompraComSucesso() throws InterruptedException {
        VitrinePage produto = new VitrinePage(navegador)
                .clickProduto()
                .clickAddToCart();
        String produtoAdicionado = produto.getTextoCarrinho();
        Assert.assertEquals("Product successfully added to your shopping cart", produtoAdicionado);
        Screenshot.tirar(navegador, "C:/TestReport/Compra/" + Generator.dataHoraParaArquivo() + "Produto no carrinho.png");

        CheckoutPageAddress address = produto.clickProceedToCheckout()
                .clickProceedToCheckout()
                .clickEmailParaCriarConta()
                .clickCreatecreateAnAccount()
                .preencherYourPersonalInformation()
                .preencherYourAddress()
                .preencherYourAddressEscolherState()
                .clickRegister();
       String nomeCompleto = address.getNomeCompleto();
       Assert.assertEquals("Flavia Batista", nomeCompleto);
       String endereco = address.getEndereco();
       Assert.assertEquals("Rua Teste da Silva",endereco);
       String cidadeEstado = address.getCidadeEstado();
       Assert.assertEquals("Cidade Teste, Alabama 00000", cidadeEstado);
       String phoneMobile = address.getPhoneMobile();
       Assert.assertEquals("+551199998888", phoneMobile);

       CheckoutPagePayment payment = address.clickProceedCheckout()
                 .clickAceptTermsOfService()
                 .clickProceedToCheckout();
       String valorTotal =  payment.getvalorTotal();
       Assert.assertEquals("$30.16", valorTotal);
       Screenshot.tirar(navegador, "C:/TestReport/Compra/" + Generator.dataHoraParaArquivo() + "Valor total da compra.png");
                 payment.clickPayByBankWire()
                 .clickIConfirMyOrder();

        String compraFinalizada = payment.getcompraFinalizada();
        Assert.assertEquals("Your order on My Store is complete.", compraFinalizada);
        Screenshot.tirar(navegador, "C:/TestReport/Compra/" + Generator.dataHoraParaArquivo() + "Compra finalaizada com sucesso.png");

    }

    @After
    public void tearDown() {
        navegador.quit();
    }

}



