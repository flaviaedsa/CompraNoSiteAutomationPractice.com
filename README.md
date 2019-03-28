Realização de uma compra no Site AutomationPractice.com

Funcionalidades automatizadas

1. Escolher um produto na loja
2. Adicionar o produto escolhido no carrinho
3. Prosseguir para o checkout
4. Validar se o produto foi corretamente adicionado ao carrinho
5. Realizar o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários
6. Validar se o endereço está correto
7. Aceitar os termos de serviço
8. Validar o valor total da compra
9. Selecionar um método de pagamento
10. Confirmar a compra e validar se foi finalizada com sucesso.

Estrututa do projeto

1. Linguagem utilizada: Java
2. Framework utilizado: Selenium
3. Padrão utilizado: PageObject 
4. Navegador para execução dos testes: Google chrome
5. Screenshot evidenciando as validações.

Instruções de configuração e execução do script

1. Instalar o Java JDK.   

	http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html

   1.1 Necessário criar uma variável de ambiente chamada "JAVA_HOME" e no diretório informar o caminho onde está o JDK do Java (Exemplo: "C:\Program Files\Java\jdk1.8.0_181").

2. Baixar o driver do Google chrome, criar a pasta "C:\Selenium\Drivers\" e extrair o driver nessa pasta.

	https://sites.google.com/a/chromium.org/chromedriver/downloads

3. Instalar o Maven, baixando o "Binary zip archive - apache-maven-3.6.0-bin.zip" e extrair em uma pasta qualquer.
	
	https://maven.apache.org/download.cgi

  3.1 Na pasta onde os arquivos foram extraídos existe a pasta bin e dentro dela o arquivo mvn.exe. É necessário adicionar o diretório onde está o binário do maven à variável de ambiente Path.

	https://www.java.com/pt_BR/download/help/path.xml
	
4. Acessar o prompt de comando e navegar até o diretório do projeto e executar o comando:
	
	mvn clean test -Dtest=RealizarCompraComSucesso


