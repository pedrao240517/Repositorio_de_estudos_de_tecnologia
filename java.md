# Estudos Sobre java
## Objetivos 
-Dominar tudo em java a fim de se tornar um desenvolvedor java moderno
### Fontes 
- Java 10x  -Fiasco
- Roadmaph.sh (https://roadmap.sh/java)

---
- O que é uma IDE?

  IDE significa Integrated Development Environment (Ambiente de Desenvolvimento Integrado). É um software que reúne, em uma única interface gráfica, as ferramentas essenciais para criar, testar, depurar (debugar) e compilar código, aumentando a produtividade dos programadores.

- Porque usar o IntelliJ IDEA?

  IntelliJ IDEA é amplamente considerado a melhor IDE para Java e Kotlin devido à sua análise de código inteligente em tempo real, refatoração robusta, excelente suporte a frameworks (Spring, Jakarta EE) e navegação rápida, aumentando a produtividade e a qualidade do código

  principal motivo: muito autonomia no autocomplete, ou seja ele facilita na hora da escrita de código.

- Configurações
  Ao Longo do aprendizado vou registrar os atalhos de uso da ferramenta que achei aqui.


#### Ciclo de vida de um programa JAVA

![ciclo de vida de um programa JAVA](image-21.png)

Existem três estágios principais no ciclo de vida de um programa Java.  São eles:
1) Editando o programa
2) Compilando o código-fonte
3) Executando o código de bytes

1- Primeiro, você começará digitando o programa em um O processo começa com os desenvolvedores escrevendo o código-fonte Java em .javaarquivos usando uma IDE ou um editor de texto.

2-  Esse código é então compilado pelo compilador Java (javac) em bytecode armazenado em .classarquivos, com verificação de sintaxe e tipo realizada durante a compilação.

3- A última etapa é a execução.  O bytecode gerado pelo compilador será executado pela  Máquina Virtual Java (JVM) . A entrada para a JVM é bytecode e a saída é código de máquina (0s e 1s) que será executado pela CPU da máquina local.

Sobre a JVM?

Quando o programa é executado, a Máquina Virtual Java (JVM) carrega esses arquivos de classe compilados na memória por meio de um processo que envolve o carregamento de dados binários, a vinculação para verificação e preparação e a inicialização dos elementos da classe. A JVM então verifica a conformidade de segurança do bytecode, realiza a compilação Just-In-Time (JIT) para traduzir o bytecode em código de máquina nativo para melhor desempenho e executa as instruções do programa enquanto gerencia os recursos do sistema. Ao longo da execução, a JVM lida com a coleta de lixo, recuperando a memória de objetos não utilizados e, finalmente, libera todos os recursos ao término do programa.

 Essa arquitetura permite a capacidade do Java de "escrever uma vez, executar em qualquer lugar", já que o bytecode pode ser executado em qualquer dispositivo com uma JVM compatíve

observações:

obs: compiilador é um programa de computador que traduz o código-fonte (escrito em uma linguagem de programação de alto nível, como C, C++ ou Rust) para uma linguagem de baixo nível( aquelas com pouca ou nenhuma abstração em relação ao hardware), como código de máquina ou assembly, que pode ser executado diretamente pelo processador.

O bytecode é uma representação intermediária de código, posicionada entre o código-fonte de alto nível (como Java ou Python) e o código de máquina que uma CPU física entende.Ele foi projetado para ser executado por uma Máquina Virtual (JVM)


Detalhamento do processo da JVM no Futuro.


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

3) Double(Números reais) -  números de ponto flutuante de precisão dupla.
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

Scanner - toda vez que você abre essa caixa tem que fechar (palavra reservada)

um unico scanner pode trabalhar com diferentes tipos de dados 

Scanner nomeDoScanner = new Scanner(System.in);

Scanner → tipo da variável

nomeDoScanner → nome que você escolheu

new Scanner(System.in) → cria um scanner para receber dados do teclado

Explicando:

new Scanner(System.in)

new → cria um novo objeto

Scanner → classe usada para ler entradas do usuário

System.in → entrada padrão do sistema (teclado)

###### métodos

nextLine(); // recebe texto

nextInt();  // recebe inteiro

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

###### arrays multimdimencionais 
conhecido como array de array ou array 2D ou matriz.

String[][] ninjasEaldeias = new String[3][3];
é uma matriz 

