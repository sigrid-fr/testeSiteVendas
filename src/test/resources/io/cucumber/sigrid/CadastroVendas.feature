# language: pt
Funcionalidade: Preencher formulario 
  O objetivo deste teste é fazer o preenchimento de um formulario usando TDD e BDD 
  
  Cenario: Cadastrar cliente
    Dado que estou na pagina de formulario
    Quando clico na aba clientes
    Quando clico no botao novo cliente
      E escrevo no campo nome cliente "Sigrid"
      E escrevo no campo telefone "98954321223"
      E escrevo no campo email "si@gmail.com"
      Entao clico no botao salvar cliente

  Cenario: Cadastrar produto
    Dado que clico na aba produtos
    Quando clico no botao novo produto
      E escrevo no campo nome produto "Fones de Ouvido"
      E escrevo no campo descricao "cor preto"
      E escrevo no campo quantidade "10"
      E escrevo no campo vencimento "09252021000245PM"
      E escrevo no campo precoCompra "35.00"
      E escrevo no campo precoVenda "45.00"
      Entao clico no botao salvar produto

  Cenario: Cadastrar pedido
    Dado que clico na aba pedidos
    Quando clico no botao novo pedido
      E clico no seletor de clientes
      E clico no novo cliente
      Entao clico no botao salvar pedido
    Quando clico no botao voltar
      E seleciono o cliente para vincular produto
      E clico no botao novo pedido a ser vinculado
      E clico no seletor de produtos
      E clico no novo produto
      E escrevo no campo valor "35"
      Entao clico no botao salvar pedido vinculado

    
    
    
