# Fundamentos da programação de computadores 

## fonte: Fundamentos da programação de computadores_ algoritmos, PASCAL, C_C++ (padrão ANSI) e JAVA 

### Cap 1 - Conceitos básicos

**lingueagem de programação:**  é um método formal com regras de sintaxe e semântica que permite aos humanos darem instruções a um computador para a criação de softwares.

#### 1.1 Conceito de Algoritmo

**Algoritmo** é uma sequência finita de instruções ou operações cuja execução, em tempo finito, resolve
um problema computacional, qualquer que seja sua instância

Ex: Algoritmo - Somar três números 

* Passo 1 — Receber os três números.
* Passo 2 — Somar os três números.
* Passo 3 — Mostrar o resultado obtido.

#### 1.2 Método para a construção de algoritmos 

1) Compreneder o problema 
2) definir os dados de entrada
3) Definir o processamento
4) Definir os dados de saída
5) contruir o algoritmo
6) testar o algoritmo

#### 1.3 Tipos de representação de algoritmos

1) descrição narrativa  -> explicação e detalhamento da resolução do problema.
![img.png](img.png)
2) fluxograma -> explicação do problema por meio de símbolos gráficos 
![img_1.png](img_1.png)
3) pseudócodigo -> detalhamento dos passos do algoritmo escrito em sua linguagem natural
![img_2.png](img_2.png)

#### 1.4/1.5 Conceito de variável

uma variável é um espaço reservado na memória do computador (física ou virtual) que serve para armazenar, consultar e modificar dados durante a execução de um programa.

#### 1.6 Tipos de Dados 

1) númericos 
2) lógicos
3) caracteres/literais

#### 1.7 Formação de identificadores

identificadors são os nomes das coisas das linguagens iu seja das constantes, variáveis, programas , rotinas, das unidades e etc
As suas regras básicas são:

1) As regras básicas para a formação dos identificadores são:
2) Os caracteres permitidos são: os números, as letras maiúsculas, as letras minúsculas e o caractere
sublinhado.
3) O primeiro caractere deve ser sempre uma letra ou o caractere sublinhado.
4) Não são permitidos espaços em branco e caracteres especiais (@, $, +, –, %, !).
5) Não podemos usar as palavras reservadas nos identificadores, ou seja, palavras que pertençam à
linguagem de programação

exemplo -> idadeMaior


### Cap 2 - Paradigmas de programação

Os paradigmas de programação são estilos, abordagens ou modelos fundamentais que orientam como o programador estrutura e resolve problemas por meio do código. Eles definem a visão e a lógica empregadas para construir um software,

Existem dois grupos principais de paradigmas, **Imperativo ou/e Declarativos.**

#### Imperativos  - como o computador realiza a tarefa 

1) Estruturado/processual  -> quebra os problemas em partes menores chamados de sub-rotinas ou funções focando em organizar o fluxo de controle.
usando um ou mais tipos de estrutura: sequencial, condicional e interativa(de repetição)
2) Orientado a objetos  -> organiza o código em "objetos" que combianm dados (atributos) e comportamentos (métodos ) baseando em pilares como herança, encapsulamento e polimorfismo.

#### Declartivo - o que deve ser feito


1) Funcional: Baseia-se em funções matemáticas puras, imutabilidade de dados (os valores não mudam) e ausência de efeitos colaterais
2) Lógica: Baseia-se em regras formais de lógica matemática e inferências. 
3) Reativo / de Consulta: Focado em fluxos de dados assíncronos e na propagação de mudanças (muito usado em interfaces e reatividade) ou em consultas diretas de dados. (Exemplos: SQL para bancos de dados, RxJS) 



### Cap 3 - Estrutura sequencial

#### 3.1 Estrutua sequencial em algoritmos 
![img_3.png](img_3.png)

##### 3.1.1 - Declaração de varáveis em algoritmos
![img_4.png](img_4.png)

##### 3.1.2 Comando de atribuição em algoritmos
usando o símbolo ->  em algoritmos e =  em linguagens 
![img_5.png](img_5.png)

##### 3.1.3 Comando de entrada
Pra receber algoritmos utiliza o equivalente ao comando leia 

##### 3.1.4 Comando de saída 
Pra receber algoritmos utiliza o equivalente ao comando Escreva 

#### 3.4 - Estrutura sequencial em JAVA 

![img_6.png](img_6.png)

* Os pacotes são métodos(funções) escritos em java
* java é sensivel as letras masiculas e minusculas 

##### 3.4.1 - Declaração de variavéis em JAVA  

Java é uma linguagem de Tipagem estática ou seja, temos que declarar o tipo de dado antes de colocar o nome da 
variável.

* float - reais (32 bits )
* double - rais (64 bits )
* char - 1 caractere 
* string - varios caracteres 
* int - inteiro
* boolean (verdadeiro ou falso)

![img_7.png](img_7.png)

##### 3.5.2 Declaração de constantes em JAVA 
constante é um valor que assim que definido não se pode mudar, em java pode ser colocado em diferentes locais e isso define seu escopo (onde pode usar sem acarretar erro de compilação)
em java se for declarada em um método como o main ficara restrito ao escopo do método (nesse método o escopo e estático por ser o principal), no caso do java se usa  a palavra chave - final e 
static geralmente pra pertencer a classe e economizar mémoria. 