###### Garbage collector 

Garbage Collection (GC) é o processo automático de gerenciamento de memória, onde objetos que não estão mais em uso são removidos da memória. Isso ajuda a evitar vazamentos de memória.

O Garbage Collector monitora objetos que não têm mais referências ativas e os limpa da memória.
Durante a sobre escrita, o Garbage collector retira momentaneamente o array declarado e cria um novo com o mesmo parâmetro

O Garbage Collection é especialmente importante em linguagens como Java e C#, onde a memória é gerenciada automaticamente.

- Resumo do básico de java 

https://www.mindmeister.com/app/map/3958307975

o que falta colocar  : Arrays, loops, basico de poo, fundição de tipos , variaveis e escopos , tipos de dados , basica sintaxe (bufferBufferedReader.)


## Nível intermediário

Obs: tudo no java é um objeto - maneiras que pode trabalhar e manipular .

Todo objeto é feito atráves de um molde (class).

No caso do java, você cria uma nova class(molde) no mesmo package e depois inicializamos esse molde em um objeto  em outro class.

````
molde 

package NivelIntermediario;

public class Ninja {
        String nome;
        String aldeia;
        int idade;

    
}


objeto trabalhado

package NivelIntermediario;

public class Main {
    static void main(String[] args) {


        // Criar ninja Naruto - Naruto é um objeto
        String nome ="Naruto Uzumaki";
        int idade = 18;
        String aldeia = "Aldeia da folha";
        System.out.println("Nome do ninja é "+ nome);

        // Criar ninja Sasuke - Sasuke é um objeto

        Ninja sasuke = new Ninja();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia="Aldeia da folha";
        sasuke.idade =18; 
    }
}

````

vale resaltar que todas as variáveis declaradas dentro de um class a fim de dar caracteristicas a um objeto ém chamado de atributo.
### Orientação a objeto 

A Programação Orientada a Objetos (POO) é um paradigma(Um paradigma de desenvolvimento define o conjunto de crenças, conceitos e metodologias que guiam a forma como os profissionais abordam a criação de algo) de desenvolvimento que organiza o código em "objetos" — que combinam dados e comportamentos. Ela é amplamente utilizada porque facilita a criação de sistemas complexos, promove a reutilização de código e torna a manutenção muito mais eficiente

Primeiramente, quais os pilares da orientação a objeto: Emcapsulamento,Herança e Polimorfismo.


1) herança

Usar caracteristicas de um class mãe em outras classes filhas para assim poupar codigo e agilizar trabalho.

![alt text](image-19.png)

pra isso é importante usar a palavra chave da herança na nossa classe - extends.

obs: ao usar a herança a ordem sequencial mostrada das variveis será com base a class mê/pai

obs: sobrescrição de métodos consiste em repitir o método da class mãe no filho adicionando o metódo da class filho


````
package NivelIntermediario;

public class Main {
    static void main(String[] args) {


        // Criar ninja Naruto - Naruto é um o Objeto 1
        Uzumaki naruto = new Uzumaki();

        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia="Aldeia da folha";
        naruto.idade =18;
        naruto.AumentoDechakra();


        

        // Criar ninja Sasuke - Sasuke é um objeto 2

        Uchiha sasuke = new Uchiha();

        sasuke.nome ="Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia ="Vila da Folha";
        sasuke.ShariganAtivado();c
    }

````


2) Polimorfismo

Criar uma função unica (trecho de código[algoritmos]) que pode ser utilizada em diferentes classes com diferentes caracteristicas.

Polimorfismo permite que objetos de diferentes classes sejam tratados como objetos de uma classe base comum, o que facilita a criação de código flexível e reutilizável.

no caso você vai sobrescrever  o método que quer reutilizar em uma classe que você vai usar, pra isso use a o método @Override


```
package NivelIntermediario.Polimorfismo;

public class Uchiha extends  Ninja {


    // sobrescrever a classe ninja pelo uchiha - polimorfismo
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome+ " e esse meu uchiha, um ataque de fogo");

    }
}
```



3) Emcapsulamento 
Capacidade de proteger variaveis e classes para que não haja vazamento e mantendo assim portegida e encpsulada nossos objetos. (evitar vazmento de dados)


### Métodos e parâmetros 

Existem dois Tipos de métodos:

1) Void -  Não precisa retornar nada pra gente (procedimento)

