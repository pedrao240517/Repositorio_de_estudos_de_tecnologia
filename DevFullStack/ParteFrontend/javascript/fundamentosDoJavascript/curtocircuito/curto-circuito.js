/* console.log(true && console.log("Não passou aqui") )  */



const usuario = "Joao"
let estaAutenticado = true
let isAdmin = true 
let saldoBancario  // undefined

console.log( estaAutenticado && isAdmin && `${usuario} pode ter acesso a aplicação`)

console.log(saldoBancario|| "Carregando Dados ... ")
saldoBancario = 0

console.log(saldoBancario || `O seu saldo ${saldoBancario} `)
