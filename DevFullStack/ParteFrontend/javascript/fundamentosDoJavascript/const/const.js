let exemplo = "exemplo";
/* exemplo = "reatribuição"; 

console.log(exemplo); */
// const usamos quando nãomqueremos reatribuir valor a variável
// Não funciona assim pra objetos 
const pessoa = { nome: "Ana", idade: 17};
pessoa.nome = "João";

console.log("pessoa: ", pessoa);
console.log("pessoa: " ,pessoa.nome);

// Não é assim pra vetores(arrays) 

const numeros =[1, 2, 3];
console.log(numeros)
numeros.push(4);
console.log(numeros);