````

public class Pessoa {

    // Método PÚBLICO e VOID (não retorna nada, apenas executa a ação)
    public void cumprimentar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    public static void main(String[] args) {
        // Criando o objeto da classe Pessoa
        Pessoa alguem = new Pessoa();

        // Chamando o método público void
        alguem.cumprimentar("Carlos");
    }
}
````


2) Return -  Precisa retornar um valor pra gente (função)(return) e tem que ter um tipo de dado específico(qualquer tipo)

outra coisa que podemos usar parâmetros( as declarações dentro dos parenteses dos métodos) ou seja o método vai acontecer se você me passar o valor do parãmetro

````

// Exemplo de métodos e parâmetros
public class Calculadora {

    // Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Chamando os métodos e passando parâmetros
        int soma = calc.somar(5, 3);
        int subtracao = calc.subtrair(10, 4);
        int multiplicacao = calc.multiplicar(7, 6);
        double divisao = calc.dividir(20, 4);
        
        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
    
````


Etapas pra criação de método personalizado.

1- Colar o método como público para que as outras class possam receber 

2- colocar o tipo de método utilizado

3- colocar nome do método e parenteses(pra indicar que é um método)

4- aplicar no objeto trabalhado o método

### Interfaces

Ela seria como uma janela/portal - Interfaces permitem que você especifique métodos que uma classe deve implementar, sem definir como esses métodos são executados.

*implementes - obrigatoriamente tem que tirar algo de dentro da interface (todos)

obs: sempre de preferência de trabalhar com interfaces no lugar de classes.

obs: Todos os atributos de uma interface são públicos por padrão.

relembrando: Atributos são variáveis ​​que armazenam dados sobre um objeto

interface :

```
package NivelIntermediario;

public interface HyugaUzumaki {

    void AtivarOKarma();
    
    void AtivarJougan();

}
```

classe boruto 
}
```
package NivelIntermediario;

public class Boruto extends Uzumaki  implements  HyugaUzumaki{
    

   public void AtivarOKarma(){
        System.out.println("O Karma foi ativado! Eu sou um Hyuga Uzumaki ");
    }

    
    public void AtivarJougan(){
        System.out.println("O Jougan foi ativado! Eu sou um Hyuga Uzumaki");
    }
    
}

```
implementando na Main


```
// Criar Boruto - Boruto é um Objeto 5

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto  Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.AumentoDechakra();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();


```

pense na interface como um um contrato, onde eu posso aceitar ou não esse contrato e caso aceite eu tenho que seguir as regras (usar as variveis e os metodos [dando corpo aos métodos])

### Construtores - Organizando e padronizando objetos

 moldes dentros dos moldes (class) - criação de padrão que todos que forem trabalhar com aquele objeto vai usar.

 obs: toda vez que você cria uma nova classe o java entende que você quer criar um objeto a partir dessa classe.


 - Tipos de construtores

 1) NoArgs Constructor

 Um construtor que vem vazio , não necessariamente recebe argumento nenhum.

 2) AllArgs Constructor

 um constructor que é preenchido como todos os atributos de classe - com argumentos.

 ---

 obs:  Um argumento em Java é o valor real (dados) que você passa para um método quando o invoca.

 Pra ficar menos abstrato, vamos pro exemplo:

 ```
  public class Hokages {

    String nome;

    // construtor com argumento
    public Hokages(String nome){
        this.nome = nome;
    }

    public static void main(String[] args) {

        Hokages hokage1 = new Hokages("Naruto");

        System.out.println(hokage1.nome);
    }
}

  ```

  você está pendindo que todo objeto que  for criado a partir dessa classe, pode ter um construtor, com o usario inserindo o nome do objeto.

  This - referência esse atributo( variáveis ​​que armazenam dados sobre um objeto) declarado na class e o atributo recebe como valor o parametro(declarações dentro dos parenteses dos métodos) do constrututor.


obs: geralmente você coloca todos os argumentos do construtor
shortcut - alt+ insert = criar construtor(1, nenhum ou todos)

obs: o nome do construtor deve ser igual ao nome da class

dica: toda vez que inicializou um construtor ele se toran imutavel, no caso você faz a sobrecarga de métodos


### Classes abstratas 

Serve para padronizar o código. Elas funcionam como moldes ou "contratos" genéricos para outras classes, permitindo compartilhar comportamentos comuns e exigindo que classes filhas implementem métodos específicos(superclasse)

