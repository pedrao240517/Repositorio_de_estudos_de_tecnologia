# Revisão java Iniciante

Prova:

**1-  o que é uma IDE ?**

R: Ambiente integrado de desenvolvimento (onde escrevos os códigos)

**2- Porque usar Intellij dea pra java ?**
R: por ser a melhor ide pra java pelo seu atocomplate, robustes e suporte a frameworks


3**- Como funciona o ciclo de vida de um programa java ?**

R: tem 3 passos 

1-  editando o codigo : criação de código pela idea (codigo fonte)
2- modificando o codigo (compilador cria um bytecoode que é um codigo intermediario entre a escrita e binario)
3-  executando o codigo: a jvm transforma o bytecode em codigo de maquina 0 e 1 

**4- O Que é a JVM?**

R: A máquina virtual Java é o que chamamos de um interpretador de código
ela atua entre o código intermédiario entre o código fonte e código de máquina (bytecode)
e transforma esse arquivo em código de maquina 0 e 1 


**5- O que é uma variável ?**

R: é um espaço armazenado na mémoria do computador que pode ter diversos tipos
(reais, inteiros, lógicos e caractere).

**6 - Quais são os tipos de dados em JAVA?**

R:

1. int pra inteiro
2. boolean pra lógico
3. string pra caractere
4. char pra um unico caractere
5. long pra números maior que um inteiro
6. short pra números menor que um inteiro
7. byte pra números inteiros pequenos 
8. double pra números reais com precisão dupla  - 15 a 18 digitos depois da vírgula
9. float pra reais com precisão simples - 6 a 7 digitos depois da virgula

**7- Principal diferença de dados primitivos e não primitivos?**

Primitivos são mais simple e tem um valor real guardado na referenca de memoria, os não primitivos não.

A principal diferença e que os não primitivos tem métodos próprio que podem alterar seu comportamento
enquantos o primitivos não.

**8- vantagens do java ser fortemente tipada?**

O fato de ter regras rigorosas sobre os tipos de dados significa que ela é mais segura, pois torna ela mais verbosa e não apenas por esse aspecto.


**9- o que é um package em java ?**

R: Uma pasta pra armazenar códigos ou seja nossas classes.


**10-  O que é uma Class em java?**

R: Um molde de modelo pra criação de código

**11- oq é um bolierplate?**

R: um modelo (template) pra inicialização de um programa.
obs: tem vários

**12- o que é o psmv?**

Public Static Void Main - inicializador do programa em java que mantém essa como sua classe de execução

**13-Qual o comando de sáida em java ?**

Sout - Systeem.out.Println

**14-  Qual o comando de entrada em java ?**

Scanner

**15- Como funciona o scanner em java ?**

Ele funciiona com uma caixa que armazena os valores do tipo de Scanner que você colocou

Inicializar:

Scanner scaneio = new Scanner(System.in);
scaneio.nexInt- receber dado inteiro

scaneio.close - fechar o Scanner

**16- O que é fundição de tipos ?**

Você tranformar uma variável de um tipo de dado pra outro

Ex: de int pra long

Ex:int numero = 18; // criando varivael de tipo maior

        double valor = numero; // convertendo o tipo


**17 - Quais são os tipos de conversão de tipo? explique cada um deles.**

R: Existe conversão alargada - de um dado menor pra maior
e existe conversão extreitada de um maior pra um menor

**18-O que é escopo e quais são os presentes em java ?**

R: escopo é a região onde se roda os códigos, ele pode mudar dependendo
dos recursos e da maneira como você escreve o código.

Em java existe :

1. Escopo de class - tudo dentro da classe
2. Escopo de método - tudo dentro do método
3. Escopo de  loop - tudo dentro do loop
4. escopo de paramêtro  - variavies decalaradas dentro de parametros.

Atenção cuidado ao declarar uma variavel no escopo, referenciar ela pra não criar um já presente na classe

5- Suporte pra mira telescopico 
Toda abertura de colchetes {} dentro da classe

**19-  o que são métodos ?**

R: Algoritmo passo a passo que faz determinada tarefa, pode ter o próprio de bibliotecas da lingaugem ou
criar personalizados.

**20- quais são os operadores básicos de java**

r: + - * / e  %

**21- Quais são as estruturas condicionais em java ?**

1. IF
2.  ELSE
3.  ELSEIF
4.  SWITCH CASe
5. ternarios (if e else junto)

**22- Quais são os laços de repetição em java ?**

1. While
2. for
3. For..each
4. do while

**23-  o Que são array e como eles funcionam em java (e seus comandos)?**

São matrizes que funciiona de maneira sequencial e com index pra referenciar seu espaço da mémoria.

Precisam ter a quantidade de espaço declarado (estático) e o indíce começa em 0 o primeiro slot

quando estão sem nada devolvem num e devolve algo espcifico dependendo do tipo.

**24-  diferença de array unidensionais pra multimensionais ?**

R: Array multidimensionais um indice duplo além de teoricamente mais espaços

pra criar um basta inicializar da seguinte forma.

String[][] ninjasEaldeias = new String[3][3]; é uma matriz

**25-  De maneira direta como funciona o garage colector ?**

R: é um processo automatico de gerenciamento de mémoria onde objetos/variaveis/ procesos  são removidos 
da mémoria quando não usados.