##### 3.4.3 Comando de atribuição em JAVA  (=) 
![img_8.png](img_8.png)


##### 3.4.4 Comando  de entrada em JAVA 
Uma das maneiras de receber os dados dos usuários é por meio da classe Scanner que requer a importação do pacote java útil.
![img_9.png](img_9.png)

##### 3.4.5 Comando de saída em JAVA 

system.out.print e system.out.println

##### 3.4.5 comentarios em java 

````
// ou /*.......*/
````
##### 3.4.6 Operadores e funções predefinidas em Java 

![img_10.png](img_10.png)

- matematicos 

![img_11.png](img_11.png)
![img_12.png](img_12.png)

### Cap 4 - Estrutura condicional 

As estruturas condicionais podem ser simples (se -> então) ou composta (se -> então ->  senão )

#### 4.4 Estrutua condicional em JAVA 

- simples

![img_13.png](img_13.png)

- Composta 

![img_14.png](img_14.png)

- estrutura case 

![img_15.png](img_15.png)

- operadores  lógico  (&&[e], || [ou], ![e])

![img_16.png](img_16.png)


### Cap 5 - Estrutura de repetição

Estrutura de repetição são estruturas que fazem que o algoritmo se repita por um número determinado ou infinitamente.

- Com número de repetições definidos (para)

![img_17.png](img_17.png)

- com número indefinido e teste no ínicio (enquanto)

![img_18.png](img_18.png)

- com número indefinido e teste no final(repita)

![img_19.png](img_19.png)

#### 5.4 Estrutura de reptição em JAVA 

- For(para )

![img_20.png](img_20.png)

-while (enquanto)

![img_22.png](img_22.png)


- do while (repita)

![img_23.png](img_23.png)
![img_24.png](img_24.png)

### Cap 6 - Vetor 

Um vetor é uma variável composta homogênea unidimensional, ou seja um conjunto de váriveis do mesmo tipo que possuem apenas um indenficador 
e são alocados sequencialmente na memória, também podendo ser chamado de array unidimensional.

exemplo:

![img_25.png](img_25.png)

A atribuição de valores consiste no nome do vetor e sua posição, no caso de algumas linguagens o primeiro espaço na mémoria do computador consiste em um indíce 0

![img_26.png](img_26.png)

#### 6.4 Vetor em JAVA 

em java a posição do vetor inica em 0, sendo declarados depois da variavél.

![img_27.png](img_27.png)

- atribuição de valores ao vetor

![img_28.png](img_28.png)

-prenchendo um vetor 

![img_29.png](img_29.png)

-mostrando os elementos do vetor 

![img_30.png](img_30.png)

### Cap 7 - Matriz 

Uma matriz é um variável homogênea multidimensional  

- declaração de matriz 

![img_31.png](img_31.png)

- Exemplos de matriz 

![img_32.png](img_32.png)


#### Matriz em JAVA

-Atribuindo valores 

![img_37.png](img_37.png)

-preenchendo uma matriz 

![img_38.png](img_38.png)

-mostrando os elementos de uma matriz 

![img_39.png](img_39.png)

### Cap 8 - subrotinas

Uma sub-rotina é um bloco de código separado que executa uma tarefa específica e pode ser chamado (invocado) várias vezes em diferentes partes de um programa.

#### Subrotinas em JAVA(métodos)

As sub-rotinas em java se resume basicamente em seus métodos, em java cada classe tem seu atributo(informação da variavel ) e  suas funções que são seus métodos,
além disso em java esses métodos exercem influência de diversos modificadores de acesso entre os principais o static e public, o static  diz que o método podera ser executado sem nenhum objeto da classe instanciado  e publico que o método pode ser chamado por qualquer classe


- Sem Retorno e Sem Parâmetros

![img_40.png](img_40.png)

- Sem Retorno e Com Parâmetros

![img_41.png](img_41.png)

- com retorno e sem parâmetro

![img_42.png](img_42.png)

- com retorno e com parâmetro

![img_43.png](img_43.png)


### Cap 9- Manipulando cadeias de caracters  (em java)

1) Inicalização de string

String texto1 = new String();

* Métodos essenciais da classe String

![img_45.png](img_45.png)

### Cap 10 - Registro

Registros (Records) em Java são estruturas de dados introduzidas para simplificar a criação de classes que servem puramente como portadoras de dados imutáveis. Como você bem mencionou, eles têm o objetivo principal de agregar vários dados (atributos) acerca de uma mesma entidade de forma muito mais limpa e compacta.

![img_46.png](img_46.png)


O que o Java gera automaticamente para você nos bastidores:

• Atributos privados e finais: private final Long id;, etc.

• Um constutor completo para inicializar todos os dados.

• Métodos de leitura (em vez de getId(), usa-se apenas .id()).

• Implementações robustas de toString(), equals() e hashCode().


* obs questões sobre tratamentos de arquivos e poo serão tratadas na matérias de programação orientada a objeto.






















































