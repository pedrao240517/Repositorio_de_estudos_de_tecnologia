# JavaScript

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
