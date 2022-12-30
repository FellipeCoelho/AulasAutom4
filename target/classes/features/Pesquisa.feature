Feature: Testando uma pesquisa simples no Google

  #por algum motivo o cucumber não reconhece com a sintaxe em português...
  Scenario Outline: Usuario digita na barra de pesquisa
    Given que estou com o browser aberto
    And entro com o endereco 
    When eu informo o conteudo da pesquisa <texto>
    Then sera retornado alguma coisa

    Examples: 
      | texto  |
      | Naruto |
