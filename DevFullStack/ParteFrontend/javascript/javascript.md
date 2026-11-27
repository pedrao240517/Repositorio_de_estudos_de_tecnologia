# JavaScript

### Sobre o Javascript

Javascript foi criado pra dar vida as páginas web, se iniciu com o nome livescript mas por conta da popularidade do java na época 
ele decidiu qe seria mais vantajoso se tornar "o imão mais novo" do java 

Essa linguagem tem tipagem fraca e dinâmica  e com o vinculação dinâmica em tempo de execução e ela segue o padrão da especificação ECMAScript que 
define o padrão da linguagem.

### Breve história do javascript

O JavaScript foi criado em 1995 por Brendan Eich na Netscape Communications para adicionar interatividade às páginas web. A linguagem nasceu em cerca de dez dias, passou pelos nomes Mocha e LiveScript, e recebeu o nome JavaScript por estratégia de marketing ligada à popularidade do Java.

Marcos principais

• Padronização (1996–1997): Após a Microsoft lançar o JScript no Internet Explorer, a Netscape levou a linguagem à ECMA International, originando o padrão ECMAScript (ECMA-262) em 1997.

• Web dinâmica e Ajax (meados dos anos 2000): O uso de requisições assíncronas (Ajax) permitiu atualizar partes da página sem recarregá-la, impulsionando aplicações web mais ricas e bibliotecas como jQuery.

• Fora do navegador e Node.js (2009): O lançamento do Node.js levou o JavaScript ao servidor (back-end), consolidando o uso da linguagem em todo o ciclo de desenvolvimento.

• ES6 e evolução contínua (2015 em diante): O ES6 (ECMAScript 2015) trouxe grandes melhorias de sintaxe e estrutura, seguido por atualizações anuais e pelo crescimento de frameworks modernos (como React, Vue e Angular) e do TypeScript

### Versões do Javascript

• ES1 (1997): Primeira versão padronizada pela norma ECMA-262.

• ES2 (1998): Pequenos ajustes editoriais e alinhamento com normas ISO.

• ES3 (1999): Introduziu expressões regulares, try/catch, do-whilee maior consistência entre navegadores.

• ES4: Proposta abandonada e não lançada devido a divergências técnicas na comunidade.

• ES5 (2009): Adição strict mode , suporte nativo a JSON, getters/setters e métodos de arrays ( map, filter, reduce, etc.).

• ES6 / ES2015 (2015): Maior atualização histórica da linguagem, trazendo lete const, arrow function , classes, Promessas , template literals , desestruturação e módulos nativos.

• Edições anuais (ES2016 em diante): A partir de 2016, cada ano passou a ter sua própria edição (ES2016, ES2017, ES2018... até as edições de 2025 e 2026), adicionando recursos incrementais como async/await, BigInt, encadeamento opcional e novos métodos para arrays , strings e objetos.
### Confiurações de ambiente 

- google chrome = navegador 
- vs code = ide (ambiente intergado de desemvolvimento)
- node js = ambiente de execução de java script fora do navegador 

### Navegador Vs Node 

O javascript pode rodar tanto via servidor ou seja o back end com 
o node e via navegador nativo.

sobre o node é mais simples, apenas crie um documento javascritp com o final js  e depois 
digite o código javascript.

No navegador primeiramente temos que organizar o documento html e a partir dele implementar o javascriscipt, as formas 
de incluir a linguagem no html são: 

- tag script no body do html 
```
<script>
        console.log("Hello, World!")
</script>
```
- link do javascript externo 
```
<script src="scripts/main.js"></script>
```

- em atributos de eventos 
```
<button onclick="alert('Botão clicado!')">Clique aqui</button>
```

algumas coisas que tem no navegador não tem no node, muitas vezes pela forma que ele é representado, como o comando alert que emite um alerta no navegador.


### Comandos básicos

console.log(valor)  - comando de saída (escreva )



### Comentarios em js 

serve pra aviso, alerta, comenta(deixar salvo) o código.

//  pra comentarios em linha   (ctrl k + ctrl c)
/**/ pra comentarios em blocos (alt+ shift +a)
alt + shift + f pra identação automatica do codigo


### Constantes e variaveís

var  - variavél pra escopo ou função global podendo ou não incializar com um valor
(pouco utilizado, pois caiu em desuso por conta de seus problemas como redeclaração de variáveis,)

let - variável pra escopo de bloco que pode ser reatribuida após declaração (limita ao bloco, instrução ou expressão onde é definida )

const - valor que não pode ser redeclarado ou reatribuição, apenas em alguns momentos como array/objetos.

