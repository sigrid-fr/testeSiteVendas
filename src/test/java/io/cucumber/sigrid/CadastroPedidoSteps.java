package io.cucumber.sigrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.pt.*;
import io.cucumber.sigrid.servicos.Configuracao;
import org.openqa.selenium.support.ui.Select;

public class CadastroPedidoSteps {

  @Dado("que clico na aba pedidos")
  public void que_clico_na_aba_pedidos() {
    Configuracao.browser.findElement(By.cssSelector("a[href='/pedidos']")).click();
  }

  @Quando("clico no botao novo pedido")
  public void clico_no_botao_novo_pedido() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/pedidos/new")));
    input.click();
  }

  @E("clico no seletor de clientes")
  public void clico_no_seletor_de_clientes() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("pedido_cliente_id")));
    input.click();
  }

  @E("clico no novo cliente")
  public void clico_no_novo_cliente() {
    Select pedido_cliente_id = new Select(Configuracao.browser.findElement(By.id("pedido_cliente_id")));
    pedido_cliente_id.selectByVisibleText("Sigrid");
    //pedido_cliente_id.selectByIndex(17);
  }

  @Entao("clico no botao salvar pedido")
  public void clico_no_botao_salvar_pedido() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
    input.click();
  }

  @E("clico no botao voltar")
  public void clico_no_botao_voltar() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-default")));
    input.click();
  }

  @E("seleciono o cliente para vincular produto")
  public void seleciono_o_cliente_para_vincular_produto() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/pedidos/50/pedido_produtos")));
    input.click();
  }

  @E("clico no botao novo pedido a ser vinculado")
  public void clico_no_botao_novo_pedido_a_ser_vinculado() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/pedidos/50/pedido_produtos/new")));
    input.click();
  }

  @E("clico no seletor de produtos")
  public void clico_no_seletor_de_produtos() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("pedido_produto_produto_id")));
    input.click();
  }

  @E("clico no novo produto")
  public void clico_no_novo_produto() {
    Select pedido_cliente_id = new Select(Configuracao.browser.findElement(By.id("pedido_produto_produto_id")));
    pedido_cliente_id.selectByVisibleText("Fones de Ouvido");
  }

  @E("escrevo no campo valor {string}")
  public void escrevo_no_campo_valor(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("pedido_produto_valor")));
	input.sendKeys(string);
  }

  @Entao("clico no botao salvar pedido vinculado")
  public void clico_no_botao_salvar_pedido_vinculado() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
    input.click();
    Configuracao.fechar();
  }

}