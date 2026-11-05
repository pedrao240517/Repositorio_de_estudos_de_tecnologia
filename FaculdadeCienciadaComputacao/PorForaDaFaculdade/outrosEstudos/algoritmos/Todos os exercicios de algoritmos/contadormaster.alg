algoritmo "contador master"
var
      salto,valor,contador:inteiro
inicio
      contador <- 0
      Escreval("Quer contar até quanto? ")
      Leia(valor)
      Escreval("Qual será o valor do salto? ")
      Leia(salto)
      Enquanto (contador <= valor) faca
            Escreval(contador)
            contador <- contador + salto   // Execute com timer
      Fimenquanto
      Escreval("Terminei de contar. ")
fimalgoritmo
