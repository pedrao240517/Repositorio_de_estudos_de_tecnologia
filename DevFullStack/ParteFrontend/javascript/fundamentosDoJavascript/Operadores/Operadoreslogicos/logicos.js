const contaBancaria = 30
const vontadeSorvete = false
const precoSorvete = 5
const comprar = contaBancaria > 0 && vontadeSorvete === true && contaBancaria >= precoSorvete


console.log("Vou conseguir comprar o sorvete: "+comprar)

const contasalario = 10
const vontadeCinema = false
const ingresso = 5 
const ingressoGratis= true
const cinema = contasalario >  0 &&  vontadeCinema === true && contasalario >= ingresso || ingressoGratis ===true

console.log("Vou conseguir assitir cinema: "+cinema)

console.log(!true)