<h1 align="center">Conversor de Moedas em Java</h1>
<h2 align="center">Challenge da Formação ONE Oracle/Alura</h2>

<p align="center">
  <img src="" alt="Badge do Challenge">
</p>

## Índice

- [Descrição](#descrição)
- [Pré-requisitos](#pré-requisitos)
- [Configuração da API](#configuração-da-api)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Licença](#licença)
- [Conclusão](#conclusão)

## Descrição

Este documento descreve o processo de criação de um conversor de moedas simples em Java. O objetivo principal do projeto é interagir com o usuário via console, oferecendo um menu com no mínimo seis opções de conversão de moedas. O programa recebe a escolha do usuário e o valor a ser convertido, e então exibe o resultado final. A API ExchangeRate-API foi utilizada para obter as taxas de câmbio atualizadas.
Para mais informações sobre a API ExchangeRate-API, visite [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/).
Este projeto foi desenvolvido como parte do programa de formação da Oracle em parceria com a Alura, proporcionando aprendizado prático em programação Java e Orientação a Objetos.


## Pré-requisitos

Antes de iniciar, certifique-se de que você tem os seguintes requisitos:

- Java Development Kit (JDK): Versão 11 ou superior instalada.
- Ambiente de Desenvolvimento Integrado (IDE): Como IntelliJ IDEA, Eclipse ou VS Code.
- Conexão com a Internet: Necessária para buscar as taxas de câmbio da API.



## Configuração da API

Para usar a ExchangeRate-API, é necessário obter uma chave de API gratuita:
1. Acesse o site da ExchangeRate-API (https://www.exchangerate-api.com/).
2. Crie uma conta para obter a sua chave de API.
3. A chave de API é um código alfanumérico que deve ser incluído na URL da requisição.



## Estrutura do Projeto

O projeto foi organizado em pacotes para melhor modularização e clareza do código. Cada pacote tem uma responsabilidade específica:
- **Principal**: Contém a classe principal do programa (Principal.java), que inicia a aplicação.
- **Menu**: Contém a classe Menu.java, responsável por exibir o menu de opções para o usuário, capturar as entradas e gerenciar a lógica de escolha. A classe Menu utiliza a classe ConversorApi para buscar as taxas de conversão.
- **Conexao**: Contém a classe ConversorApi.java, que é responsável por fazer a requisição à API de conversão de moedas, especificamente a ExchangeRate-API. Esta classe constrói a URL com a chave da API, as moedas de origem e destino, e o valor a ser convertido, e então envia a requisição HTTP.
- **Modelos**: Contém a classe Conversor.java, que é um record em Java. Este record armazena os dados retornados pela API, como o código da moeda base (base_code), o código da moeda alvo (target_code), o resultado da conversão (conversion_result) e a taxa de conversão (conversion_rate).



## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).



## Conclusão

Este projeto demonstra como criar um programa interativo em Java para realizar conversões de moedas, utilizando uma API externa para obter dados atualizados. O uso da ExchangeRate-API torna o processo simples e eficiente, garantindo que as taxas de câmbio sejam precisas. A estrutura modular do código facilita a adição de novas funcionalidades, como um menu de opções mais dinâmico ou a exibição de mais moedas.
