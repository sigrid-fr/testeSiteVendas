package io.cucumber.sigrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.pt.*;
import io.cucumber.sigrid.servicos.Configuracao;

public class CadastroClienteSteps {

  @Dado("clico na aba clientes")
  public void clico_na_aba_clientes() {
    Configuracao.browser.findElement(By.cssSelector("a[href='/clientes']")).click();
  }

  @Quando("clico no botao novo cliente")
  public void clico_no_botao_novo_cliente() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/clientes/new")));
    input.click();
  }

  @Quando("escrevo no campo nome cliente {string}")
  public void escrevo_no_campo_nome_cliente(String string){
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("cliente_nome")));
		input.sendKeys(string);
  }

  @E("escrevo no campo telefone {string}")
  public void escrevo_no_campo_telefone(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("cliente_telefone")));
		input.sendKeys(string);
  }

  @E("escrevo no campo email {string}")
  public void escrevo_no_campo_email(String string) {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("cliente_email")));
		input.sendKeys(string);
  }

  @Entao("clico no botao salvar cliente")
  public void clico_no_botao_salvar_cliente() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 30);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
    input.click();
}

}