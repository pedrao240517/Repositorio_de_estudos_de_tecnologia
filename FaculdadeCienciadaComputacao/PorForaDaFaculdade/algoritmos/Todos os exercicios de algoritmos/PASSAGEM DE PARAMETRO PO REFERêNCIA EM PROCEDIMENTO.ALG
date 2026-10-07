algoritmo "passagem de parametro po referência em procedimento"
var
   X, Y:inteiro
Procedimento soma(var A, B: inteiro)
Inicio
      A <- A + 1
      B <- B + 2
      Escreval("Valor de A = ", A)
      Escreval("Valor de B = ", B)
      Escreval("A soma de A + B = ", A + B)
fimprocedimento
inicio
      X <- 4
      Y <- 8
      Soma(X,Y)
      Escreval("Valor de X = ", X)
      Escreval("Valor de Y = ", Y)
fimalgoritmo