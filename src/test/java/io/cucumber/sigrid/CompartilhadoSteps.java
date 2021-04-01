package io.cucumber.sigrid;

import io.cucumber.java.pt.*;
import io.cucumber.sigrid.servicos.Configuracao;

public class CompartilhadoSteps {

  @Dado("que estou na pagina de formulario") 
  public void entrandoNoSite() {
    Configuracao.abrir("https://vendas-aula.herokuapp.com/"); 
    Configuracao.browser.manage().window().maximize();      
  }
  
}
