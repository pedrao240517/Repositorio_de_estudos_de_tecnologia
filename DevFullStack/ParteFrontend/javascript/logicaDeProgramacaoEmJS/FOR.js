for (let i = 1  ; i <= 5; i++ ){
    console.log(i)
}
console.log("Terminou")


let produtos = [
    { nome: "Camiseta", preco: 29.90},
    { nome: "Calça-Jeans", preco: 19.90},
    { nome: "Vestido", preco: 39.90},
    { nome: "Short", preco: 49.90},
    { nome: "moletom", preco: 59.90},
    { nome: "sapato", preco: 99.90},
]

for(let i = 0 ; i < produtos.length; i++){
    console.log(`O produto ${produtos[i].nome} custa R$ ${produtos[i].preco}`)
}