### Problemas do var 

antes vamos entender os valores que podemos receber em caso de erro

1) undefined - indefinido, variável declarada mas sem valor
2) null - sem valor na variável de forma intencional

O mais problema do var á bagunça de redeclaração (declara + valor) e mudança de valor da variável que ela deixa,
o let não permite redeclarar mas permite mudar o valor.

obs: antes do ECMAScript 6 (ES6/ES2015) era tudo var. Var tem problemas de escopo, hosting ou içamento, redeclaração. 

### Regras e convenções ao declarar variavéis

- Regras:

1) (X) Proibido começar com um número 
2) (X) Não pode dar espaço
3) (X) Não pode usar . , - e caracteres especiais 

- Convenção 

1) CamelCase("ex: umaVariavel")
2) Deixe o mais claro possível 

obs: é possível utilzar undeline(_)

redeclaração (usar a palavra chave de declaração ) x retribuição (mudar o valor da variavel)

resumo rápido:
 
1. var ->  evita
2. let -> variável que necessita posteriormente de reatribuição
3. const -> variável constantes, ou seja sem mudança de valor(reatribuição)

* A regra não funciona pra Array ou objetos 

### Palavras reservadas

• Palavras-chave e Literais: Inclui termos estruturais como function, return, if, else, const, let, class, além de literais como null, truee false.

• Futuro / Restritas: Abrangem palavras reservadas em modo estrito ( implements, interface, static, etc.), módulos ( await) e resquícios de especificações antigas ( abstract, byte, goto, etc.)


### Tipos de dados

