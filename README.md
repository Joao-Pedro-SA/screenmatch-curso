# screenmatch-curso - Consulta de dados via API OMDB 🎬

Projeto desenvolvido durante o curso de Java da [Alura] (https://www.alura.com.br/) com foco em: 
- Prática de POO (Programação Orientada a Objetos)
- Consumo de APIs REST
- Tratamento de exceções
- Manipulação de dados JSON

# Funcionalidades
Consulta de informações sobre filmes via API da OMDB;
Exibição de título, ano de lançamento, gênero entre outras informações;
Tratamento de respostas da API e manipulação de dados;

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **POO**: Herança, Polimorfismo, Encapsulamento, Abstração
- **API OMDB**: (https://www.omdbapi.com/apikey.aspx)
- **Gson**: (https://mvnrepository.com/artifact/com.google.code.gson/gson/2.12.1)

# Estrutura do projeto 
ScreenMatchAula/
|-- src/
| |br.com
|   |-- br.com.alura.screenmatch/
|         |-- calculos/
|         |-- excecoes/
|         |-- modelo/
|         |-- servico/
|   |-- principal/

# Pacotes do projeto
- calculos: Contém classes destinados ao calculo de dados dos Filmes.
- excecoes: Contém classes destinadas ao tratamento de exceptions.
- modelo: Contém as classes que representam os modelos de dados.
- servico: Contém as classes responsaveis pela interação com a APi e com o usuario.
- principal: Contém as classes executaveis do projeto.


# Como executar o projeto
- Clone o repositório: git clone https://github.com/Joao-Pedro-Sa/screenmatch-curso.git
- Abra o projeto em uma IDE como IntelliJ ou VS Code.
- Certifique-se de ter o Java instalado (versão 17 ou superior).
- Adicione o Gson nas dependecies do projeto
- Coloque sua API key no projeto
- Execute a classe principal.

# Versões Futuras
Uma versão mais completa do projeto está em desenvolvimento, utilizando Spring Boot, banco de dados e front-end.
