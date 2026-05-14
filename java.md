# Estudos Sobre java
## Objetivos 
-Dominar tudo em java a fim de se tornar um desenvolvedor java moderno
### Fontes 
- Java 10x  -Fiasco
- Roadmaph.sh (https://roadmap.sh/java)

---
### Index
- O que é uma IDE?
- Porque usar o IntelliJ IDEA
- Configurações
- Variaveis, tipagem de dados
- Mas o que é uma variavél?
- Tipos de dados (primitivos)
- Tipos de dados não primitivos 
- Principal difença entre dados primitivo e não primitivos ?
- Perguntas relevantes e outros? 
- Comando de Saída em java 

---
- O que é uma IDE?

  IDE significa Integrated Development Environment (Ambiente de Desenvolvimento Integrado). É um software que reúne, em uma única interface gráfica, as ferramentas essenciais para criar, testar, depurar (debugar) e compilar código, aumentando a produtividade dos programadores.

- Porque usar o IntelliJ IDEA?

  IntelliJ IDEA é amplamente considerado a melhor IDE para Java e Kotlin devido à sua análise de código inteligente em tempo real, refatoração robusta, excelente suporte a frameworks (Spring, Jakarta EE) e navegação rápida, aumentando a produtividade e a qualidade do código

  principal motivo: muito autonomia no autocomplete, ou seja ele facilita na hora da escrita de código.

- Configurações
  Ao Longo do aprendizado vou registrar os atalhos de uso da ferramenta que achei aqui.

- Variaveis, tipagem de dados

Primeiramente, vale resaltar que java é uma linguagem fortemente tipada, o que é isso? (ma linguagem fortemente tipada (ou altamente tipada) é aquela que impõe regras rigorosas sobre os tipos de dados (como int, string, bool), não permitindo conversões automáticas implícitas entre tipos incompatíveis e exigindo que tipos de variáveis sejam bem definidos.)

- Mas o que é uma variavél?

De maneira simples é um espaço na mémoria do computador onde vamos guardar os nossos dados e podemos alocar valores nesses espaços(letras, números e etc)

Pra poder declarar valores pra variavéis em java ou seja atribuições, devemos colocar o sinal de = e um ponto e vígula (;) depois do valor atíbuido para saber onde finaliza aquele trecho de código.

exemplo: idade = 16;
         altura = 1.64;
         vivo ou morto = true;

- Tipos de dados (primitivos)

obs: São tipos de dados que de maneira geral não recebem métodos de maneira padrão.

1) caractere
char - pra armazenar um único caractere

2) int(Números inteiro) - valor máximo 2 147 483 647 
sub dados 
long - com sinal de 64 bits usado para armazenar números inteiros grande (9.223.372.036.854.775.807)[o atribuir um valor literal a uma longvariável, você deve acrescentar um L(ou minúsculo l, embora maiúsculo seja preferível para maior clareza) para informar ao compilador que o número é um longe não um algarismo int]

byte: Números inteiros pequenos.

short: Números inteiros menores que um int.

3) Double(Números reais) -  úmeros de ponto flutuante de precisão dupla.
float: Números de ponto flutuante de precisão simples.

4) Boolean (lógico - true e false)

- Tipos de dados não primitivos 

obs: São tipos de dados em que pode-se colocar metódos para fazer alterações na variável sem que seja mudado seu escopo.

1) string(caractere) - aramzenar um nome 
2) array(lista encadeadas)[variável composta homogênea] -Estruturas para armazenar múltiplos valores em uma única variável.
3) Class - (também conhecida como campo estático) é um atributo declarado com a palavra-chave static dentro de uma classe, mas fora de qualquer método
4) enuns
5) objects -Instâncias de classes que encapsulam dados e comportamentos. 
6) interfaces

- Principal difença entre dados primitivo e não primitivos ?

poder usar métodos nas variáveis.

![alt text](image.png)

- O que são métodos ?

 São carcteristicas que colocamos dentro de variáveis. um método em Java é uma função, mas com a particularidade de estar obrigatoriamente associado a uma classe ou objeto.No caso, para ativar um método em uma varivel, basta colocar um ponto sobre a váriavel declarada e escolher um método java ou próprio

- Qual a vantagem de ter uma linguagem fortemente tipada? 