1. **String (caractere)** =  escrever Aspas Simples ( ') ou Aspas Duplas ( ")é basicamente
a mesma coisa, ou pro meio de crases que permitem  multilinhas sem o caractere de escape \n e inserçõa de variaveis usando a ${expressao}

````
let nome = 'Maria';
let sobrenome = "Silva";

let idade = 20;
let mensagem = `Olá, meu nome é ${nome} 
e eu tenho ${idade} anos.`;

````



Problema: 

* Conflito de Delimitadores (Asppas dentro de aspas)

Se você abrir uma string com um tipo de aspa e tentar usar o mesmo tipo de aspa dentro do texto, o JavaScript achará que uma string terminou antes da hora, gerando um erro de sintaxe.Pra resolver
isso alterne as aspas com as dupla por fora e simples por dentro ou vice versa ou colocar uma (\) ou usar crases

````
let texto = 'O livro 'O Pequeno Príncipe' é clássico.'; // Erro de sintaxe!
````

* Quebras de linha inválidas com Aspas Simples ou Duplas

Se você tentar quebrar uma linha diretamente abertaEnterno teclado usando'ou",o JavaScript gerará um erro.

O problema:
````
let texto = 'Esta string continua
na linha de baixo.'; // SyntaxError: Invalid or unexpected token
````
pra resolver use \n, =(concatenação) ou crases

* Esquecer de fechar uma string

se esquecer de fechar o js entende que tudo o resto debaixo é string

* Confundir Interpolação com Aspas Comuns
 
funciona apenas com crases 

2. **Number** = números inteiros e de pontos flutuantes (todos são armzenados como float )

valores especiais: 

3. **undefined** = variavel declarada mas não recebeu valor, também é o retorno das funções que não retornam nada explicitamente.

4. **null** = null é um valor primitivo que representa explicitamente a ausência de qualquer valor ou objeto. É tipicamente usado para indicar que uma variável intencionalmente não contém nenhum valor. typeof nullRetorna "object", o que é uma peculiaridade conhecida da linguagem desde sua implementação original.

obs: null é intencionalmente vazio, undefined é algo que não foi definido.

5. **boolean** = boolean é um dado lógico que pode ser verdadeiro ou falso


### Operadores em Javascript 

obs: erro classico em javascript e somar uma sting com um number
```
const numero = 1
const numero1 = "50"

console.log(numero + numero1)
```


"+" -> concatenação

#### Operadores aritmeticos

obs: ordem de precedência -> parenteses, ** , * ou / , + e -

"+" Adicção

"-" subtração

"/"divisão

"*" multiplicação

"%" resto da divisão

"**" potência

#### Operadores de atribuição

= -> atribuição

++/-- -> incremento e decremento 

"+= x ou += variavel" soma valor predeterminado, funciona também pra decremento,
multiplicação,divisão,resto e potencia 

#### Operadores de comparação

Servem pra nos devolver os dados verdadeiro ou falso.
````
> maior  que
< menor que
>= maior ou igual a
<= Menor ou igual a
== igualdade 
!= diferente de 
=== igualdade de valor é tipo (igualdade estrita )
````

obs:  a igualdade == não é usada mais pois ela compara apenas o número e não o tipo também 

#### Operadores lógicos 

complementam os operadores de comparações (intersectam)

&& and (E) - os dois tem que ser verdadeiros 
|| or (ou) - um dos dois tem que ser verdadeiro
! not (não) - inversão de valor 

#### Outros operadores

1. operador de coalescência nula(??) 

define um valor padrão caso uma varaivável seja nula, no caso ele mostra  um valor se o dado for null ou undefined e se nao for esse valor ele mostra o dado,
bastante usado pra preservar  0 ou falso , não serve pra valores nan ," "

````
let saldoBancario   // undefined

console.log(saldoBancario ??  "Carregando Dados ... ")
/* 
saldoBancario = 0

console.log(saldoBancario ?? "Carregando Dados ... ") */

// vai mostrar carregando dados pois o valor da variavel é undefined inves de 0 ou false 
````
2. Operador de negação dupla(!!)

converte qualquer valor pra um booleano explicito.

````
// Valores truthy viram true
!!"texto"      // true
!!10           // true
!!{}           // true (objetos vazios são truthy)
!![]           // true (arrays vazios são truthy)

// Valores falsy viram false
!!""           // false (string vazia)
!!0            // false
!!null         // false
!!undefined    // false
!!NaN          // false

````

### Avaliação de curto circuito (short - circuit evaluation)

Avaliação de curto -circuito é uma estratégia de execução na qual o segundo argumento de um operador lógico só é avaliado se o primeiro argumento não for suficiente para determinar o valor final da expressão.

exemplo com &&  que ele para na hora se a primeira for falsa.

`console.log(true && console.log("Não passou aqui") )` - retorno undefined pois o console.log nao tem valor lógico 

exemplo com ||  que qualquer coisa vailda ele pega o valor e ignora o resto.

```
let nomeDigitado = ""; // O usuário deixou o campo em branco (vazio = falso)

// Como o nome está vazio, o JS pula para a segunda opção e usa "Visitante".
let nomeFinal = nomeDigitado || "Visitante";

console.log(nomeFinal); // Mostra: "Visitante"
```
de forma simples o e o padrao e false e o ou o padrao e true

vale resaltar que os valores  que são falsos porém não booleanas podem acontecer chamados popularmente de falsy, esses dados são:

* 0 
* "" ou ''
* null
* undefined - não deve proporcionamente ser usado
* Nan

### Conversões de Tipos 

1. Conversão de tipo explícita 

A conversão de tipo significa transferir dados de um tipo de dados para outro, especificando explicitamente o tipo para o qual os dados devem ser convertidos. A conversão explícita de tipo geralmente é feita para tornar os dados compatíveis com outras variáveis. 

metodos de conversão são: 

1.1 - parseInt()/parseFloat -  é uma função JavaScript integrada que converte um valor em uma string e o analisa como um número inteiro (ou decimal NaN) em uma base numérica ( radix ) especificada, se for tipo float faz isso pro tipo float

````
const num1 = 10
const num2 = parseInt("5")

console.log(typeof num2, num2)
console.log(num1 + num2)

// resultado  ->  number 5 e 15 
````

outros menos usados e colocar o tipo de dado antes do valor da variavel como number ou + .


### Estrutura condicionais em JS

1. IF and ELSE (se e senao)

````

if(condicao) {
    //condicao quando verdadeira
} else{
    // condicao quando falsa 
}

````

2.  Operadore ternário

````
condição ? valor verdadeiro : valor falso 
````

3. Switch case

````
switch(variavel) {
    case 1:
        //valor
    break;    
    case 2:
        //valor
        break;
    case 3:
        //valor
        break;
    case 4:
        //valor
        break;
    break;
    case 5:
        //valor
    break;
    default: 
        //valor
    break;
    }    
````

### Estruturas de repetição em JS

1. for 
````
for (inicialização, condicao, incremento) {
  // condição executada a cada interação
}

obs: inicialização nao precisa ser necessariamente no paramentro, mas quando temos uma varivael  apenas pro laço colocamos o i dentro do 
parametro apenas por questões de boas práticas na programação

obs: tem que tomar cuidado pra não criar um loop infinito

outra forma e colocar o metodo length que pega todo  o tamanho da variavel, muito usado pra array 
````

2. For in 
````
propeidade de repetição pra percorrer propriedades de  um objeto

for(let chave in objeto){
    // codigo a ser  executado para cada propriedade
}

````




































