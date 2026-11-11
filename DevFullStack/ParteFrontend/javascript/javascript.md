# JavaScript

### Sobre o Javascript

Javascript foi criado pra dar vida as páginas web, se iniciu com o nome livescript mas por conta da popularidade do java na época 
ele decidiu qe seria mais vantajoso se tornar "o imão mais novo" do java 

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