Aumenta a segurança do código, previne erros de lógica, melhora a legibilidade e facilita a manutenção, sendo muito utilizada em sistemas de grande porte.


- Perguntas relevantes e outros? 

O que é um package: uma pasta pra organizar classes e interfaces relacionadas a um único grupo.

O que é uma class: é um molde de criação de código

O que é um boilerplate?: Uma formúla de bolo toda vez que cria um projeto.

psvm - public static void main 
psvma  -public static void main string args

atalho - sout para escrever System.out.println mas rápido
 e cntrl r pra executar a aplicação

Principais Shortcuts
No Windows:

Ctrl + Shift + A: Encontrar e executar qualquer ação
Ctrl + E: Mostrar arquivos recentes
Ctrl + /: Comentar/descomentar linha
Ctrl + Shift + F10: Executar a aplicação

- Comando de Saída em java 

System.out.print - mostra para o usuário na tela
System.out.println - mostra para o usuário na tela e pula uma linha 

- Comando de Entrada em Java 

Scanner - toda vez que você abre essa caixa tem que fechar

- Operadores matematicos básicos 

Adição - + 

subtração - (-)

Divisão  - / 

Multiplicação - *

Restante/ Módulo -  %

para saber outros operadores acesse a documentação oficial ou tutoriais (https://jenkov.com/tutorials/java/math-operators-and-math-class.html)

- Condicionais 

IF - se 

ELSE - Senão

ELSE-IF = se encadeado

Swicht case - escolha caso (precisa colocar o Break no final do case) ((não pode usar tipo lógico))

?: ternário- maneira pra enxugar o código (if e else junto)

- Desafios
1) Refazer desafio 1 

- Qual a maior diferença de JAVA pra JS e porque é mais complicado que algumas linguagens?

Java é considerada mais complicada porque:

Tem muita regra;
precisa entender orientação a objetos cedo;
é mais verbosa (escreve mais código);
o compilador reclama de tudo;
exige organização desde o começo.
obs: pra determinar o fim do comando precisa colocar ; 

- Laços de repetição (sempre inclemente o que 
está trabalhando)

while (enquanto) - repete sempre um a mais 
For (para) -for(inicialização; condição; incremento) { // código }
do..while(faça enquanto)
ForEach (para cada)

- Arrays (Matrizes)

 São estruturas de dados fundamentais usadas para armazenar uma coleção de elementos do mesmo tipo de dados em locais de memória contíguos. Eles fornecem uma maneira de organizar e acessar múltiplos valores usando um único nome de variável e um índice.

 ![Arrays unidimensionais](image-14.png)

 Estrutura array unidimensionais 

 String[] ninja = new String[3];

 -String - tipo do elemento

 -ninja - nome do array

 -new - criar novo espaço de objeto de mémoria memória do computador

 -[3] - tamanho do array

 Dados não primitivos também podem ser chamados de tipo de referência pois precisamos alocar um pedaço da mémoria do computador pra esse array, ou seja, vamos ter que referenciar uma memória pra ele.

 Ordenação começa com 0 (index)

 null - Não tem nada pra devolver 

 cada array tem um resultado diferente dependendo do tipo (ex: tipo string da null e tipo int da 0 se não tiver nada no espaço)[inicialização].

 array <> lista 

 O array sempre vai ter um  tamanhos fixo a lista não.

 Inicialização Implícita: Quando o array é declarado, os valores são automaticamente atribuídos com base em seu tipo, economizando a necessidade de inicializar cada elemento individualmente.

Inicialização Explícita: É possível inicializar o array com valores específicos no momento de sua criação, como int[] numeros = {1, 2, 3, 4};. Isso evita o uso dos valores padrões.

###### Garbage collector 

Garbage Collection (GC) é o processo automático de gerenciamento de memória, onde objetos que não estão mais em uso são removidos da memória. Isso ajuda a evitar vazamentos de memória.

O Garbage Collector monitora objetos que não têm mais referências ativas e os limpa da memória.
Durante a sobre escrita, o Garbage collector retira momentaneamente o array declarado e cria um novo com o mesmo parâmetro

O Garbage Collection é especialmente importante em linguagens como Java e C#, onde a memória é gerenciada automaticamente.


