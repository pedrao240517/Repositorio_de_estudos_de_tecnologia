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

//  pra comentarios em linha 
/**/ pra comentarios em blocos (alt+ shift +a)


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




