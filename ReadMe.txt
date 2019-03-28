Realiza��o de uma compra no Site AutomationPractice.com

Funcionalidades automatizadas

1. Escolher um produto na loja
2. Adicionar o produto escolhido no carrinho
3. Prosseguir para o checkout
4. Validar se o produto foi corretamente adicionado ao carrinho
5. Realizar o cadastro do cliente preenchendo todos os campos obrigat�rios dos formul�rios
6. Validar se o endere�o est� correto
7. Aceitar os termos de servi�o
8. Validar o valor total da compra
9. Selecionar um m�todo de pagamento
10. Confirmar a compra e validar se foi finalizada com sucesso.

Estrututa do projeto

1. Linguagem utilizada: Java
2. Framework utilizado: Selenium
3. Padr�o utilizado: PageObject 
4. Navegador para execu��o dos testes: Google chrome
5. Screenshot evidenciando as valida��es.

Instru��es de configura��o e execu��o do script

1. Instalar o Java JDK.   

	http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html

2. Baixar o driver do Google chrome e extrair em uma pasta qualquer.

	https://sites.google.com/a/chromium.org/chromedriver/downloads

3. Instalar o Maven, baixando o "Binary zip archive - apache-maven-3.6.0-bin.zip" e extrair em uma pasta qualquer.
	
	https://maven.apache.org/download.cgi

  3.1 Na pasta onde os arquivos foram extra�dos existe a pasta bin e dentro dela o arquivo mvn.exe. � necess�rio adicionar o diret�rio onde est� o bin�rio do maven � vari�vel de ambiente Path.

	https://www.java.com/pt_BR/download/help/path.xml
	
4. Acessar o prompt de comando e navegar at� o diret�rio do projeto e executar os comandos:
	
	cd/ + o caminho do diret�rio do projeto
	ls para estar dentro do arquivo pom.xml
	mvn clean test


