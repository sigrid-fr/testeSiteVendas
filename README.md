# Projeto Final Academia Accenture <br>

# Integrante: <br>

- [![Linkedin Badge](https://img.shields.io/badge/-Sigrid-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/sigrid-rodrigues/)](https://www.linkedin.com/in/sigrid-rodrigues/)[Sigrid Rodrigues](https://github.com/sigrid-fr)


# Descrição do desafio 🚀
### Criar uma aplicação Selenium com os seguintes casos de teste<br>

Acessar o site vendas e preencher formulario <br>

<b>Cenário</b>: Cadastrar Cliente <br>
Dado que estou na pagina de formulario <br>
Quando clico na aba clientes <br>
Quando clico no botao novo cliente <br>
E escrevo no campo nome cliente "Sigrid" <br>
E escrevo no campo telefone "98954321223" <br>
E escrevo no campo email "si@gmail.com" <br>
Entao clico no botao salvar cliente <br>

<b>Cenário</b>: Cadastrar Produto <br>
Dado que clico na aba produtos <br>
Quando clico no botao novo produto <br>
E escrevo no campo nome produto "Fones de Ouvido" <br>
E escrevo no campo descricao "cor preto" <br>
E escrevo no campo quantidade "10" <br>
E escrevo no campo vencimento "09252021000245PM" <br>
E escrevo no campo precoCompra "35.00" <br>
E escrevo no campo precoVenda "45.00" <br>
Entao clico no botao salvar produto <br>

<b>Cenário</b>: Cadastrar Pedido <br>
Dado que clico na aba pedidos <br>
Quando clico no botao novo pedido <br>
E clico no seletor de clientes <br>
E clico no novo cliente <br>
Entao clico no botao salvar pedido <br>
Quando clico no botao voltar <br>
E seleciono o cliente para vincular produto <br>
E clico no botao novo pedido a ser vinculado <br>
E clico no seletor de produtos <br>
E clico no novo produto <br>
E escrevo no campo valor "35" <br>
Entao clico no botao salvar pedido vinculado <br>

--------------------------------------------------------------------
## Dependencias
- Projeto Java do repo abaixo rodando no site Heroku Vendas <br>
https://vendas-aula.herokuapp.com <br>
Link do repositório: https://github.com/sigrid-fr/testeSiteVendas <br>

--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/sigrid-fr/testeSiteVendas
 ```

- Entrando na pasta do projeto
 ```bash
cd testeSiteVendas
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```
 
 --------------------------------------------------------------------
## Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |--sigrid<br>
    |  |  |  |  |  |-- CadastroClienteSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- CadastroPedidoSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- CadastroProdutoSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- CompartilhadoSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- sigrid<br>
    |  |  |  |  |  |-- CadastroVendas.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>
