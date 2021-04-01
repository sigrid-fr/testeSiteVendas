package io.cucumber.sigrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.pt.*;
import io.cucumber.sigrid.servicos.Configuracao;

public class CadastroProdutoSteps {

  @Dado("que clico na aba produtos")
  public void que_clico_na_aba_produtos() {
    Configuracao.browser.findElement(By.cssSelector("a[href='/produtos']")).click();
  }

  @Quando("clico no botao novo produto")
  public void clico_no_botao_novo_produto() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/produtos/new")));
    input.click();
  }

  @E("escrevo no campo nome produto {string}")
  public void escrevo_no_campo_nome_produto(String string){
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("produto_nome")));
		input.sendKeys(string);
  }

  @E("escrevo no campo descricao {string}")
  public void escrevo_no_campo_descricao(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("produto_descricao")));
		input.sendKeys(string);
  }

  @E("escrevo no campo quantidade {string}")
  public void escrevo_no_campo_email(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("produto_quantidade")));
		input.sendKeys(string);
  }

  @E("escrevo no campo vencimento {string}")
  public void escrevo_no_campo_vencimento(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("produto_vencimento")));
		input.sendKeys(string);
  }

  @E("escrevo no campo precoCompra {string}")
  public void escrevo_no_campo_precoCompra(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("produto_preco_compra")));
		input.sendKeys(string);
  }

  @E("escrevo no campo precoVenda {string}")
  public void escrevo_no_campo_precoVenda(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("produto_preco_venda")));
		input.sendKeys(string);
  }

  @Entao("clico no botao salvar produto")
  public void clico_no_botao_salvar_produto() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
    input.click();
  }

}