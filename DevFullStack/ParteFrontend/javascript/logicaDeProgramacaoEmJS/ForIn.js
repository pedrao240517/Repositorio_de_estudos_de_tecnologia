// let armario = {
//     gavetaSuperior: "Meias",
//     gavetaInferior: "Camisetas",
//     prateleiraPrincipal: "shorts",
//     prateleiralateral: "Calças"
// }

// // percorrer ou interar o objeto

// for (let compartimento in armario) {
//    console.log(`No compartimento ${compartimento}, estão guardada as: ${armario[compartimento]}`)
// }
//---------------------------------------------------------------
// let usuarios =  {
//     usuario1: {
//         nome: "Paulo",
//         idade: 28,
//         endereco: { cidade: "Cuiabá" , estado: "Mato Grosso" }
//     },
//     usuario2: {
//         nome: "Marcos",
//         idade: 15,
//         endereco: { cidade: "Cuiabá" , estado: "Mato Grosso" }
//     },
//      usuario3: {
//         nome: "Bruno",
//         idade: 35,
//         endereco: { cidade: "Porto Alegre" , estado: "Rio grande do sul" }
//     },
// }

// console.log(usuarios.usuario1.endereco.cidade)


// for(let id in usuarios){
//     let usuario = usuarios[id];  //usuario["Usuario1"] e etc
//      console.log(`O Usuário ${usuario.nome} tem ${usuario.idade} anos e mora em ${usuario.endereco.cidade} no ${usuario.endereco.estado} `)
//  }

//--------------------------------------------------------------------
let pedidos = [
    { id: 101, cliente: "Lucas", total: 500.00 },
    { id: 102, cliente: "Pedro", total: 300.00 },
]

for(let i in pedidos){
    console.log(`Pedido #${pedidos[i].id}`)
    for(let chave  in  pedidos[i]){
        console.log(`${chave}: ${pedidos[i][chave]}`)
    }
    console.log("-----------------------------")
}