esclabilidade de manuntenção e o principal fator pra usar classes abstratas

Por exemplo : se eu crio uma classe principal(superclasse) Main e uma ninja e deixo a ninja abstrata, eu sou obrigado a criar um subclasse pra criar objetos(instanciar) e pra trabalhar na classe main.

- Caracteristicas de classes abstratas

1)  Elas não pode ser instanciadas  - não pode criar um objeto a partir dela 

2) metodos abstratos não pode ter escopo

- Qual a difernça de uma classe abstrata e uma interface?

Primeiramente vamos as semelhanças, as duas é inpossível criar (instanciar)um objeto. (em termos leigos ela não poderia "procriar")

A principal é que você não pode colocar os atributos (variveis que atuam como caracteristicas dos objetos), sem declarar o valor na interface pois ela é automaticamente final enquanto na classe abstrata você pode.
![classe abstrata](image-22.png)

![interface](image-23.png)

 
### Super classes x Sub Classes 

A classe mãe chamamos de Super classe pois ela gera outras classes que chamamos de subclasse.

Porém se eu quiser usar um construtor eu vou ter que instanciar (criar) nas subclasses😑😑😑😑

Pra resolver isso eu tenho que sobrescrever o construtor na subclasse e usar a palavra reservada no seu body

o super, e no caso pra superclasse usamos this pra referenciar os atributos da superclasse e o super pra refenciar os atributos da subclasse.   

### Herança Multipla

Para obter os benefícios da herança múltipla, uma classe pode implementar múltiplas interfaces separadas por vírgula utilizando a palavra-chave implementes

```
javapublic interface Voador {
    void voar();
}

public interface Nadador {
    void nadar();
}

// Classe que implementa múltiplas interfaces (herança múltipla de tipos)
public class Pato implements Voador, Nadador {
    @Override
    public void voar() {
        System.out.println("O pato está voando.");
    }

    @Override
    public void nadar() {
        System.out.println("O pato está nadando.");
    }
}
```

- relembrando 

![alt text](image-24.png)

### Overload - Sobrecarga de métodos 

Usamos quando queremos refatorar o código (construir de novo o código ou consertar)

dica: toda vez que tiver uma nova função de trabalho (task) comente o código (use TODO)

pra fazer isso você usa um construtor e referência o anterior com this.() e acrescenta os outros em superclasses e nas subclasess o próprio inteliIDEA faz por você
![alt text](image-25.png)

![alt text](image-26.png)

### enuns

Serve pra colocar atributos que não se alteram como dias da semana, status de pedidos, cargos e etc.

obs: colocar em letras maiscúlas com enum

### Overload/Sobrecarga de metodos

Pra que repetir um método ma interface? a resposta é bem simples pra eu poder usar um método sem parametros e outro com paramêtros, além de eu guardar um único espaço na memória pra esse método

exemplo: 
```
   package NivelIntermediario.Polimorfismo;

public interface EstrategiaDeBatalha {

    void estrategiaNinja();

    void  inteligenciaDeCombate();

    void  inteligenciaDeCombate(int qi);



}
em outra classe:



// sobrecarga de método inteligenciaDeCombate(); padrao
         public void  inteligenciaDeCombate(){
                 System.out.println(" Essa é minha inteligência de combate ");
         }
        // sobrecarga de método inteligenciaDeCombate();
        public void  inteligenciaDeCombate(int qi){
                System.out.println(" Essa é minha inteligência de combate ");

                if (qi > 150 ){
                        System.out.println("Seu QI de batalha é "+ qi + " e você é genio");
                }else if (qi >= 130){
                        System.out.println("Seu QI de batalha é "+ qi + " e você é ninja promissor");
                }else {
                        System.out.println("Seu QI de batalha é "+ qi +" e você é precisa treinar mais suas estrátegias ");
                }
        }

```

depois pra usar ele e só instanciar o método no objeto e colocar o valor do parãmetro
 

 ### Dúvida Frequente -  @Override(sobrescrito) como funciona de verdade?     

 O Override é uma convenção (padronização[boa prática]), que serve pra evitar a criação de novos métodos por erros de digitação, pois ela "autoriza" a escrita daquele método pois, está correto.

 no geral ele deixa mais legibilidade e claro seu código.


### Referência de memoria x Valor em memoria