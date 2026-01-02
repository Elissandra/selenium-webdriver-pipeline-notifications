# Introdução

Projeto para implementar testes de automação web (CI/CD) com selenium webdriver + java + cucumber (BDD/Gherkin) no site da aplicação https://qazando.com.br/curso.html , executar testes via pipeline, realizar agendamento de execução de testes e enviar notificação dos resultados de testes pelo Slack.


* Local onde serão gerados os relatórios ao executar os testes:

  -> target/reports/index.html (Relatório simples)

  -> target/formated-report/index.html (Relatório gráfico)


# Objetivo

Automatizar os cenários de testes funcionais de cadastro e acesso de usuário na aplicação para prática de testes CI/CD através de execução de testes via pipeline, gerando relatórios, agendamentos de testes e enviando notificações dos resultados dos testes pelo Slack.


# Escopo

O escopo do projeto de automação abrange testes funcionais dos cenários:

* Teste de Cadastro de Usuário
* Teste de Login de Usuário


# Ferramentas Utilizadas

* [Selenium](https://www.selenium.dev/downloads/)
* [Java Jdk 8](https://www.oracle.com/java/technologies/downloads/?er=221886#java8-windows)
* [Maven](https://maven.apache.org/download.cgi)
* [Navegador (Firefox)](https://www.firefox.com/en-US/browsers/desktop/windows)
* [Gecko Driver na raiz do projeto (Na mesma versão do navegador)](https://github.com/mozilla/geckodriver/releases/)
* [IntelliJ IDEA (Versão comunity)](https://www.jetbrains.com/idea/download/?section=windows)
* [GitBash](https://git-scm.com/download/win)
* [Slack](https://slack.com/intl/pt-br/downloads/windows)


# Command to run

mvn test -Dtest=RunCucumber -Dbrowser=firefox-ci


# CI/CD files to run

* tests.yml
* schedule.yml

# Test Plan

<img width="1485" height="776" alt="Captura de tela 2026-01-01 193127" src="https://github.com/user-attachments/assets/9bea6a46-5fe9-4521-9121-fd1cbc34c1ad" />

# Notificações Slack

* Smoke Tests - PR
  
  Sucesso
  
  <img width="634" height="362" alt="Captura de tela 2026-01-01 191007" src="https://github.com/user-attachments/assets/27b656d2-38a1-4a54-a87b-609dcf26163e" />

  
  Falha
  
  <img width="633" height="296" alt="Captura de tela 2026-01-01 191037" src="https://github.com/user-attachments/assets/39accc0a-24ce-4bdf-b205-69cabb73a2d1" />


 * Schedule Tests
  
   Sucesso
  
   <img width="641" height="291" alt="Captura de tela 2026-01-01 200006" src="https://github.com/user-attachments/assets/fc8fd2cf-4a40-4d2b-9d36-321d20a76968" />

  
   Falha
  
   <img width="652" height="282" alt="Captura de tela 2026-01-01 200031" src="https://github.com/user-attachments/assets/7f8688b4-262f-4953-9cba-efc8335b57c9" />
  


